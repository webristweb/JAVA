import java.util.Scanner;

public class areaOfRectangle {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int l = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        int c = l * b;
       System.out.println("Area of rectangle =" + c);
    }
}
