 // --------------- RUNTIME POLYMORPHISM ----------------
public class methodDisptach {
    public static class phone{
        double h;
        double l;
        double b;
        phone(){
            l=-1;
            b=-1;
            h=-1;
        }
        phone(double l, double b,double h){
            this.l=l;
            this. b=b;
            this. h=h;
        }
        public void greet(){
            System.out.println("good morning");
        }
        public void name(){
            System.out.println("turning on the phone");
        }
    }

   public static  class smartphone extends phone{
       double weight;

       smartphone(){
           this.weight=-1;
       }
       smartphone(double l, double b, double h ,double weight) {
           super(l, h, h);  // call the parent class constructor
           this.weight = weight;
       }

        public void name(){
            System.out.println("turning on the smartphone");
        }
        public void ringing(){
            System.out.println("ringing the Smartphone");
        }
    }

    public static void main(String[] args) {
        phone obj =new phone();
        obj.name();
        phone obj1=new smartphone();
        obj1.greet();
        obj1.name();
       //  obj.ringing(); -->not allowed

       // smartphone obj2=new phone();-->not allowed

        phone box5= new smartphone(6,7,8,6);
        System.out.println(box5.h);
        // System.out.println(box.weight);  weight can't be access as the reference type is base and base don't know about the weight variable


        /*  not a valid statement
        child box6= new base(6,7,8);
         */
    }


}

/*
Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than
compile time. Dynamic method dispatch is important because this is how Java implements run-time polymorphism.
Let’s begin by restating an important principle: a superclass reference variable can refer to a subclass object.
When an overridden method is called through a superclass reference, Java determines which version of that method to
execute based upon the type of the object being referred to at the time the call occurs. Thus, this determination is
made at run time.
In other words, it is the type of the object being referred to (not the type of the reference variable)
that determines which version of an overridden method will be executed.
 */

/*
         ------- OUTPUT ---------
               turning on the phone
                   good morning
                 turning on the smartphone
                       8.0
 */
