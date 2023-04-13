/***Desenvolva um programa em Java (utilizando a IDE Eclipse) que retorna a multiplicação entre matrizes
(as matrizes podem ser randomicamente inicializadas na execução do programa);***/

public class Q6_LarissaEvangelista {
    public static void main(String[] args) {
   
        int rows1 = 3; 
        int cols1 = 2; 
        int rows2 = 2; 
        int cols2 = 4; 

        int[][] matrix1 = getRandomMatrix(rows1, cols1);
        int[][] matrix2 = getRandomMatrix(rows2, cols2);

        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matriz 1:");
        printMatrix(matrix1);
        System.out.println("Matriz 2:");
        printMatrix(matrix2);
        System.out.println("Resultado da multiplicação:");
        printMatrix(result);
    }

    public static int[][] getRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}