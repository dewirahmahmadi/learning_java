import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringApp {

    public static void main(String[] args) {
        String name = "Hello World";
        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLower);
        System.out.println(nameUpper);

        //String is immutable, the value is not change.
        //When create update the value of string, java create new string for us

        //When we want to manipulate string with large quantity,
        //not recommended to use string, because it will take much memory
        //in this case, use StringBuffer and StringBuilder

        //StringBuffer thread safe
        //StringBuilder not thread safe

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("There!");
        builder.append("Have a nice day!");

        System.out.println(builder.toString());

        //String Joiner
        String [] greets = {"Hello", "World!", "Have a nice day!"};
        StringJoiner joiner = new StringJoiner(" ", "[", "]");

        for (String greet : greets) {
            joiner.add(greet);
        }

        System.out.println(joiner.toString());

        //StringTokenizer Class
        //Use when to split long string 
        String greet = "Have a nice day!";
        StringTokenizer tokenizer = new StringTokenizer(greet, " ");

        while ((tokenizer.hasMoreTokens())) {
            System.out.println(tokenizer.nextToken());
        }


    }
}
