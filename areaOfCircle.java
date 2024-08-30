import java.util.Scanner;

 public class areaOfCircle {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Radius Of The Cicle :");
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println(" The Area Of The  With radius" +radius+ "is:" +area);

    //Scanner.close(); By Abhishek Raj
}
}