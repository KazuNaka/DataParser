import javax.rmi.CORBA.Util;
import javax.xml.crypto.Data;
import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author  Kazuya Nakashima
 */
public class Main {
    public static void main(String[] args) {
        // Test of Utils

        String Presidentialdata = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        String Educationdata = Utils.readFileAsString("data/Education.csv");
        String Unemploymentdata = Utils.readFileAsString("data/Unemployment.csv");

        ArrayList<ElectionResult> Presidentialresults = Utils.parse2016ElectionResult(Presidentialdata);
        ArrayList<Education2016> EducationResults = Utils.parse2016EducationResult(Educationdata);
        ArrayList<Employment2016> EmploymentResults = Utils.parse2016EmploymentResult(Unemploymentdata);
        ArrayList<County> counties = Utils.generateCounties(Presidentialdata, Educationdata, Unemploymentdata);
        DataManager datamanager = Utils.generateDataManager(Presidentialdata, Educationdata, Unemploymentdata);

    }


}
