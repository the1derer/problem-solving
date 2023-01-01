package general_concepts.swapping;


/*
 * Here we will learn swapping values with and without using an extra variable
 */
public class SwappingValues {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("\n----swapping using extra variable----\n");

        System.out.print("Initial values --> ");
        System.out.println("a = " + a + ", b = " + b);

        int temp = 0; // temp is temporary variable
        temp = a; // using extra value to store value of a, a == 10, b == 20, temp == 10
        a = b; // a == 20, b == 20, temp == 10
        b = temp; // a == 20, b == 10

        System.out.print("Result after swap --> ");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("\n----swapping without using extra variable, using '+'  & '='----\n");
        a = 10;
        b = 20;

        System.out.print("Initial value --> ");
        System.out.println("a = " + a + ", b = " + b);

        a =+ b; // a == 30
        b = a - b; // b = 30 - 20 = 10
        a =- b; // a = 30 - 10 = 20

        System.out.print("Result after swap --> ");
        System.out.println("a = " + a + ", b = " + b);


        System.out.println("\n----Swapping without extra variable, using '*' & '/'\n");
        a = 10;
        b = 20;

        System.out.print("Initial value --> ");
        System.out.println("a = " + a + ", b = " + b);

        a *= b;
        b = a / b;
        a /= b;

        System.out.print("Result after swap --> ");
        System.out.println("a = " + a + ", b = " + b);        
    }

}
