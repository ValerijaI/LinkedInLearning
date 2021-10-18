package tddDevelopmentCourse.isbnNumbersCheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class IsbnNumberCheckTest {

    @Mock
    private IsbnNumberValidator isbnNumberValidator;

    @InjectMocks
    private IsbnNumberCheck isbnNumberCheck;

    @Test
    public void testIsbnNumberIsValid() {
        String isbnNumber = "9781861972712";
        given(isbnNumberValidator.validate(isbnNumber)).willReturn(new ArrayList<>());
        ValidationResponse validationResponse = isbnNumberCheck.checkIsbnNumber(isbnNumber);
        assertTrue(validationResponse.isValid());
    }

    @Test
    public void testIsbnNumberWithSymbolsIsValid() {
        String isbnNumber = "978-5-9614-6639-3";
        given(isbnNumberValidator.validate(isbnNumber)).willReturn(new ArrayList<>());
        ValidationResponse validationResponse = isbnNumberCheck.checkIsbnNumber(isbnNumber);
        assertTrue(validationResponse.isValid());
    }

    @Test
    public void testIsbnNumberIsNotValid1() {
        String isbnNumber = "9781681972712";
        given(isbnNumberValidator.validate(isbnNumber)).willReturn(new ArrayList<>());
        ValidationResponse validationResponse = isbnNumberCheck.checkIsbnNumber("9781681972712");
        assertFalse(validationResponse.isValid());
    }

    @Test
    public void testIsbnNumberIsNotValid2() {
        String isbnNumber = "9781681972712";
        given(isbnNumberValidator.validate(isbnNumber)).willReturn(new ArrayList<>());
        ValidationResponse validationResponse = isbnNumberCheck.checkIsbnNumber("9781681972712");
        assertFalse(validationResponse.isValid());
    }

    @Test
    public void testIsbnNumberIsNotValid9Digits() {
        String isbnNumber = "9781861972712";
        given(isbnNumberValidator.validate(isbnNumber)).willReturn(Collections.singletonList(new IsbnFormatError("Not valid length")));
        ValidationResponse validationResponse = isbnNumberCheck.checkIsbnNumber(isbnNumber);
        assertTrue(validationResponse.hasErrors());
    }
}