package JVMArchitechture;


    class DemoObject {
        private int id;

        public DemoObject(int id) {
            this.id = id;
        }
        
        void print() {
        	System.out.println("Object " + id + " is created.");        	
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object " + id + " is garbage collected.");
        }
    }

    public class GarbageCollectionExample {

    public static void main(String[] args) {
        System.out.println("Garbage Collection Demo");

        // Create objects
        DemoObject obj1 = new DemoObject(1);
        DemoObject obj2 = new DemoObject(2);

        // invoking methods
        obj1.print();
        obj2.print();
        
        // Make objects eligible for garbage collection
        obj1 = null; // Remove reference to obj1
        obj2 = null; // Remove reference to obj2

        // Suggest the JVM to run garbage collection
        System.out.println("Calling System.gc()");
        System.gc();

        // Allow time for GC to occur
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}

