 // <---------------- ACHIEVED BT METHOD OVERLOADING  --------------->
public class CompileTimePolymorphism {
    public static class shapes{
        int a;
        shapes(){
            System.out.println("i m in shapes constructor");
        }

    }
    public static class triangle extends shapes{
        void area(int l,int b,int h){
            System.out.println("area of triangle is l+b+h " );
        }
        void area(int l,int b){
            System.out.println("area of triangle is l+b+h = " + " ");  // method overloading
        }
        triangle(){
            System.out.println("i m in triangle constructor");
        }
    }
    public static class square extends shapes{
        void print(int side){
            System.out.println("area of square(side) is side*side " );
        }
        void print(int l,int b){         // method overloading
            System.out.println("area of square is side*side");
        }
        square(){
            System.out.println("i m in square constructor");
        }
    }
    public static class number extends shapes{
        int sum(int a,int b,int c){
            return a+b+c;
        }
        double sum(int a,double b ){
            return a+b;
        }
        // method overloading having same name but type argument return type ordering can be different
    }

    public static void main(String[] args) {
        shapes obj=new shapes();
        square obj2=new square();
        // it decides which methods to call at compile time therefore these type of polymorphism is call as compile time polymorphism
        obj2.print(5);
        number obj3=new number();
        System.out.println(obj3.sum(3,6));
    }

    /*
               <---------- OUTPUT ---------->
               i m in shapes constructor
             i m in shapes constructor
                i m in square constructor
              area of square(side) is side*side
             i m in shapes constructor
                 9.0
     */


}
