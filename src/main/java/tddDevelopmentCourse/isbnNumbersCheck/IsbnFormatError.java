package tddDevelopmentCourse.isbnNumbersCheck;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IsbnFormatError extends Exception{

    private String message;
}
