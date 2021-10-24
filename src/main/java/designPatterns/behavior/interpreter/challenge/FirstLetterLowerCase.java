package designPatterns.behavior.interpreter.challenge;

public class FirstLetterLowerCase implements Expression{

    private EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toUpperCase() + context.substring(1);
        return endsWithPeriod.interpret(context);
    }
}
