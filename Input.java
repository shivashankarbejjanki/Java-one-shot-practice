import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age:");
        int age = sc.nextInt();
        System.out.println(age);
        float age1 = sc.nextFloat();
        System.out.println(age1);
        // for names use string // for name,like token to print here used .next() funxtion.
    String name = sc.next();
    System.out.println(name); 
    // for full line use .nextline() function.
    }
}
