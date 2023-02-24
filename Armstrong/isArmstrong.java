package Armstrong;

public class isArmstrong {
    public static boolean  CheckArm(int num){
        int t1= num;
        int lengh = 0;
        while(t1!=0){
            t1 =t1/10;
            lengh++;

        }
        int t2 = num;
        int arm =0;
        while (t2!=0){
          int  rem = t2%10;
            int mul = 1;

            for (int i = 0; i <lengh ; i++) {
                    mul = mul*rem;
            }
             arm = arm+mul;
            t2 /=10;


        }

return (arm==num);
    }

}
