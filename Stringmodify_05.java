public class Stringmodify_05 {
    static StringBuffer str = new StringBuffer("Learn java");

    public StringBuffer modify() {
        return str.reverse();
    }

    public StringBuffer append() {

        str.append(" bro");
        return str;
    }

    public StringBuffer insert() {
        return str.insert(0, "hello ");
    }

    public static void main(String[] args) {
        Stringmodify_05 A = new Stringmodify_05();
        System.out.println(A.append());
        System.out.println(A.insert());
        System.out.println(A.modify());

    }
}
