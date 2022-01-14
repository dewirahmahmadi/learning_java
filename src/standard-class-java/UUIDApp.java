import java.util.UUID;

public class UUIDApp {
    //Create unique id
    public static void main(String[] args) {
        for (int i = 0; i<100; i++) {
            UUID uuid = UUID.randomUUID();
            String uuidString = uuid.toString();
            System.out.println(uuidString);
        }
    }
}
