import java.util.*;
public class secondLargestElement{
    public static void main(String[] args) {
    int[] numbers={12,55,567,456,88,97,455,54,33};
    System.out.println("===SECOND LARGEST ELEMENT OF AN ARRAY===");
    int max=numbers[0];
    int smax=0;
    for(int i=0;i<numbers.length;i++)
       {
         if(numbers[i]>max)
          { 
          max=numbers[i];
           
         }else if(numbers[i]>smax&&max!=smax)
         {
             smax=numbers[i];
         }
   
}  System.out.println(smax+" IS THE SECOND LARGEST");
}
}
