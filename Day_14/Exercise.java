public class Exercise {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };

        System.out.println("Array for matrix: ");
        for (int[] matrix1 : matrix) {
            System.out.println(matrix1[0]);
        }
        
        int i = 0;
        System.out.println("Sub-array for matrix: ");
        for (int[] matrix2 : matrix) {
            for (int col = 0; col < matrix2.length; col++) {
                System.out.println(matrix2[col]);
                i++;
            }   
        }
        System.out.println("Matrix length: " + i);
    }   
}
