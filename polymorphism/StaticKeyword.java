public class StaticKeyword {
    public static class base{
        void print(){
            System.out.println("i m in base class of print method");
        }
        static void greeting(){
            System.out.println(" i m in base class of Greeting!");
        }
    }
    public static class child extends base{
        void print(){
            System.out.println("i m in child class of print method");
        }
       //  @Override  --> ERROR
        static void greeting(){
            System.out.println(" i m in child class of Greeting !");
        }
    }

    public static void main(String[] args) {
    //        base obj1=new base();
     //        obj1.greeting();
        // we can directly access the greeting method by class name or by creating obj --> because we know static doesn't depend on object
        base.greeting();
        child.greeting();
        base obj= new child();
        obj.greeting();   //--> it prints the base class instead of child class because static doesn't depend on obj

    }
}

/*
    static method can't be overridden
       LOGIC---:
          overridden depends on object
          static doesn't depend on object
          hence , static can't be overridden although is can be inherited

          note:- static can be inherited but can't override
 */
