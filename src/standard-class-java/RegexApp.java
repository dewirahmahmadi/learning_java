import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        //Regex (Regular Expression) == cara untuk melakukan pola pencarian
        //class yang dapat digunakan yaitu Pattern Class dan Matcher Class
        //Pattern Class == representasi hasil kompilasi dari regex yang kita buat
        //Matcher Class == engine untuk melakukan pencarian dari pattern yang telah di buat

        String name = "Moka Mentari ngoding";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }


    }
}
