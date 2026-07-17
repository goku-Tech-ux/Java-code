import java.util.*;
public class largest{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("_____TO FIND LARGEST NUMBER_____");
     System.out.println(" ");
    System.out.println("Enter A value:");
    int a=sc.nextInt();
    System.out.println("Enter B value:");
    int b=sc.nextInt();
    System.out.println("Enter C value:");
    int c=sc.nextInt();
    if (b<a&&a>c)
    {
     System.out.println(a+" IS THE LARGEST NUMBER");
    }else if (a<b&&b>c)
    {
     System.out.println(b+" IS THE LARGEST NUMBER");
    }else
    {
     System.out.println(c+" IS THE LARGEST NUMBER");
    }
}
}
