class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<1000){
            i++;
            System.out.println("Thread 1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<1000){
            i++;
            System.out.println("Thread 2");
        }
    }
}

public class Threading_by_Runnable_Interface {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        // Before NEW
        gun1.start(); // NEW TO RUNNABLE (thread scheduler can select it now, so it goes RUNNING)
        // IO Interrupt : NON-RUNNABLE
        gun2.start();
        // When run method completes, it goes from RUNNABLE to the TERMINATED state.

    }
}