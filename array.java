import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        
        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 91;
        marks[2] = 99;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Length property
        System.out.println(marks.length);

        // Sort() function
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}