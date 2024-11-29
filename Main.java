import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 integers");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    double ratio = (double) num1 / num2;

    if (num2 == 0) {
      System.out.println("Cannot divide by 0");
    } else {
      if (ratio > 1 && ratio <= 8) {
        System.out.println("Ratio OK");
      }
    }

    System.out.println("Enter 2 integers");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (b == 0) {
      System.out.println("Cannot divide by 0");
    } else {
      if (a % b == 0) {
        System.out.println("Is a factor");
      }
    }

    System.out.println("Enter an integer in the fifties");
    int c = sc.nextInt();
    if (c < 50 || c >= 60) {
      System.out.println("Number not in the fifties");
      c = 55;
    }
    System.out.println("Number is " + c);

    System.out.println("Enter 2 integers");
    int x = sc.nextInt();
    int y = sc.nextInt();

   if (y <= 9 || (x > 2 && x * y > 10)) {
    System.out.println("pass");
   }

   Rectangle r1 = new Rectangle(2, 6);
   Rectangle r2 = new Rectangle(1, 4);
   System.out.println(rectEqual(r1, r2));
   r2.setLength(2);
   r2.setWidth(6);
   System.out.println(rectEqual(r1, r2));
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    double length1 = r1.getLength();
    double width1 = r1.getWidth();
    double length2 = r2.getLength();
    double width2 = r2.getWidth();
    return (length1 == length2 && width1 == width2);
  }
}
