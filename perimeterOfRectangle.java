import java.util.Scanner;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length Value");
        int l = sc.nextInt();
        System.out.println("Enter Breath Value");
        int b = sc.nextInt();
        int c = 2*(l + b);
        System.out.println("Perimeter Of Rectangle is = " +c);
        }
}
