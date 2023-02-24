public class SelectionShort {
    public static void Arrray(int[] ary){
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i]+" ");
            
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int ary[]= {22,11,55,433,56};
        for (int i = 0; i < ary.length; i++) {
            int smallest = i;
            for (int j = i+1; j < ary.length; j++) {
                if (ary[smallest]<ary[j]) {
                    smallest =j;
                }
                
            }
            int temp = ary[smallest];
            ary[smallest] = ary[i];
            ary[i] = temp;

        }
        System.out.println("The sort" +
                "ed array using Selection sort is:- ");

        Arrray(ary);
    }
}
