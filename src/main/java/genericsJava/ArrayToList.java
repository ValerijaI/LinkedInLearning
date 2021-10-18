package genericsJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    static Character[] charArray = {'a', 'b'};
    static Integer[] integerArray = {1, 2, 3};
    static Boolean[] booleanArray = {true, false};

    public static void main(String args[]) {
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Integer> integerList = arrayToList(integerArray, new ArrayList<>());
        List<Boolean>booleanList = arrayToList(booleanArray, new ArrayList<>());
    }

    static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }
}
