import java.sql.SQLOutput;

public class IfStatement {
    public static void main(String[] args) {
//        int score = 100;
//        boolean automaticA = false;
//        if (score > 90 || automaticA) {
//            System.out.println("You got an A");
//        } else if (score > 80) {
//            System.out.println("You got an B");
//        } else if (score > 70) {
//            System.out.println("You got an C");
//        } else if (score > 60) {
//            System.out.println("You got an D");
//        } else {
//            System.out.println("You got an F");
//        }


        int dayOfWeek = 8;

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("You entered a invalid value");

        }
    }
}
