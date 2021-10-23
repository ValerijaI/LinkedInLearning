package designPatterns.behavior.chainOfResponsibility.lesson;

public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    void openDocument(String fileExtension) {
        if (fileExtension == "txt") {
            System.out.println("Opening word...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
