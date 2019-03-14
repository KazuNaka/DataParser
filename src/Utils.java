import org.omg.PortableInterceptor.INACTIVE;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResult (String data) {
        String[] datalines = data.split("\n");
        ArrayList<ElectionResult> results = new ArrayList<ElectionResult>(datalines.length);

        for (int i = 1; i < datalines.length; i++) {

            datalines[i] = removecomma(datalines[i]);

            String[] dataset = datalines[i].split(",");
            double votes_dem = Double.parseDouble(dataset[1]);
            double votes_gop = Double.parseDouble(dataset[2]);
            double total_votes = Double.parseDouble(dataset[3]);
            double per_dem = Double.parseDouble(dataset[4]);
            double per_gop = Double.parseDouble(dataset[5]);
            int diff = Integer.parseInt(dataset[6]);
            String per_point_diff = dataset[7];
            String state_abbr = dataset[8];
            String country_name = dataset[9];
            int combined_fip = Integer.parseInt(dataset[10]);
            results.add(new ElectionResult(votes_dem, votes_gop,total_votes, per_dem, per_gop, diff, per_point_diff, state_abbr, country_name, combined_fip));

        }

        return results;
    }

    public static ArrayList<Education2016> parse2016EducationResult(String data){
        String[] datalines = data.split("\n");
        ArrayList<Education2016> result = new ArrayList<Education2016>();
        for (int i = 5; i < 3288; i++) {
            datalines[i] = removecomma(datalines[i]);
            String[] dataset = datalines[i].split(",");

            double noHighSchool = Double.parseDouble(dataset[dataset.length - 8]);
            double OnlyHighSchool = Double.parseDouble(dataset[dataset.length - 7]);
            double someCollege = Double.parseDouble(dataset[dataset.length - 6]);
            double bachelorsOrMore = Double.parseDouble(dataset[dataset.length - 5]);

            result.add(new Education2016(noHighSchool, OnlyHighSchool, someCollege, bachelorsOrMore));
        }
        return result;
    }

    public static ArrayList<Employment2016> parse2016EmploymentResult(String unemploymentdata) {
        String[] datalines = unemploymentdata.split("\n");
        ArrayList<Employment2016> results = new ArrayList<Employment2016>();


        for (int i = 8; i < datalines.length; i++) {
            datalines[i] = removecommaandspace(datalines[i]);
            datalines[i] = addzerobtwcomma(datalines[i]);
            System.out.println(datalines[i]);
            String[] dataset = datalines[i].split(",");

            int totalLaborForce = Integer.parseInt(dataset[dataset.length - 10]);
            int employedLaborForce = Integer.parseInt(dataset[dataset.length - 9]);
            int unemployedLaborForce = Integer.parseInt(dataset[dataset.length - 8]);
            double unemployedPercent = Double.parseDouble(dataset[dataset.length - 7]);


            results.add(new Employment2016(totalLaborForce, employedLaborForce, unemployedLaborForce, unemployedPercent));
        }


        return results;
    }

    private static String addzerobtwcomma(String dataline) {
        int index1 = 0;
        String temp;
        for (int i = 0; i < dataline.length() - 3; i++) {
             temp = dataline.substring(i, i + 2);
             if(temp.equals(",,")){
                 temp = ",0,";
                 dataline = dataline.substring(0, i) + temp + dataline.substring(i + 2, dataline.length());
             }

             i++;
        }
        return dataline;
    }

    private static String removecommaandspace(String dataline) {
        int index1 = dataline.indexOf("\"");
        int index2 = dataline.indexOf("\"", index1 + 1);
        int comindex1, comindex2, comindex3;
        String temp;

        while (index1 >= 0 && index2 >= 0) {
            temp = dataline.substring(index1, index2 + 1);
            temp = temp.replaceAll(",", " ");
            temp = temp.replaceAll("\"", " ");

            dataline = dataline.substring(0, index1) + temp + dataline.substring(index2 + 1, dataline.length());
            index1 = dataline.indexOf("\"", index2 + 1);
            index2 = dataline.indexOf("\"", index1 + 1);
        }
        comindex1 = dataline.indexOf(",");
        comindex2 = dataline.indexOf("," , comindex1 + 1);
        comindex3 = dataline.indexOf(",", comindex2 + 1);
        dataline = dataline.substring(0, comindex3) + dataline.substring(comindex3 ,dataline.length()).replaceAll(" ", "").replaceAll("\t", "");
        return dataline;

    }

    private static String removecomma(String dataline) {
        int index1 = dataline.indexOf("\"");
        int index2 = dataline.indexOf("\"", index1 + 1);
        String temp;

        while (index1 >= 0 && index2 >= 0) {
            temp = dataline.substring(index1, index2 + 1);
            temp = temp.replaceAll(",", " ");
            temp = temp.replaceAll("\"", " ");

            dataline = dataline.substring(0, index1) + temp + dataline.substring(index2 + 1, dataline.length());
            index1 = dataline.indexOf("\"", index2 + 1);
            index2 = dataline.indexOf("\"", index1 + 1);
        }
        dataline = dataline.replaceAll(" ", "");
        return dataline;

    }


    public static DataManager generateDataManager(String presidentialdata, String educationdata, String unemploymentdata) {

        return null;
    }


    public static ArrayList<County> generateCounties(String presidentialdata, String educationdata, String unemploymentdata) {

        return null;
    }
}
