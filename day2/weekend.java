import java.util.*;
class weekend {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String day;
      System.out.println("---Days of week---");
      System.out.println("Sunday");
      System.out.println("Monday");
      System.out.println("Tuesday");
      System.out.println("Wednesday");
      System.out.println("Thrusday");
      System.out.println("Friday");
      System.out.println("Saturday");
      System.out.println("Enter today's day : ");
    day = sc.next();
    if (day.equals("Sunday") || day.equals("Saturday")) {
        System.out.println("Hurray! it's weekend dayy");
    }
    else{
        System.out.println("Gear Up! It's Working day");
    }
    sc.close();
    }
}
