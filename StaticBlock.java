public class StaticBlock {
    static int a=4;
    static int b;

    // static block will only run once,when the first obj is created i.e,
    // when thr class is loaded at first time the static block is run
    static{
        System.out.println("i m in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" " +StaticBlock.b);
        StaticBlock.b +=3;
        System.out.println(StaticBlock.a+" " +StaticBlock.b);
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" " +StaticBlock.b);


    }

}
