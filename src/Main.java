import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author  Kazuya Nakashima
 */
public class Main {
    public static void main(String[] args) {
        // Test of Utils

        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");

        ArrayList<ElectionResult> results = Utils.parse2016ElectionResult(data);
        System.out.println(results.toString());

    }
}
