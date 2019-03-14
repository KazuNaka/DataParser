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

//        ArrayList<ElectionResult> Presidentialresults = Utils.parse2016ElectionResult(Presidentialdata);
        ArrayList<Education2016> EducationResults = Utils.parseEducation(Educationdata);

    }
}
