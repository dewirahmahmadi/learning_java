import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        //Properties class digunakan untuk mengambil
        //atau menyimpan informasi ke file properties

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String first = properties.getProperty("name.firstname");
            String last = properties.getProperty("name.lastname");
            System.out.println(first);
            System.out.println(last);

        }catch (FileNotFoundException exception) {
            System.out.println("File Tidak ketemu");
        }catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }


        try {
            Properties properties = new Properties();
            properties.put("name.first", "Moka");
            properties.put("name.last", "Mentari");

            properties.store(new FileOutputStream("name.properties"),"Konfigurasi Nama");

        }catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error menyimpan properties");
        }
    }
}
