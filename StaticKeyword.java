import com.sun.tools.javac.Main;

public class StaticKeyword {

    public static void main(String[] args){
       //  greeting();   // we can't use this directly because it needs an instance to call a non-static function
        greeting2(); // it can easily access

        // we can't access a non-static stuff without referencing their instance in static context
       StaticKeyword obj=new StaticKeyword();     //so here is the way to reference
       obj.greeting();




    }

    // we know that something which is non-static ,is belongs to an object
       static void greeting(){
        System.out.println("hello");
        greeting2();

    }
    static void greeting2 (){
        System.out.println("hello,good morning!");

    }

    /* we can't access any non-static method directly from static method
       but,
       we can access any static method from non-static method
     */
}
