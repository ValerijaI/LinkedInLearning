package tddDevelopmentCourse.isbnNumbersCheck;

import lombok.Data;

import java.util.List;

@Data
public class ValidationResponse extends IsbnFormatResponse{

    private boolean isValid;

    public ValidationResponse(List<IsbnFormatError> errorList) {
        super(errorList);
    }

    public ValidationResponse(boolean isValid) {
        this.isValid = isValid;
    }
}