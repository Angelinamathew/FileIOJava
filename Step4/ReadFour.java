package Step4;

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
                PrintWriter fileOut = new PrintWriter("/Users/angelina/Desktop/Projects/FileIOJava/Step4/input.txt");
                // Write text just like we would to the console
                fileOut.println("Hello ");
                // Clode out file
                fileOut.close();

                System.out.println("Done!");

                // Read in file to verify it
                Scanner fileIn = new Scanner(new File("/Users/angelina/Desktop/Projects/FileIOJava/Step4/input.txt"));

                System.out.println("Reading from file ... ");
                while (fileIn.hasNext())
                {
                    String lineIn = fileIn.nextLine();
                    System.out.println(lineIn);
                }
                System.out.println("Done!");
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}