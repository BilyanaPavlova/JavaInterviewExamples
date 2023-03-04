package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class MinNumberInMatrix {
    public static void main(String[] args) {

        Object arr[][] = {
                {"Bi", 51, "Sofia"},
                {"El", 16, "Sof"},
                {"Kri", 18, "Sof"},
                {"Ass", 47, "Sofia"}
        };

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < arr.length; i++) {
////            System.out.print(i + " ");
////        }
////        System.out.println("\n" + arr.length);

        //print minimum number of a multidimensional array

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] instanceof Integer) {
                    numbers.add((Integer) arr[i][j]);
                }
            }
        }
//        System.out.println(numbers);

        Integer num = MAX_VALUE;
        for (int number : numbers) {
            int result = num.compareTo(number);
            if (result > 0) {
                num = number;
            }
        }
        System.out.println(num);


    }
}
