import java.util.Scanner;

public class Revdrse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse : ");
        int n = in.nextInt();
        int reverse = 0;
        int reminder ;
        while (n!=0){
            reminder =n%10;
            reverse = reverse *10 + reminder;
            n = n/10;
        }
        System.out.println("The reverse number is : "+reverse);
    }
}
