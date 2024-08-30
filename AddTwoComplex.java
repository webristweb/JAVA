class Complex {
    double real, imaginary;

    Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    public static Complex add(Complex num1, Complex num2) {
        return new Complex((num1.real + num2.real), (num1.imaginary + num2.imaginary));
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2);
        Complex num2 = new Complex(2.5, 4.5);
        Complex sum = add(num1, num2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
    }
}
