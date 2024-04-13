class ThreadNew_1 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread 1");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadNew_2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread 2 (Other)");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread_Methods_2 {
    public static void main(String[] args) {
        ThreadNew_1 T1 = new ThreadNew_1();
        ThreadNew_2 T2 = new ThreadNew_2();
        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
        System.out.println("T1: "+T1.getId());
        System.out.println("T2: "+T2.getId());
        System.out.println("CURRENT THREAD: "+ Threads.currentThread().getId() + " " + Threads.currentThread().getState());
    }
}


// READ DOCUMENTATION

// DAEMON THREAD: LEAST PRIORITY