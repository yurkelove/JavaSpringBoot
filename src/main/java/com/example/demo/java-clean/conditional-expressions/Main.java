public class Main {
    public static void main(String[] args) {
        // if-else
        // switch

        int number = -5;

        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }

        boolean hasId = true;
        double balance = 352.8;

        // hasId == true, просто как и в js hasId
        boolean isAllowed = balance >= 150.0 && hasId == true;

        if (isAllowed) {
            System.out.println("Access is granted");
        } else {
            System.out.println("No access!");
        }

        // switch
        int day = 3;
        switch (day) {
            case 1: {
                System.out.println("This is monday");
                break;
            }
            case 2: {
                System.out.println("This is Thuesday");
                break;
            }
            case 3: {
                System.out.println("This is Wensday");
                break;
            }
            default: {
                System.out.println("This is other day");
                break;
            }
        }

        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "This is a weekday";
            default -> "Default";
        };
    }
}
