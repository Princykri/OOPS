public class methodBasic {
    public abstract static class parent{
        int age;
        public parent(int age){
            this.age=age;
        }
        void normal(){
            // Abstract class can have normal method
        }
        static void greeting(){
            // Abstract class can have static method
        }
//        abstract static void greeting2(){
//            // we can't create abstract static method
//        }
//           abstract parent(){
//            // we can't create abstract constructor
//           }


       abstract public void career() ;
       abstract public void patner();

    }
    public  static class son extends parent{
        public son( int age){
            super(age);

//            this.age=age;
        }
        public void career (){
            System.out.println(" i want to be a software engineer ");
        }
        public void patner(){
            System.out.println("i love to work with my friend" );
        }

    }
    public  static class daughter extends parent{
        public daughter(int age){
            super(age);       //--> both can be use --if this is use we have to make constructor in the parent class to set the value
//            this.age=age;
        }

        @Override
        public void career() {
            System.out.println(" i want to be a ");
        }

        @Override
        public void patner() {
            System.out.println("i love to work with  potter " );
        }
    }

    public static void main(String[] args) {
//        son obj=new son();
//        daughter obj1=new daughter();
//        obj.career();
//        obj1.patner();

        son obj=new son(30);
        daughter obj1=new daughter(25);
        obj.career();
        obj1.patner();

      //   parent obj3=new parent() ;     object can't be created of abstract class
        parent obj2=new daughter(34);   //--> we can use like this

    }
}
/*
Any class that contains one or more abstract methods must also be declared abstract.
# There can be no objects of an abstract class.
# You cannot declare abstract constructors -->nothing is present in parent body
#    as static method can't be overridden  and  abstract method should be overridden therefore, static method can't be abstract
# Even we can't make object of  abstract class , we can use that class as reference variable
 */
