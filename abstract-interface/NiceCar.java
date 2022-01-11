public class NiceCar {
    public interface Engine{
        void start();
        void stop();
    }
    public interface musicplayer{
        void start();
        void stop();
    }
    public interface brake{
        void brake();
    }

     //--- creating the separate class for each interface ------

    public static class Powerengine implements Engine{
        public void start(){
            System.out.println(" i will start the power engine");
        }

        @Override
        public void stop() {
            System.out.println(" i will stop the power engine");
        }
    }

    public static class Electricengine implements Engine{
        public void start(){
            System.out.println(" i will start the electric engine");
        }

        @Override
        public void stop() {
            System.out.println(" i will stop the electric engine");
        }
    }

    public static class mxplayer implements musicplayer{

        @Override
        public void start() {
            System.out.println(" i will start the mxplayer");
        }

        @Override
        public void stop() {
            System.out.println(" i will start the mxplayer");
        }
    }
    public class startbrake implements brake{
        public void brake(){
            System.out.println(" i will press the brake");
        }
    }
    // ---- creating a single class where all the function r mentioned -----
    public static  class mynicecar{
        private Engine engine;
        private mxplayer mxplayer=new mxplayer();
        public mynicecar(){
            engine =new Powerengine();
        }
        public void start(){
            engine.start();
        }
        public void stop(){
            engine.stop();
        }
        public void startmusic(){
            mxplayer.start();
        }
        public void stopmusic(){
            mxplayer.stop();
        }
        public void upgrade(){
            this.engine= new Electricengine();
        }
    }

    // ------------ main function -------------
    public static void main(String[] args) {
        mynicecar obj= new mynicecar();
        obj.start();
        obj.startmusic();
        obj.upgrade();
        obj.start();


    }
}
