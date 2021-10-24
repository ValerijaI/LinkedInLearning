package designPatterns.behavior.interpreter.challenge;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    FirstLetterLowerCase firstLetterLowerCase = new FirstLetterLowerCase();
    context = firstLetterLowerCase.interpret(context);

    System.out.println(context);

  }

}
