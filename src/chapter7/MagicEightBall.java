package chapter7;

import chapter5.HelpfulMethodsForFileIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicEightBall {
    String[] responses;

    public MagicEightBall() throws IOException {
        inputResponses();;
    }

    public void inputResponses() throws IOException {
        ArrayList<String> var1 = parseFromFile();

        String[] sentence = new String[var1.size()];
        String[] strArr = var1.toArray(new String[var1.size()]);
        int indicesNeededForResponses = 0;

        for (int r = 0; r < strArr.length; r++) {
            sentence = strArr[r].split("(?<=[.!?])\\s*");
            for (int i = 0; i < sentence.length; i++) {
                indicesNeededForResponses++;
            }
        }
        int startScan = 0;
        int count = 0;
        responses = new String[indicesNeededForResponses];

        for (int r = 0; r < strArr.length; r++) {
            sentence = strArr[r].split("(?<=[.!?])\\s*");
            for (int i = 0; i < sentence.length; i++) {
                //System.out.println(sentence[i]);
                responses[startScan] = sentence[i];
                startScan = i;
            }
        }

        for (int i = 0; i < responses.length; i++) {
            System.out.println(responses[i]);
        }

    }

    public ArrayList<String> parseFromFile() throws IOException {
        Scanner inFile =
                HelpfulMethodsForFileIO.returnScannerToReadFromSpecifiedFile(
                        "chapterSpecificFiles/chapter7/8_ball_responses"
                );
        ArrayList<String> tempArray = new ArrayList<>();

        while (inFile.hasNextLine()) {
            tempArray.add(inFile.nextLine());
        }
        inFile.close();
        return tempArray;
    }
}
