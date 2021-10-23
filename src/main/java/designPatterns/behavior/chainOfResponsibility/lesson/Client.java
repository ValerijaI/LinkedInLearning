package designPatterns.behavior.chainOfResponsibility.lesson;

public class Client {

    public static void main(String[] args) {

        DocumentHandler chain = new SpreadsheetHandler(new SlideshowHandler(new TextDocumentHandler(null)));

        chain.openDocument("txt");

        chain.openDocument("ppt");
    }
}
