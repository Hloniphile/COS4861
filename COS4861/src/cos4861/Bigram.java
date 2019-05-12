/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos4861;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hlonie
 */
public class Bigram {
    
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        String longCorpara = "I am simple string to test the code written in Java programming language."
                + "My mother is originally from South African and I, we were both born in South Africa."
                + "South Africa is the beautiful country where most people "
                + "would love to live for the rest of their lives if there was no goverment regulating "
                + "people entering the country. The minimum corpara is said to be 800-1000 for this question to test "
                + "if the program work as expected. ";
        
        ArrayList<String> bigrams = new ArrayList<String>();
        StringTokenizer iteration = new StringTokenizer(longCorpara);
        if(iteration.countTokens() > 1)
        {
            System.out.println("String corpora size : " + iteration.countTokens());
            String firstString = "";
            String secondString = "";
            String thirdString = "";
            while (iteration.hasMoreTokens())
            {
                if(firstString.isEmpty())
                    firstString = iteration.nextToken();
                secondString = iteration.nextToken();
                thirdString = firstString + " " + secondString;
                bigrams.add(thirdString);
                firstString = secondString;
                secondString = "";
            }

        }
        else
            System.out.println("Tokens is 1 or 0");
        int i = 0;
        while (i < bigrams.size()) 
    {
            System.out.println(bigrams.get(i));
            i++;
        }
    }
}
