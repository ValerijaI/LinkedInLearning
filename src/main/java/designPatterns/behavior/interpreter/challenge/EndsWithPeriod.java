package designPatterns.behavior.interpreter.challenge;

public class EndsWithPeriod implements Expression{

    private NoRepeatWords noRepeatWords = new NoRepeatWords();

    @Override
    public String interpret(String context) {
        if(!context.endsWith(".")) {
            context = context + ".";
        }
        return noRepeatWords.interpret(context);
    }
}
