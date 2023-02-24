public class BinarySearch_14 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 33, 44, 55, 56 };
        int srch = 44;
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] == srch) {
                System.out.println("Element found at index no:- " + mid);
                break;
            } else if (array[mid] < srch) {
















































































































































































                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("element is not found");
        }

    }
}