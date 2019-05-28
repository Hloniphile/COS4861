 package cos4861;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chatbot {
    public static void Eliza(String enteredString) {
        String[] listString = {"YOU ARE", "YOU", "YOUR", "YOU ARE (depressed|sad) ",
            "I AM SORRY TO HEAR YOU ARE", "YOU ARE (depressed|sad) ", "WHY DO YOU THINK YOU ARE",
            "IN WHAT WAY", "CAN YOU THINK OF A SPECIFIC EXAMPLE", "SAY THANK YOU TO YOUR GOD"};
        String[] regex = {"\b i am", "\b(i|me)\b", "\b(my)\b", "\b(well,?) ", ".* YOU ARE (depressed|sad) .*",
            ".* all .*", ".* always .*", "[%s]", "\b .*", ".*"};

        System.out.println("Entered  string on Eliza method : " + enteredString.toUpperCase());
        String responseBack = "";
        int lenght = listString.length;
        int regexLenght = regex.length; 
        for (int i = 1; i <= lenght; i++) {
            for (int j = 0; j <= regexLenght; j++) {
                Pattern regexMatchTest = Pattern.compile(regex[j]);
                Matcher matchedString = regexMatchTest.matcher(enteredString);
                if (matchedString.find()) {
                    System.out.println("MATCHED");
                    responseBack = listString[i].toUpperCase();
                    System.out.println(">>" + responseBack);
                } else {
                    System.out.println("NOT MATCHED");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner in = new Scanner(System.in);
        String firstWord = in.nextLine();
        System.out.println("** " + firstWord.toUpperCase());
        Eliza(firstWord);
    }
}
