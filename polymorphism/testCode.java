public class testCode {
    public static class A{
        int ivar=7;
        void m1(){
            System.out.println(" a's m1 ");
        }
        void m2(){
            System.out.println(" a's m2 ");
        }
        void m3(){
            System.out.println(" a's m3 ");
        }
    }
    public static class B extends A{
        void m1(){
            System.out.println(" b's m1 ");
        }
    }
    public static class C extends B{
        void m3(){
            System.out.println(" c's m3 "+ (ivar+6));
        }
    }

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        A a2=new C();
        a.m1();
        b.m2();
        c.m3();

    }
}
/*
          --CODE---                      --ANSWER---

          c.m1();                           b's m1
           c.m2();                          a's m2
          c.m3();                           c's m3 13



        a2.m1();                            b's m1
        a2.m2();                             a's m2
        a2.m3();                            c's m3 13

        b.m1();                             b's m1
        c.m2();                             a's m2
        a.m3();                             a's m3

         a.m1();                            a's m1
         b.m2();                           a's m2
         c.m3();                          c's m3 13


 */
