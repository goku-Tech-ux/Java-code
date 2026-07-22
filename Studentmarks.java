class student{
    int rollno;
    String name;
    String dept;
    String section;
    student (int rollno,String name,String dept,String section)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
}
}class marks{
    int tamil,english,maths,science,social;
    marks (int tamil,int english,int maths,int science,int social){
    this.tamil=tamil;
    this.english=english;
    this.maths=maths;
    this.science=science;
    this.social=social;
    
}
int total() {
    return tamil+english+maths+science+social;
}
double average(){
    return total()/5;
}

}
 public class Main {
    public static void main(String[] args){
        student[] students=new student[2];
        marks[] mark=new marks[2];
        students[0]=new student(101,"gokul","ECE","A");
        students[1]=new student(102,"goku","ECE","A");
        mark[0]=new marks(89,67,78,98,90);
        mark[1]=new marks(98,78,89,79,85);
   
        for(int i=0;i<students.length;i++)
        {
            System.out.println("===="+(i+1)+"st STUDENT MARKS DATA====");
            System.out.println("ROLL NO ="+students[i].rollno);
            System.out.println("NAME ="+students[i].name);
            System.out.println("DEPARTMENT ="+students[i].dept);
            System.out.println("SECTION ="+students[i].section);
            System.out.println("TAMIL ="+mark[i].tamil);
            System.out.println("ENGLISH ="+mark[i].english);
            System.out.println("MATHS ="+mark[i].maths);
            System.out.println("SCIENCE ="+mark[i].science);
            System.out.println("SOCIAL ="+mark[i].social);
            System.out.println("TOTAL :"+mark[i].total());
            System.out.println("AVERAGE :"+mark[i].average());
        }
        }
    }
