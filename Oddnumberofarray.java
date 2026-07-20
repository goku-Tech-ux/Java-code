import java.util.*;
public class oddNumbers{
    public static void main(String[] args) {
    int[] numbers={12,55,567,456,88,97,455,54,33};
    System.out.println("===ODD NUMBERS OF AN ARRAY===");
    for(int i=0;i<numbers.length;i++)
       {
         if((numbers[i]%2!=0)&&(numbers[i]%2==1))
             System.out.println(numbers[i]);
           
       }

}
}
