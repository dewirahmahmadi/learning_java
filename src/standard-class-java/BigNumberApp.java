import java.math.BigInteger;

public class BigNumberApp {

    public static void main(String[] args) {
        // BigInteger dan BigDesimal digunakan untuk menghandle kelebihan data Long dan float yang besar.
        // Big Integer  = handle tipe data Integer
        // Big Decimal = handle tipe data floating point

        BigInteger a = new BigInteger("1000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000");

        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
