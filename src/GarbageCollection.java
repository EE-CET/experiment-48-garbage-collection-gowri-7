public class GarbageCollection {

    // Override finalize() method
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        // Create object
        GarbageCollection obj = new GarbageCollection();

        // Make object eligible for GC
        obj = null;

        // Request Garbage Collection
        System.gc();
    }
}
