import java.util.Scanner;

class FirstThread extends Thread{
    public FirstThread(String name){
        super(name);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i<20){
            System.out.println("Thread : "+this.getName() + " & State : "+ this.getState());
            i++;
        }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        FirstThread firstThread1 = new FirstThread("Ali");
        FirstThread firstThread2 = new FirstThread("Rahul");

        System.out.println("ID    of Thread 1: "+firstThread1.getId());
        System.out.println("Name  of Thread 1: "+firstThread1.getName());
        System.out.println("State of Thread 1: "+firstThread1.getState());

        firstThread1.start();
        firstThread2.start();

        System.out.println("ID    of Thread 2: "+firstThread2.getId());
        System.out.println("Name  of Thread 2: "+firstThread2.getName());
        System.out.println("State of Thread 2: "+firstThread2.getState());
    }
}
