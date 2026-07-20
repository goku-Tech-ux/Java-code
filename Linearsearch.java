import java.util.*;
public class linearSearch{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value: ");
    int[] marks={70,80,85,96,90};
    int n=sc.nextInt();
    System.out.println("=====LINEAR SEARCH=====");
    for(int i=0;i<marks.length;i++)
       {
           if(marks[i]==n) {
                  System.out.println(n+" ELEMENT FOUND");
                  return;
           } 
           }System.out.println(n+" Element not  found");

}
}
