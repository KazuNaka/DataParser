import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author  Kazuya Nakashima
 */
public class Main {
    public static void main(String[] args) {
        // Test of Utils

        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        String Educationdata = Utils.readFileAsString("data/Education.csv");

//        ArrayList<ElectionResult> results = Utils.parse2016ElectionResult(data);
        ArrayList<Education2016> results = Utils.parse2016EducationResult(Educationdata);

//        System.out.println(results.toString());


    }
}
