public class DaemonThrd extends Thread {
    public void run() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        DaemonThrd ob = new DaemonThrd();
        ob.setDaemon(true);
        ob.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(ob.isDaemon());
        System.out.println(ob.isAlive());
    }
}

// Output Not Consistent:
// Thread scheduling varies per execution
// Sometimes the main thread is given priority, making daemon thread barely run
// Other times the daemon thread gets a chance to run before termination
// This is why we see different outputs in different runs