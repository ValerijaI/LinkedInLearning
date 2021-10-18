package tddDevelopmentCourse.isbnNumbersCheck;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IsbnFormatResponse {

    private List<IsbnFormatError> errorList = new ArrayList<>();

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }
}
