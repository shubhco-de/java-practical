public class Transposmatrix_04 {
    public static void main(String[] args) {
        int original[][] ={{1,2,3},{2,4,5},{6,7,8}};
        int transpose[][]= new int[3][3];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                transpose[i][j]=original[j][i];
                
            }
        }
        System.out.println("Matrix without Transpose: ");
        for (int i = 0; i < transpose.length; i++) {
                
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
    }
        System.out.println("Matrix After transpose: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
    }
}
}
