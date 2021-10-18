package tddDevelopmentCourse.isbnNumbersCheck;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {

    @Autowired
    private static IsbnNumberCheck isbnNumberCheck;

    public static void main(String args []) {
        System.out.println(isbnNumberCheck.checkIsbnNumber("123"));
    }
}
