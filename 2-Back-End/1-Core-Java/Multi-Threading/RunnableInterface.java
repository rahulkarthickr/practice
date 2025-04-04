interface Runnable {
    void run();
}

class RunnableInterface implements Runnable {
    private Runnable target;

    // 2. Since default constructor used, no target is passed,
    // so this.target remains null
    RunnableInterface() {
    }

    RunnableInterface(Runnable target) {
        this.target = target;
    }

    @Override
    // 5. The overriden run() method statement is executed
    public void run() {
        System.out.println("Running in MyThread");
    }

    public void start() {
        if (target != null) {
            target.run();
        } else {
            // 4. In this case, target == null, so this.run() is called
            this.run();
        }
    }

    public static void main(String[] args) {
        // 1. A new object myThread is created using the default constructor
        RunnableInterface myThread = new RunnableInterface();
        // 3. The start() method checks whether target is null
        myThread.start();
    }
}
