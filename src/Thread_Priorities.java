class Threads extends Thread{
    Threads(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i < 100){
            i++;
            System.out.println("Thread "+this.getName());
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: Has list of all the RUNNABLE threads.
        // Thread Scheduler assigns CPU to them.

        // Default priority of a thread is 5 (NORM_PRIORITY).
        // The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

        Threads threads1 = new Threads("**");
        Threads threads2 = new Threads("****");
        Threads threads3 = new Threads("******");
        Threads threads4 = new Threads("********");
        Threads threads5 = new Threads("**********");

        threads2.setPriority(Thread.MIN_PRIORITY);
        threads4.setPriority(Thread.MAX_PRIORITY);

        threads1.start();
        threads2.start();
        threads3.start();
        threads4.start();
        threads5.start();
    }
}
