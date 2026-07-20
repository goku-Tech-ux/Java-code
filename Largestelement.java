import java.util.*;
public class largestElement{
    public static void main(String[] args) {
    int[] numbers={12,55,567,456,88,97,455,54,33};
    System.out.println("===LARGEST ELEMENT OF AN ARRAY===");
    int max=numbers[0];
    for(int i=0;i<numbers.length;i++)
       {
         if(numbers[i]>max)
          { 
              max=numbers[i];
           
         }
         
} System.out.println(max+" IS THE LARGEST");
}
}
