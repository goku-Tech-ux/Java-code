import java.util.*;
public class main {
    public static void main(String[] args){
        principal told=new principal();
        told.comand();
        told.speak2();
        teacher tell=new teacher();
        tell.speak1();
}}
class student {
    void speak1() {
        System.out.println("STUDENTS : YES TEACHER");
        
    }
}
class teacher extends student {
     void speak2() {
         System.out.println("TEACHER  : STUDENTS ASSEMBLE");
     }  
}
class principal extends teacher {
    void comand() {
        System.out.println("PRINCPAL : TEACHERS AND STUDENT ASSEMBLE");
    }
}
