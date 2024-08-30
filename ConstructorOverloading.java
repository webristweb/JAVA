public class ConstructorOverloading {
    int a;
    double b;
    String c;

    // Default constructor
    ConstructorOverloading() {
        a = 100;
        b = 25.23;
        c = "Abhishek";
    }

    // Constructor with one integer parameter
    ConstructorOverloading(int x) {
        a = x;
    }

    // Constructor with one double and one String parameter
    ConstructorOverloading(double y, String z) {
        b = y;
        c = z;
    }
}

class B {
    public static void main(String args[]) {
        ConstructorOverloading r = new ConstructorOverloading(); // Creating an object using default constructor
        ConstructorOverloading r2 = new ConstructorOverloading(20); // Creating an object using constructor with one int parameter
        ConstructorOverloading r3 = new ConstructorOverloading(25.23, "Abhishek"); // Creating an object using constructor with one double and one String parameter

        // Printing values
        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a);
        System.out.println(r3.b + " " + r3.c);
    }
}
