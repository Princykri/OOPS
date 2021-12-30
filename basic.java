import com.sun.source.tree.Scope;

public class basic {
    public static void main(String[]  args){

        Student[] name=new Student[5];
           // just declaring
        Student name1;
         name1= new Student(8 ,"princy",98.8f);    // initialization
        // Student name1=new Student();  // declaring+initialization
        System.out.println(name1);  // it will give some random value
        System.out.println(name1.rollno);
        System.out.println(name1.name);
        System.out.println(name1.marks);

        Student name2=new Student(name1);
        System.out.println(name2.name);
        System.out.println(name2.marks);

        Student name3=new Student();
       System.out.println( name3.name);

       // two reference variable pointing to the same object
        Student one =new Student();
        Student two=one;
        one.name="rahul"; // the change will reflect to two also
        two.marks=59.5f;  //the change will reflect to one  also
        System.out.println(two.name);
        System.out.println(one.marks);




    }

    // creating a class
    static class Student {
        int rollno = 3;
        String name;
        float marks;

        // constructor

        // not assign as the name is same
       /*  Student(int rollno ,String name ,float marks ){
            rollno=rollno;
            name=name;
            marks=marks;
        }*/

       /*  Student(int roll, String naam, float num) {
            rollno = roll;
            name = naam;
            marks = num;
        }*/

        // if we want to use same name we have to use "this"
        Student(int rollno ,String name ,float marks ){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }

        // constructor which take the value from another object
        Student(Student other){
            this.rollno=other.rollno;
            this.name=other.name;
            this.marks=other.marks;
        }

        // call a constructor from another constructor
        Student(){
            this(15,"priya",78.6f);
        }

    }

}

