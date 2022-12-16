package application;

public class Menu {

    public static void showMainMenu() {
        System.out.println("Main menu");
        System.out.println("1-Records");
        System.out.println("2-Sales");
        System.out.println("3-Reports");
        System.out.println("4-Exit");
    }

    public static void showRecordsMenu() {
        System.out.println("Main menu");
        System.out.println("1-Show product table");
        System.out.println("2-Show clients table");
        System.out.println("3-Show employee table");
        System.out.println("4-Exit");
    }

    public static void showSalesMenu() {
        System.out.println("Sales menu");
        System.out.println("1-Register a new product");
        System.out.println("2-Make a sale");
        System.out.println("3-Register a new client");
        System.out.println("4-Back to main menu");
    }

    public static void showReportsMenu() {
        System.out.println("Reports menu");
        System.out.println("1-Show the biggest sale");
        System.out.println("2-Show the total sales");
        System.out.println("3-Show one sale of a specific client"); //opçao 3 use o sale id
        System.out.println("4-Go back to main menu");
    }

    //Method to generate a random code
    public static String generateCode(int length) {
        String alphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int charactere = (int)(alphaNumericStr.length() * Math.random());
            stringBuilder.append(alphaNumericStr.charAt(charactere));
        }
        return stringBuilder.toString();
    }

    public static int generateID() {
        return (int)(Math.random() * 10000 + 1);
    }

    public static int generateSaleID() {
        return (int)(Math.random() * 9999 + 1);
    }
}
