public class FinalKeyword {
    public static class base{
        void print(){
            System.out.println("i m in base class");
        }

//       final  void print(){
//            System.out.println("i m in base class");    ----> Early binding
//        }
       //  final -> it is used to prevent inheritance and overriding
    }




    public static class child extends base{
        void print(){
            System.out.println("i m in child class");
        }
    }

    public static void main(String[] args) {
        child obj=new child();
            obj.print();

    }

}
