package Assignment;

public class Amazon extends CanaraBank {

    @Override
    public void cashOnDelivery() {
        System.out.println("Selected Mode: Cash on Delivery");
    }

    @Override
    public void upiPayments() {
        System.out.println("Selected Mode: UPI Payments");
    }

    @Override
    public void cardPayments() {
        System.out.println("Selected Mode: Card Payments");
    }

    @Override
    public void internetBanking() {
        System.out.println("Selected Mode: Internet Banking");
    }

    @Override
    public void withdrawalLimit() {
        System.out.println("Payment details recorded successfully in Canara Bank");
    }

    public static void main(String[] args) {

        Amazon a = new Amazon();
        a.cashOnDelivery();
        a.upiPayments();
        a.cardPayments();
        a.internetBanking();
        a.withdrawalLimit();
    }
}
