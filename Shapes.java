import java.util.*;

public class Shapes{
  public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int length1, width1 ,areaTri;
 Scanner input = new Scanner(System.in);

 rectangle(4,5,1);
 circle(1.0,2.0);

 System.out.println("What is the length of the triangle ?");
 length1 = input.nextInt();
 System.out.println("What is the width of the triangle ?");
 width1  = input.nextInt();
 areaTri = length1 * width1 /2;
 System.out.println("The area of the triangle is " + areaTri);

}   //close method

public static void rectangle(int length2,int width2, int areaRectangle){
  Scanner input = new Scanner(System.in);

 System.out.println("Welcome to the shape area calcuator!");
 System.out.println("What is the length of the rectangle?");
 length2 = input.nextInt();
 System.out.println("What is the width of the rectangle?");
 width2 = input.nextInt();
 areaRectangle = length2 * width2;
 System.out.println("The area of the rectangle is " + areaRectangle);

} //close method for rectangle
public static void circle(double radius, double area){
 Scanner input = new Scanner(System.in);
 System.out.println("What is the radius of the circle?");
 radius = input.nextDouble();

 area = Math.PI * radius * radius;

 System.out.println("The area of the circle " + area);
} // close mthod for circle
 }//close class

  
