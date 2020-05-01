package chapter5;

import chapter2.AskUserForInput;

import java.io.*;
import java.util.Scanner;

public class HelpfulMethodsForFileIO {

    /**
     * returns a Scanner object equipped to read from a specific,
     * pre-existing, file.
     * @param filePath
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static Scanner
    returnScannerToReadFromSpecifiedFile(String filePath)
    throws FileNotFoundException, IOException{
        // We create a File object to reference the path of the file
        File theFile = new File(filePath);

        // If the file to be read does not exist,
        // the program will terminate.
        doesTheFileExist(theFile);

        // Now we return a new Scanner object equipped to
        // read data from the specified file.
        return new Scanner(theFile);
    }

    /**
     * returns a PrintWriter object equipped to append data to a specific,
     * pre-existing file.
     * @param filePath
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static PrintWriter
    appendToExistingFile(String filePath)
            throws FileNotFoundException, IOException {

        // We create a File object to reference the path of the file
        File theFile = new File(filePath);

        // If the file to be appended does not exist,
        // the program will terminate.
        doesTheFileExist(theFile);

        // We will now pass the object referencing the file
        // to a FileWriter object.
        FileWriter fileWriterObject = new FileWriter(theFile, true);

        // We pass the FileWriter object to the PrintWriter object
        // The method now returns a PrintWriter object ready to append
        // data to the specified file passed in the method parameter.
        return new PrintWriter(fileWriterObject);
    }

    /**
     * returns a PrintWriter object equipped only to create and write to a
     * new file in a specified directory.
     * @param dirPath
     * @param newFileName
     * @return
     * @throws FileNotFoundException
     */
    public static PrintWriter
    createNewFileAndWriteToIt(String dirPath, String newFileName)
            throws FileNotFoundException {

        //We create a file object to reference the directory
        File theDirectory = new File(dirPath);
        //If the directory does not exist the program will terminate.
        doesTheDirectoryExist(theDirectory);

        // We create a File object to reference the name of the file
        // and its location(the directory path).
        File theFile = new File(dirPath, newFileName);

        // If the file already exists, the user will be alerted and asked
        // if they want to continue.
        // If they want to continue, the previous file will be erased and a new
        // file will be created.
        // If they do not want to continue, the program will terminate.
        doesTheFileAlreadyExist(theFile);

        // a PrintWriter object is returned ready to write to the newly created file.
        return new PrintWriter(theFile);
    }

    /**
     * checks if the file exists or not.
     * Terminates the program if it does not exist.
     * @param theFile
     */
    public static void doesTheFileExist(File theFile){
        if (!theFile.exists()) {
            System.out.println("The specified file does not exist.");
            System.out.println("Pressing enter will now terminate the program.");
            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();
            System.exit(0);
        }
    }

    /**
     * checks if the directory path exists or not.
     * Terminates the program if it does not exist.
     * @param theDirectory
     */
    public static void doesTheDirectoryExist(File theDirectory) {
        if(!theDirectory.exists()) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("The specified directory does not exist.");
            System.out.println("The program will now terminate after pressing enter.");
            keyboard.nextLine();
            System.exit(0);
        }
    }

    /**
     * alerts the user to the file path already being in existence.
     * Asks the user whether or not to proceed with replacing the file.
     * If they do not want to proceed, the program will terminate.
     * If they do want to proceed, the pre-existing file will be replaced.
     * @param theFile
     */
    public static void doesTheFileAlreadyExist(File theFile) {

        if(theFile.exists()) {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("The File you specified already exists.");
            System.out.println("Continuing will delete the previous file and replace" +
                    " it with the new file.");
            boolean response =
                    AskUserForInput.askUserYesOrNo(
                            "Would you like to continue?");
            if (!response) {
                System.out.println("You do not wish to continue");
                System.out.println("The program will now terminate after pressing enter");
                keyboard.nextLine();
                System.exit(0);
            }
        }
    }
}
