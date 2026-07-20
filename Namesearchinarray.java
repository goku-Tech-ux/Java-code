import java.util.*;
public class nameSearch{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER THE NAME IN CAPITAL LETTERS: ");
    String[] names={"RAMU","SOMU","SURESH","RAMESH","KRISHNA"};
     String n=sc.nextLine();
    System.out.println("===NAME SEARCH IN ARRAY===");
    for(int i=0;i<names.length;i++)
       {
           if(names[i].equals(n)) {
                  System.out.println(n+" NAME FOUND");
                  return;
           } 
           }System.out.println(n+" NAME NOT FOUND");

}
}
