package MultiDimensionalArrays;

public class MinNumberOfColumn {
    public static void main(String[] args) {


//    print the minimum value in the column with the maximum numeber
//    1 3 2
//    7 11 90
//    18 32 -1

        int array[][] = {{1, 3, 2}, {7, 11, 90}, {18, 31, -1}};

        //find the column with max number

        int min = array[0][0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3 ; j++) {
                if(array[i][j] < min){
                    min = array[i][j];
                    index = j;
                }
            }
        }

        //find the minium number in column j
        int minimum = array[0][index];
        int k = 0;
        while (k < array.length) {
            if (array[k][index] < minimum){
                minimum = array[k][index];
            }
            k++;
        }

        System.out.println(minimum);

    }
}