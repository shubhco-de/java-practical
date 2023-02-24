
import Armstrong.isArmstrong;

import java.util.Scanner;

public class Findarm
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check Armstorng number");
    int num =in.nextInt();
    isArmstrong check = new isArmstrong();
boolean find = check.CheckArm(num);
 if (find) {
    System.out.println(num+" is a Armstrong number");
}
 else{
    System.out.println(num+" is not a Armstrong number");

}


}    }

