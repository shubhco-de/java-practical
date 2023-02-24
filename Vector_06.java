import java.util.Vector;

public class Vector_06 {
    public static void main(String[] args) {
        Vector<String> word = new Vector<String>();
        //#1 to append the specified element in the  vector
        word.add("Hello");
        word.add("Coder");
        word.add("!");
        word.add("Let's build Own world");
        System.out.println(word);

        //#2    Print the size and capacity of the vector
                System.out.println("Size: " + word.size());
              System.out.println("Capacity: " + word.capacity());
              //#3  // Check if the vector contains the word "Hello"
     System.out.println("Contains 'Hello': " + word.contains("Hello"));
        System.out.println("Contains 'Goodbye': " + word.contains("Goodbye"));

        //#4 Get an element at the specified index
        System.out.println("Element at index 1 is = "+word.elementAt(1));
        System.out.println("Element at index 3 is = "+word.elementAt(3));
        //#5 Obtain the last element of this vector
        System.out.println("The last element of a vector is: " +word.lastElement());

    }

}
