public class TypeConversions {
    public static void main(String[] args) {
        // compiler automatically converting type
//        int value1 = 10;
//        long value2 = 23452345;
//        double value3 = 34.5;
//        double result = value1 / value2 / value3;
//
//        System.out.println(value1 / value2);
//        long longValue = 999999999;
//        int intValue = (short)longValue;
//        System.out.println(intValue);
        String myChar = "a";
        char myChar2 = 'A';
        int myValue = myChar2;
        char myValue2 = 0;
        char myChar3 = myChar2;
        System.out.println(myValue2);

//        int value1 = 2;
//        int value2 = 1;
//
//        double value1 = 3.3;
//        int intValue = (int)value1;
//        System.out.println(intValue);
        double determinate = 10.8;
        if (determinate > 0) {
            // you have 2 roots
            System.out.println("it is true!");
        } else if (determinate == 0){
            // you have one root
        } else {
            // you have no roots
        }

    }
}
