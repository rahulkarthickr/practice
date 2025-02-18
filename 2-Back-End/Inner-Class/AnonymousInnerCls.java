public class AnonymousInnerCls {
    void demo() {
        System.out.println("normal method");
    }

    public static void main(String[] args) {
        // Anonymous Inner Class Extending AnonymousInnerCls
        // It does not create a new named subclass but rather an inline subclass
        AnonymousInnerCls ob = new AnonymousInnerCls() {
            // This anonymous inner class overrides the demo() method
            void demo() {
                System.out.println("demo method");
            }
        };
        // When called, it will invoke the overridden version of anonymous inner class
        ob.demo();
        // As it is anonymous inner class, it will have synthetic class name (Anony$1)
        System.out.println(ob.getClass());
        // Anonymous Inner Class Extending Thread
        // new Thread() creates an anonymous inner class of Thread
        // Inside the anonymous inner class, the run() method is overridden
        Thread t = new Thread() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t.start();
        // Anonymous Inner Class Implementing Runnable
        // new Runnable() creates an anonymous inner class implements the Runnable
        // Inside the anonymous inner class, the run() method is overridden
        // This Runnable instance r is passed to Thread t1, which starts a new thread
        Runnable r = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}