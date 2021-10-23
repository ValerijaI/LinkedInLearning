package designPatterns.behavior.chainOfResponsibility.lesson;

public class SlideshowHandler extends DocumentHandler {

    public SlideshowHandler(DocumentHandler handler) {
        super(handler);
    }

    void openDocument(String fileExtension) {
        if (fileExtension == "ppt") {
            System.out.println("Opening presentation...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
