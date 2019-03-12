import org.omg.PortableInterceptor.INACTIVE;

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
        int index2 = -1;




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
        for (int i = 5; i < 3289; i++) {
            datalines[i] = removecomma(datalines[i]);
            String[] dataset = datalines[i].split(",");


        }




        return result;
    }

    private static String removecomma(String dataline) {
        int index1 = dataline.indexOf("\"");
        int index2 = dataline.indexOf("\"", index1 + 1);
        String temp;

        while (index1 >= 0 && index2 >= 0) {
            temp = dataline.substring(index1, index2 + 1);
            temp = temp.replaceAll("," , " ");
            temp = temp.replaceAll("\"", " ");

            dataline = dataline.substring(0, index1) + temp + dataline.substring(index2 + 1, dataline.length()) ;
            index1 = dataline.indexOf("\"", index2 + 1 );
            index2 = dataline.indexOf("\"", index1 + 1 );
        }
        dataline = dataline.replaceAll(" ", "");
        return dataline;
    }

//    private static void removecomma(String[] datalines, int i, int index2) {
//        for (int j = 0; j < datalines[i].length(); j++) {
//            int index1 = datalines[i].indexOf("\"", index2 + 1);
//            index2 = datalines[i].indexOf("\"", index1 + 1);
//            if(index1 != -1 && index2 != -1) {
//                String temp = datalines[i].substring(index1, index2 + 1);
//                temp = temp.replace(",", "");
//                temp = temp.replace("\"", "");
//                datalines[i] = datalines[i].substring(0,index1) + temp + datalines[i].substring(index2 + 1, datalines[i].length());
//
//            }
//
//
//        }
//    }
}
