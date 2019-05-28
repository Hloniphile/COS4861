
package cos4861;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class NGrams {

    private static final int RANDOM_SEED = 1234;
    // like a die, generates a series of random numbers
    private static final Random ourGenerator = new Random(RANDOM_SEED);

    // chooser allows users to select a file by navigating through
    // directories
    private static JFileChooser ourChooser = new JFileChooser(System
            .getProperties().getProperty("user.dir"));

    /**
     * Brings up chooser for user to select a file
     * @return Scanner for user selected file, null if file not found
     */
    public static Scanner getScanner() {

        int retval = ourChooser.showOpenDialog(null);

        if (retval == JFileChooser.APPROVE_OPTION) {
            File f = ourChooser.getSelectedFile();
            Scanner s;
            try {
                s = new Scanner(f);
            } catch (FileNotFoundException e) {
                return null;
            }
            return s;
        }
        return null;
    }

    /**
     * Read a file into a string and return returns a string containing all of the text in the file
     */
    public String readFile(Scanner input) {
        return input.useDelimiter("\\Z").next();
    }

    public String makeNGram(String referenceText, int ngram, int numLetters) {
        String predictor = getRandomSubstring(referenceText, ngram);
        String result = "";

        for (int k = 0; k < numLetters; k += 1) {
            // get all characters that immediately follow predictor
            // pick one character randomly and update predictor
        }

        return result;
    }

    /**
     * Choose a random substring of the given string.
     *
     * @requires subSize <= s.length()
     * @retu
     * rn random substring of s whose length is subSize
     */
    public String getRandomSubstring(String s, int subSize) {
        // TODO: choose random substring from s
        return s.substring(0, subSize);
    }
     public String getFollowingCharacters(String s, String toFind) {
        String result = "";

        // TODO: get each character following toFind in s and add to result
        return result;
    }

    /**
     * Main to be used for testing
     */
    public static void main(String[] args) {
        final int RANDOM_TEXT_LENGTH = 256;
        NGrams model = new NGrams();
        String input = JOptionPane.showInputDialog("Enter N:", "");
        int n = Integer.parseInt(input);
        String referenceText = model.readFile(getScanner());
        /*generate random text to varying degrees of accuracy */
        for (int k = 0; k <= n; k++) {
            System.out.println("--------");
        }
    }

}
