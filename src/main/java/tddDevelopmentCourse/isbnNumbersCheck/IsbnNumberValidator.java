package tddDevelopmentCourse.isbnNumbersCheck;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class IsbnNumberValidator {

    List<IsbnFormatError> validate (String isbnNumber) {
        List<IsbnFormatError> errorList = new ArrayList<>();
        validateLength(isbnNumber).ifPresent(errorList::add);
        notDigitsError(isbnNumber).ifPresent(errorList::add);
        return errorList;
    }

    private Optional<IsbnFormatError> validateLength(String isbnNumber) {
        return isbnNumber.length() == 13 ?
                Optional.empty() :
                Optional.of(new IsbnFormatError("Not valid length"));
    }

    private Optional<IsbnFormatError> notDigitsError(String isbnNumber) {
        try {
            Integer.valueOf(isbnNumber);
            return Optional.empty();
        } catch (Exception e) {
            return Optional.of(new IsbnFormatError("ISBN can contain only difits"));
        }
    }
}
