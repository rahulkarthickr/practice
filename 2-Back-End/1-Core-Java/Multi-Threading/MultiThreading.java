class One extends Thread {

}

public class MultiThreading extends Thread implements Runnable {
    public void run() {
        System.out.println("hello");
        Thread.currentThread().setName("java");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        One ob = new One();
        ob.start();
        MultiThreading obj = new MultiThreading();
        Thread t = new Thread(obj);
        t.start();
        Thread t1 = new Thread(obj);
        t1.start();
        ob.setName("First Thread");
        t.setName("second Thread");
        t1.setName("Thrd thread");
        System.out.println(ob.getName());
        System.out.println(t1.getName());
        Thread.currentThread().setName("MultiThreading");
        System.out.println(Thread.currentThread().getName());
    }
}
