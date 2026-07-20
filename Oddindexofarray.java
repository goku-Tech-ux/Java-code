import java.util.*;
public class oddIndex{
    public static void main(String[] args) {
    int[] numbers={12,55,567,456,88,97,455,54,33};
    System.out.println("===ODD INDEX OF AN ARRAY===");
    for(int i=0;i<numbers.length;i++)
       {
         if(i%2!=0&&i%2==1) {
             System.out.println(i+" INDEX's VALUE "+numbers[i]);
           
         }
        
}
}
}
