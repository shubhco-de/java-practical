import java.util.Scanner;

// Interface
interface result {
    public void record(int roll_no,String name);
    public void score(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class show_result implements result {
    public void record(int roll_no,String name) {
        System.out.println(" student roll number : "+roll_no);
        System.out.println(" student name : "+name);

    }

    /**
     *
     */
    @Override
    public void score() {

    }
    public void score(int num1, int num2, int num3, int num4,int num5) {
        String sub_name[]={"Java","Php","MIS","Networking","English","total"};
int total=num1+num2+num3+num4+num5;
float pr =total/5f;
        System.out.println("The result of the student:- ");
        System.out.println(sub_name[0]+" = "+num1);
        System.out.println(sub_name[1]+" = "+num2);
        System.out.println(sub_name[2]+" = "+num3);
        System.out.println(sub_name[3]+" = "+num4);
        System.out.println(sub_name[4]+" = "+num5);
        System.out.println(sub_name[5]+" = "+total+"/500 = "+pr+"%");
        System.out.println("---------------------------------------------------------------------------");

    }
}

class Interface_08 {
    public static void main(String[] args) {
        show_result r = new show_result();  // Create a Pig object
        r.record(80202409,"Shubh");
        r.score(33,44,55,66,77);
        r.record(80202410,"Nishant");
        r.score(67,78,98,60,90);
    }
}