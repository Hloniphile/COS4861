package cos4861;
import cos4861.Soundex;
import cos4861.MinimumDistance; 
import java.util.Scanner;

public class COS4861 {

    public static void main(String[] args) {
        // Soundex Algorithm Question 2:
        System.out.println("========= Soundex Algorithm Question 2 ==============");
         String[] names = {"Darwin, Ian","Davidson, Greg","Darwent, William","Derwin, Daemon"};
         for (int i = 0; i< names.length; i++){
           System.out.println(Soundex.soundex(names[i]) + ' ' + names[i]);
         }
         // Minimum Distance Question 3 (3.2):
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word\n");
        String firstWord = in.nextLine();
        System.out.println("Enter second word\n");
        String secondWord = in.nextLine();
       
        System.out.println("========= Minimum Distance Question 3 (3.2) ==============");
        int minimumDistance = MinimumDistance.minDistance(firstWord, secondWord);
        System.out.println("Here is the min distance " + minimumDistance); 
    }
}
