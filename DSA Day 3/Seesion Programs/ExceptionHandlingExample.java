public class ExceptionHandlingExample {

    public static void main(String[] args) {

        try {
            placeOrder();
        } catch (ArithmeticException exception) {

            System.out.println("Payment calculation failed.");
            System.out.println(
                    "Reason: " + exception.getMessage()
            );

            exception.printStackTrace();
        }
    }

    static void placeOrder() {
        processPayment();
    }

    static void processPayment() {
        calculateAmount();
    }

    static void calculateAmount() {

        int totalAmount = 5000;
        int numberOfPeople = 0;

        int amountPerPerson =
                totalAmount / numberOfPeople;

        System.out.println(amountPerPerson);
    }
}