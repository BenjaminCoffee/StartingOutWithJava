package Chapter5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonalWebPageGeneratorDriver {
    public static void main(String[] args) throws
            FileNotFoundException, IOException {
        PersonalWebPageGenerator webPage0 = new PersonalWebPageGenerator();
        //webPage0.storeInfo();
        //webPage0.storeName();

        webPage0.setName("Benji");
        webPage0.setInfo("A goober with wild hopes and dreams.");
        webPage0.createAndWriteToNewHTMLFile();
    }
}
