import java.util.*;
public class averageMarks{
    public static void main(String[] args){
        String[] names={"anbu","ajay","abi ","bavish"};
        int[][] marks={{60,87,76,88,93},{59,86,77,98,66},{63,82,79,54,65},{63,78,76,80,95}};
        System.out.println("       =====STUDENT'S MARKS TABLE=====");
        System.out.println("NAME\tTAMIL\tENGLISH\tMATHS\tSCIENCE\tSOCIAL\tAVERAGE\t");
        for(int i=0;i<names.length;i++)
        {
            double total=0;
            System.out.print(names[i]+"\t");
           for(int j=0;j<marks[i].length;j++)
        {
            System.out.print(marks[i][j]+"\t\t");
               total=marks[i][j]+total;
           
        } double average=total/5;
        System.out.println(average+"\t");
    }
}
}
