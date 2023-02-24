public class BubbleSort_09 {

    public static void Arrray(int[] ary){
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i]+" ");
            
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int ary[]={22,77,54,88,76};
        for (int i = 0; i < ary.length-1; i++) {
            for (int j = 0; j < ary.length-i-1; j++) {
                if (ary[j]>ary[j+1]) {
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array using Bubble sort is:- ");
        Arrray(ary);
    }
}