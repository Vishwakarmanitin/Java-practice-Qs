import java.util.*;

class Functions {
    public static void AreaOfCircle(int r) {
        System.out.println("Area of the circle is: " + (3.14 * r * r));   
    }

    public static void CircumOfCircle(int r) {
        System.out.println("Circumference of circle is: " + (2 * 3.14 * r));
    }

    public static void VolOfSphere(int r) {
        System.out.println("Volume of Sphere: " + (1.33 * r * r * r * 3.14));
    }

    public static void SAreaOfSphere(int r) {
        System.out.println("Surface Area of Sphere: " + (4 * 3.14 * r * r));
    }

    public static void AreaOfRectangle(int length, int width) {
        System.out.println("Area of rectangle is: " + (length * width));
    }

    public static void AreaOfTriangle(int base, int height) {
        System.out.println("Area of triangle is: " + (0.5 * base * height));
    }

    public static void AreaOfSquare(int side) {
        System.out.println("Area of square is: " + (side * side));
    }

    public static void AreaOfRightAngleTriangle(int base, int height) {
        System.out.println("Area of right angle triangle is: " + (0.5 * base * height));
    }

    public static void AreaOfEquilateralTriangle(int side) {
        System.out.println("Area of equilateral triangle is: " + ((Math.sqrt(3) / 4) * side * side));
    }

    public static void PerimeterOfRectangle(int length, int width) {
        System.out.println("Perimeter of rectangle is: " + (2 * (length + width)));
    }
}

class Calci {

    public static void main(String[] args) {
       int n, r, length, width, base, height, side;
       Scanner sc = new Scanner(System.in);
       System.out.println("1. AreaOfCircle"); 
       System.out.println("2. CircumOfCircle"); 
       System.out.println("3. VolOfSphere"); 
       System.out.println("4. SAreaOfSphere"); 
       System.out.println("5. AreaOfRectangle"); 
       System.out.println("6. AreaOfTriangle"); 
       System.out.println("7. AreaOfSquare"); 
       System.out.println("8. AreaOfRightAngleTriangle"); 
       System.out.println("9. AreaOfEquilateralTriangle"); 
       System.out.println("10. PerimeterOfRectangle");
       System.out.println("0. Quit");
       
       System.out.println("Enter operation to perform: "); 
       n = sc.nextInt();
       switch(n) { 

       case 1:
       System.out.println("Enter Radius:");
       r = sc.nextInt();
       Functions.AreaOfCircle(r);
       break;
       case 2:
       System.out.println("Enter Radius:");
       r = sc.nextInt();
       Functions.CircumOfCircle(r);
       break;
       case 3:
       System.out.println("Enter Radius:");
       r = sc.nextInt();
       Functions.VolOfSphere(r);
       break;
       case 4:
       System.out.println("Enter Radius:");
       r = sc.nextInt();
       Functions.SAreaOfSphere(r);
       break;
       case 5:
        System.out.println("Enter length and width of rectangle:");
        length = sc.nextInt();
        width = sc.nextInt();
        Functions.AreaOfRectangle(length, width);
       break;
       case 6:
        System.out.println("Enter base and height of triangle:");
        base = sc.nextInt();
        height = sc.nextInt();
        Functions.AreaOfTriangle(base, height);
       break;
       case 7:
        System.out.println("Enter side of square:");
        side = sc.nextInt();
        Functions.AreaOfSquare(side);
       break;
       case 8:
        System.out.println("Enter base and height of right angle triangle:");
        base = sc.nextInt();
        height = sc.nextInt();
        Functions.AreaOfRightAngleTriangle(base, height);
       break;
       case 9:
        System.out.println("Enter side of equilateral triangle:");
        side = sc.nextInt();
        Functions.AreaOfEquilateralTriangle(side);
       break;
       case 10:
        System.out.println("Enter length and width of rectangle:");
        length = sc.nextInt();
        width = sc.nextInt();
        Functions.PerimeterOfRectangle(length, width);
       break;
       case 0:
        System.out.println("Exiting..");
       break;
    }
    sc.close();
    }
}

