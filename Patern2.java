import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF LINES ABOVE 5");
        int n = sc.nextInt();
        System.out.println("******* STAR PATERN *******");
       for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
             if(j==0||i==0||i==n||j==n||j==i||(i+j)==(n)){
                 
               System.out.print("* ");
             }else{
                 System.out.print("  ");
             }
       }System.out.println();
    }
}}
