package Step4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try{
                System.out.print("Writing to file ... ");
                // Create the file to write to
                PrintWriter fileOut = new PrintWriter("output.txt");
                // Write text just like we would to the console
                fileOut.println("Hello ");
                // Clode out file
                fileOut.close();

                System.out.println("Done!");

                // Read in file to verify it
                Scanner fileIn = new Scanner(new File("/Users/angelina/Desktop/Projects/FileIOJava/Step4/output.txt"));

                System.out.println("Reading from file ... ");
                while (fileIn.hasNext())
                {
                    String lineIn = fileIn.nextLine();
                    System.out.println(lineIn);
                }
                System.out.println("Done!");
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                Scanner fileIn = new Scanner(new File("/Users/angelina/Desktop/Projects/FileIOJava/Step4/input.txt"));
                int sum = 0;
                while (fileIn.hasNext())
                {
                    // Reads the entire line as a string
                    String lineIn = fileIn.nextLine();
                    // Split the line into a String array
                    String[] input = lineIn.split(",");

                    for (int i = 0; i < input.length; i ++) {
                        sum += Integer.parseInt(input[i]);
                    }
                    System.out.println(sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }

}