public class Array_PS {
    public static void main(String[] args) {
        // Q1
//        float [] marks = {20.2f, 30.5f, 40.2f};
//        float sum = 0.0f;
//        for (float element: marks){
//            sum = sum + element;
//        }
//        System.out.println("Sum of marks is "+sum);
//        System.out.println("Average of marks is "+(sum/marks.length));
        // Q2
//        int [] marks = {2, 32, 21, 5, 60, 3};
//        int num = 6;
//        boolean flag = false;
//        for (float element: marks){
//            if (element == num){
//                flag = true;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("Found");
//        } else {
//            System.out.println("Not found");
//        }
        // Q3
//        int [][] matrix1;
//        int [][] matrix2 = {{2,4,6},
//                            {1,3,5}};
//        int [][] result = {{0,0,0},{0,0,0}};
//        matrix1 = new int[2][3];
//        matrix1[0][0] = 2; matrix1[0][1] = 4; matrix1[0][2] = 6;
//        matrix1[1][0] = 1; matrix1[1][1] = 3; matrix1[1][2] = 5;
//
//        if (matrix1.length == matrix2.length){
//            if (matrix1[0].length == matrix2[0].length){
//                for (int i=0; i<matrix1.length; i++){
//                    for (int j=0; j<matrix1[0].length; j++){
//                        result[i][j] = matrix1[i][j] + matrix2[i][j];
//                        System.out.print(result[i][j] + " ");
//                    }
//                    System.out.print("\n");
//                }
//            }
//        }

        // Q4
        // REPLACE ELEMENTS IN REVERSE ORDER
        int [] num_array_1 = {12,21,32,43};
        // replace 12 by 43, 21 by 32.
        int [] num_array_2 = {8, 16, 24, 32, 40};
        // replace 8 by 40, and 16 by 32.

        // You have to go to [length/2] elements.
        // [5/2] = [2.5] = 2
        // i index, n=5 be the length of array.
        // we need to replace 2 elements.
        // then replace i by n-1-i
        //              0 by 4
        //              1 by 3
        int n = num_array_1.length;
        int a = Math.floorDiv(n, 2);
        for (int i = 0; i < a; i++){
            // SWAP num_array[i] by num_array[n-i-1]
            int temp = num_array_1[i];
            num_array_1[i] = num_array_1[n-i-1];
            num_array_1[n-i-1] = temp;
        }
        for (int element:num_array_1){
            System.out.print(element+" ");
        }
        System.out.print("\n");

        // Q5
        // FIND MAX VALUE IN ARRAY
        int [] weights = {23, 5, 34, 32, 22, 65, 65, 34, 32, 12, -9};
        int max = weights[0];
        int min = weights[0];
//        for (int i=1; i<weights.length; i++){
//            if (weights[i] > max){
//                max = weights[i];
//            }
//            if (weights[i] < min){
//                min = weights[i];
//            }
//        }
        for (int element: weights){
            if (element > max){ max = element; }
            if (element < min){ min = element; }
        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

        // Q6
        // FIND IF ARRAY IS SORTED OR NOT
        boolean flag = true;
        int [] age = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < age.length-1; i++){
            if (age[i] > age[i+1]){
                flag = false;
                break;
            }
        }
        System.out.println("Array is sorted : " + flag);
    }
}