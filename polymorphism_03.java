import java.util.Scanner;

/**
 * polymorphism
 */
public class polymorphism_03 {
public double area(int radius ){
double cricle = 3.14*radius*radius;
return cricle;
}
public double area(int length,int width){
    double rectangle = length*width; 
    return rectangle;
}
public double area(int length,int width,int breadth){
    double cuboid = length*width*breadth;
    return cuboid;
}
public static void main(String[] args) {
    polymorphism a = new polymorphism();
   // Scanner in = new Scanner(System.in);
    System.out.println("The area  of cricle is "+ a.area(5)+" cm square");
    System.out.println("The area  of reactangle is "+ a.area(10,14)+" cm square");
    System.out.println("The volume  of cuboid is "+ a.area(10,14,6)+" cm square");
}
    
}