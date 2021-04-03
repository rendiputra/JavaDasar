package array;

public class array_2Dimensi {
    public static void main(String[] args) {
        String[][] namaArray = new String[][]{
                {"apel", "jeruk"}, {"Mangga", "Semongkoo"}
        };

        System.out.println(namaArray[0][0]);
        System.out.println(namaArray[0][1]);
        System.out.println(namaArray[1][0]);
        System.out.println(namaArray[1][1]);
        System.out.println("----------------------");

        for (int i = 0; i < namaArray.length; ++i){
            for(int j = 0; j < namaArray[i].length; ++j) {
                System.out.println(namaArray[i][j]);
            }
        }

        System.out.println("\n\n----------------------\n");
        int [][] matrix = new int[][]{
                {0, 11, 12, 2},
                {3, 14, 22, 7},
                {4, 16, 2, 1},
        };

        for (int i = 0; i < matrix.length; ++i){
            for(int j = 0; j < matrix[i].length; ++j) {
                System.out.println(matrix[i][j]);
            }
        }
//        for(int[] b: matrix){
//            for (int x : b) {
//                System.out.print(x +"\t");
//            }
//            System.out.println("");
//        }
    }
}