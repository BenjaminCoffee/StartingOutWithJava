package Chapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestingFileIOMethods {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {

        //Create a new file and write to it.
        PrintWriter createAndWriteToTestDotTxt =
                HelpfulMethodsForFileIO.createNewFileAndWriteToIt
                ("C:\\Users\\benja\\IdeaProjects" +
                                "\\StartingOutWithJava\\TextFiles\\Chapter5",
                        "test.txt");
        createAndWriteToTestDotTxt.println("What up?");
        createAndWriteToTestDotTxt.close();

        //Append data to an already existing file.
        PrintWriter appendToTestingFileAppendingMethodDotTxt =
                HelpfulMethodsForFileIO.appendToExistingFile(
                        "C:\\Users\\benja\\IdeaProjects" +
                                "\\StartingOutWithJava\\TextFiles\\Chapter5" +
                                "\\testingFileAppendingMethod");
        appendToTestingFileAppendingMethodDotTxt.println("This line should" +
                " be appended to the bottom.");
        appendToTestingFileAppendingMethodDotTxt.close();

        // Read from the file specified by its path passed in the
        // method parameter.
        Scanner readFromFile =
                HelpfulMethodsForFileIO.
                        returnScannerToReadFromSpecifiedFile(
                                "C:\\Users\\benja\\IdeaProjects" +
                                        "\\StartingOutWithJava\\TextFiles" +
                                        "\\Chapter5\\numberList.txt");
        System.out.println(readFromFile.nextLine());
    }
}
