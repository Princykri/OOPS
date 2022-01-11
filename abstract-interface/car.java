public class car {
    public interface Engine {
        int value = 90;          //--> already final static

        void start();

        void stop();                //---> abstract
    }
    public interface music {
        void start();
        void stop();
    }
    public interface brake {
        void brake();
    }


    public static class Car implements Engine,brake, music {
        public void start(){
            System.out.println(" start the engine");
        }

        @Override
        public void stop() {
            System.out.println(" stop the engine");
        }


        @Override
        public void brake() {
            System.out.println(" i m brake ");

        }
    }




        public static void main(String[] args) {
        Car obj =new Car();
        Engine obj2 =new Car();
        obj.start();
        obj.brake();
        music obj3=new Car();
        obj3.start();           //-->  start the engine
            // when we want to start the music player it starts the engine  -->problem --> solved by creating NiceCar

    }
}


/*
 Interface is like class but not completely. it is like an abstract class.
By default functions are public and abstract in interface.
variables are final and static by default in interface.
 */
