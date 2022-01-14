public class SystemApp {
    public static void main(String[] args) {

        // Get Current Time on system
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        //Get Current Env
        System.out.println(System.getenv("HOME"));


        System.gc();

        //Terminate Java Program
        System.exit(0);
    }
}
