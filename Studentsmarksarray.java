import java.util.*;
public class linearSearch{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    int[] marks={70,80,85,96,90};
    String[] names={"RAMU","SOMU","SURESH","RAMESH","KRISHNA"};
    System.out.println("===STUDENT MARKS===");
    for(int i=0;i<marks.length;i++)
       {
         System.out.println(names[i]+" = "+marks[i]);
}
}
}
