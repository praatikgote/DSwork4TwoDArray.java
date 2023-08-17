package TwoDArray;

public class SearchSoredMatrix {

    public static boolean FindSordedSearchfromtop(int matrix[][], int key) {

        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("found in :" + row + " " + col);
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;

            } else {
                row++;
            }
        }

        return false;

    }

    public static boolean FindSordedSearchfromboutom(int matrix[][], int key) {

        int row = matrix.length - 1;
        int col = 0;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.println("found in :" + row + " " + col);
                return true;
            }

            else if (key > matrix[row][col]) {
                col++;

            } else {
                row--;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = {

                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }

        };

        int key = 37;

        // FindSordedSearchfromtop(matrix, key);

        FindSordedSearchfromboutom(matrix, key);

    }

}
