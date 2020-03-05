package Chapter5;

import Chapter2.AskUserForInput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PersonalWebPageGenerator {
    private String info;
    private String name;

    public void createAndWriteToNewHTMLFile()
            throws IOException, FileNotFoundException {

        // create a PrintWriter object capable of creating
        // and writing to a new html file in 'TextFiles' > 'Chapter5'.
        PrintWriter toFile = HelpfulMethodsForFileIO.createNewFileAndWriteToIt(
                "C:\\Users\\benja\\IdeaProjects\\" +
                        "StartingOutWithJava\\ChapterSpecificFiles\\Chapter5",
                "personalWebPage.html"
        );

        // pass the html template string to the print method.
        toFile.print(htmlTemplate());
        // we must close the PrintWriter object for anything to work.
        toFile.close();
    }

    public String htmlTemplate() {
        StringBuilder str = new StringBuilder();

        str.append("<html>\n");
        str.append("<head>\n");
        str.append("</head>\n");
        str.append("<body>\n");
        str.append("<center>\n");
        str.append("<h1>\n");

        // append the name after the h1 tag.
        str.append(getName());

        str.append("</h1>\n");
        str.append("</center>\n");
        str.append("</center>\n");
        str.append("<hr />\n");

        //append the personal info after the hr tag.
        str.append(getInfo());

        str.append("<hr />\n");
        str.append("</body>\n");
        str.append("</html>\n");

        return str.toString();
    }

    public void storeName() {
        setName(askForName());
    }
    public void storeInfo() {
        // ask for and receive the personal info from the user.
        setInfo(askForInfo());
    }
    public String askForName() {
        return AskUserForInput.askUserForString(
                "Please enter your name: "
        );
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String askForInfo() {
        return AskUserForInput.askUserForString(
                "Describe yourself in one sentence.");
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
