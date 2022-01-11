// <---------------- ACHIEVED BT METHOD OVERRIDING  --------------->
public class RunTimePolymorphism {
     public static class  shapes{
         void area(){
             System.out.println("area is side + side + side+side");  // method overriding
         }
     }
     public static class triangle extends shapes{
         void area(){
             System.out.println("area is side +side+side");  // method overriding
         }
     }
     public static class circle extends shapes{
         @Override
         void area(){
             System.out.println("area is pi* r * r ");   // method overriding
         }
     }

    public static void main(String[] args) {
        circle obj=new circle();
        obj.area();
    }
}
