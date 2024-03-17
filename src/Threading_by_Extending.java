class MyThread extends Thread{
    int num;
    MyThread(int num){
        this.num = num;
    }

    @Override
    public void run(){ // Overriding
        while (true){
            System.out.println("Thread " + num);
        }
    }
}

class OtherThread extends Thread{
    @Override
    public void run(){ // Overriding
        while (true){
            System.out.println("Other Thread");
        }
    }
}

public class Threading_by_Extending {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        MyThread myThread3 = new MyThread(3);
        OtherThread otherThread = new OtherThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();
        otherThread.start();
    }
}
