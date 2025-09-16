public class casting {
    
    public static void main(String[] args) {
        

        // Implicit Casting -- you can insert smaller value into higher value.
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);


        // Explicit Casting -- you cannot insert higher value into smaller value.
       /*int p = 150;
        int fp = p + 18.00;
        System.out.println(fp);  */

        // but you can execute by doing below procedure.
        int p = 200;
        int fp = p + (int)18.58;
        System.out.println(fp);

    }
}
