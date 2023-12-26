
public class Atm {

    public static void main(String[] args) {
        String cardType = "Master";

        boolean result = processTransaction(cardType);

        if (result) {
            System.out.println("Transaction Accepted");
        } else {
            System.out.println("Transaction Rejected");
        }
    }

    public static boolean processTransaction(String cardType) {
        if ("Premium".equals(cardType)) {
            return false;
        } else if ("Master".equals(cardType)) {
            acceptTransaction();
            return true;
        } else if ("Youth".equals(cardType)) {
            return false;
        } else {
            return error();
        }
    }

    private static void acceptTransaction() {
        System.out.println("Transaction Accepted for Master Card");

    }

    private static boolean error() {
        System.out.println("Error in Card Type");
        // Implement the error handling logic
        return false;
    }


    }

