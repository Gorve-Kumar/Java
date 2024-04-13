class ThreadNew1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread 1");
        }
    }
}

class ThreadNew2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread 2 (Other)");
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        ThreadNew1 T1 = new ThreadNew1();
        ThreadNew2 T2 = new ThreadNew2();
        // CPU Available to Both.
//            T1.start();
//            T2.start();

        // T1 waits for T2
        T1.start();
        try {
            T1.join();
        } catch (Exception exception){
            System.out.println("Exception: "+exception);
        }
        // T1 might be killed. Exception

        T2.start(); // start after T1 ends now.
    }
}
