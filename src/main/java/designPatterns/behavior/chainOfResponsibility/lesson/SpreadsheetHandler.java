package designPatterns.behavior.chainOfResponsibility.lesson;

public class SpreadsheetHandler extends DocumentHandler {

    public SpreadsheetHandler(DocumentHandler next) {
        super(next);
    }

    void openDocument(String fileExtension) {
        if (fileExtension == "xls") {
            System.out.println("Opening excel...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
