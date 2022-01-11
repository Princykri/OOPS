public class box {
    public static class base{
        double h;
        double l;
        double b;
        //  double weight;  -->fot super keyword " 2nd use case "
        base(){
            l=-1;
            b=-1;
            h=-1;
            System.out.println("i m in base class");
        }
        base(double l, double b){
            this.l=l;
            this. b=b;

        }
        base(double l, double b,double h){
            this.l=l;
           this. b=b;
           this. h=h;
        }


    }
    public static class child extends base{
        double weight;

         child(){
            this.weight=-1;
             System.out.println("i m in child class");
        }
        child(double l, double b, double h ,double weight){
             super(l,h,h);  // call the parent class constructor
             this.weight=weight;

             // it gives an error , parent class should be initialised first -->because the child class care about the parent class
             //   this.weight=weight;
            //     super(l,h,h);

          //   System.out.println(super.weight);  --> it accesses the "weight" instance variable of base class directly
            //   System.out.println(this.weight); -->it accesses the "weight" instance variable of this class i.e, child class


        }

    }

    public static void main(String[] args) {
//        base box1=new base();
//        System.out.println(box1.h);
//        base box2=new base(7,6);
//        System.out.println(box2.b);
//        base box3=new base(1,3,5);
//        System.out.println(box3.h);


//        child box4=new child();
//        box4.l=90;
//        box4.weight=9;
//        System.out.println(box4.weight);

        child box4=new child(3,6,8,5);
        System.out.println(box4.l+" , " +box4.b+" ,"+box4.h+" ,"+box4.weight);


    }
}
