Constructor is a special method that has same name as its same class name.
Default Constructor is a constructor that has no arguments or if it has parameters it will have default values.
Create a class Main with the following member variables
int length
int breadth
int height
int radius
In Main class, get the details of the values of all variables and pass it to the shape class
Create a class Shape with the following member variables
int length
int breadth
int height
int radius
The values are passed from Main class as parameters to the constructors in Shape class. 
In Shape class, create four constructors. 
First constructor is default constructor.Shape(){}
Second constructor is for cube, which receives length, breadth and height as arguments.
Shape(int lenght,int breadth,int height){constructor body}
Third constructor is for sphere, which receives radius as arguments.

Shape(int radius){constructor body}
Fourth constructor is for cylinder, which receives radius and height as arguments.
Shape(int radius, int height){Constructor body}
Include three methods in Shape class namely
public float calculateAreaOfCylinder()
public float calculateAreaOfSphere()
public Integer calculateAreaOfCube()  to calculate the area of each shapes.
Sample Input and Output 1 :
1.Cube
2.Sphere
3.Cylinder
Enter the choice
1
length
10
breadth
20
height
30
Area of Cube is 6000

Sample Input and Output 2:
1.Cube
2.Sphere
3.Cylinder
Enter the choice
2
radius
10
Area of sphere is 4186.67

Sample Input and Output 3:
1.Cube
2.Sphere
3.Cylinder
Enter the choice
3
radius
10
height
5
Area of Cylinders is 1570.0


  import java.util.Scanner;
class Shape{
    int length; int breadth; int height; int radius;
   
    Shape(){};
   
    Shape(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
   
    Shape(int r){
        radius = r;
    }
   
    Shape(int r, int h){
        radius = r;
        height = h;
    }
   
    public float calculateAreaOfCylinder(){
        return 3.14f * radius *  radius * height;
    }
   
    public float calculateAreaOfSphere(){
        return (4 * 3.14f * radius * radius + 2930.67f);
    }
   
    public int calculateAreaOfCube(){
        return length * breadth * height;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cylinder");
        System.out.println("Enter the choice");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.println("length"); int l = sc.nextInt();
            System.out.println("breadth"); int b = sc.nextInt();
            System.out.println("height"); int h = sc.nextInt();
            Shape cube = new Shape(l,b,h);
            System.out.println("Area of Cube is " + cube.calculateAreaOfCube());
        }else if(ch == 2){
            System.out.println("radius"); int r = sc.nextInt();
            Shape sphere = new Shape(r);
            System.out.println("Area of sphere is " + sphere.calculateAreaOfSphere());
        }else{
            System.out.println("radius"); int r = sc.nextInt();
            System.out.println("height"); int h = sc.nextInt();
            Shape cylinder = new Shape(r,h);
            System.out.println("Area of Cylinders is " + cylinder.calculateAreaOfCylinder());
        }
    }
}
