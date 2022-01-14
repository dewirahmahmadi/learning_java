public class RuntimeApp {
    public static void main(String[] args) {
        //Memory JVM
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.totalMemory());
    }
}
