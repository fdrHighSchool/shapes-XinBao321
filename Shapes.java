import java.util.Scanner;
import java.lang.*;
       public class shapes{
        public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int length1, width1 ,areaTri;


 rectangle(4,5,1);
 circle(1,2);
 System.out.println("What is the base of the triangle ?");
 length1 = input.nextInt();
 System.out.println("What is the height of the triangle ?");
 width1  = input.nextInt();
 areaTri = length1 * width1 /2;
 System.out.println("The area of the triangle is " + areaTri);
 cube(1.0,1.0);
 triangularPrism(1.0,1.0,1.0,1.0,1.0);
 rectangularprism(1.0,1.0,1.0,1.0);
 sphere(1,1.0);

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
public static void circle(int radius, double area){
 Scanner input = new Scanner(System.in);
 System.out.println("What is the radius of the circle?");
 radius = input.nextInt();

 area = Math.PI * radius * radius;

 System.out.println("The area of the circle " + area);
} // close method for circle

  public static void cube(double s, double areaCube){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side of the cube ");
    s = input.nextDouble();
    areaCube = s * s * 6;
    System.out.println("The volume of the cube is " + areaCube);
  } //close method for cube
  
  public static void triangularPrism(double length3, double base, double height, double volumeTri, double valueCheck ){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of the triangleprism? ");
    length3 = input.nextDouble();
    System.out.println("What is the base of the triangleprism? ");
    base = input.nextDouble();
    System.out.println("What is the height of the triangleprism? ");
    height = input.nextDouble();
    volumeTri = length3 * base * height /2;
    System.out.println(" The volume of the triangleprism is " + volumeTri);
  }// close method for triangularprism

  public static void rectangularprism(double length4, double width3, double height2, double volumeRect){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of the rectangular prism?");
    length4 = input.nextDouble();
    System.out.println("What is the width of the rectangular prism?");
    width3 = input.nextDouble();
    System.out.println("What is the height of the rectangular prism?");
    height2 = input.nextDouble();
    volumeRect = length4 * width3 * height2;
    System.out.println("The volume of the rectangular prism is " + volumeRect);
  }  //close method for rectangularprism

    public static void sphere(int radius, double volumeSphere){
      Scanner input = new Scanner(System.in);
      System.out.println("What is the radius of the sphere?");
      radius = input.nextInt();
      volumeSphere = Math.PI * radius * radius * radius * 4/3;
      System.out.println("The volume of the sphere is " + volumeSphere);
    } // close method for sphere

 }//close class
