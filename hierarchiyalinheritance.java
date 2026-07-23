import java.util.*;
public class main {
    public static void main(String[] args){
        teacher say=new teacher();
        say.comand();
        say.speak1();
        say.speak2();
}}
class student1 {
    void speak1() {
        System.out.println("STUDENT1 :  1 PRESENT");
        
    }
}
class student2 extends student1 {
     void speak2() {
         System.out.println("STUDENT2 :  2 PRESENT");
     }  
}
class teacher extends student2 {
    void comand() {
        System.out.println("TEACHER : SAY ATTENDENCE");
    }
}
