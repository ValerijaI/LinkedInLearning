package tddDevelopmentCourse.isbnNumbersCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsbnNumberCheck {


    @Autowired
    private IsbnNumberValidator isbnNumberValidator;

    public ValidationResponse checkIsbnNumber(String isbnNumber){
        if (!isbnNumberValidator.validate(isbnNumber).isEmpty()) {
            return new ValidationResponse(isbnNumberValidator.validate(isbnNumber));
        }
        String correctedIsbn = correctIsbnNumber(isbnNumber);
        int lastNumber = getLastDigit(correctedIsbn);
        return new ValidationResponse(lastNumber == getControlDigit(correctedIsbn));
    }

    private int getLastDigit(String isbnNumber) {
        return Character.getNumericValue(isbnNumber.charAt(12));
    }

    private String correctIsbnNumber(String isbnNumber) {
        return isbnNumber.replace("-", "");
    }

    private int getControlDigit(String isbnNumber) {
        int first12DigitsSum = getDigitSum(isbnNumber);
        int modulo = first12DigitsSum % 10;

        return modulo == 0 ?
                0 :
                10 - modulo;
    }

    private int getDigitSum(String isbnNumber) {
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += getMultiplication(i, Character.getNumericValue(isbnNumber.charAt(i-1)));
        }
        return sum;
    }

    private int getMultiplication(int i, int digit) {
        return i % 2 == 0 ?
                digit * 3 :
                digit;
    }
}
