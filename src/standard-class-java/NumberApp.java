public class NumberApp {

    public static void main(String[] args) {

        //Konversi Number
        Integer intValue = 19;

        Long longVal = intValue.longValue();
        Double doubleVal = intValue.doubleValue();

        //Koversi String ke Number
        String stringNumb = "10000";

        //Konversi Objek Integer
        Integer integerNum = Integer.valueOf(stringNumb);

        //Konversi Primitif Integer
        int integerNumPrif = Integer.parseInt(stringNumb);


    }
}
