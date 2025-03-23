public class Priority extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            // yield() hints the compiler to pause the current thread and
            // execute another thread of equal priority to the current thread
            Thread.yield();
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Priority ob = new Priority();
        System.out.println(ob.getState());
        ob.setPriority(10);
        ob.start();
        System.out.println(ob.getState());
        Priority ob1 = new Priority();
        ob1.setPriority(5);
        ob1.start();
        System.out.println("Main Method");
        System.out.println(ob.getPriority());
        System.out.println(ob1.getPriority());
        System.out.println(ob1.getState());
    }
}
