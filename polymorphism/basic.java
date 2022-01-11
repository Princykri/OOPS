public class basic {
    public static class base{
        int a;
        int b;
        void sum(){
            System.out.println("i m in sum of base class");
        }
        base(){
            System.out.println("i m in base constructor of base class");
        }
        base(int e){   // constructor overloading
            System.out.println("i m in base constructor of base class having int value " +" "+e);
        }
    }
    public static class child extends base {
        int c;
        int d;
//        void sum(){       // method overriding
//            System.out.println("i m in sum  of child class ");
//        }
        child(){
            System.out.println("i m in child constructor of child class");
        }
        child(int f){
            System.out.println("i m in child constructor of child class having nt value " +" "+f);
        }
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.sum();
        child obj1=new child(6);
        base obj2=new base(9);

    }
}

/*
       poly ---> many
       morphism --->ways to represent

       act of representing the same thing in multiple ways
 */

/*
         ----------OUTPUT ---------------
         i m in base constructor of base class
            i m in child constructor of child class
             i m in sum of base class
          i m in base constructor of base class
           i m in child constructor of child class having nt value  6
                i m in base constructor of base class having int value  9
 */
