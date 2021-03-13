public class TextStatement extends Statement {

    public String forWhom(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String whichRental(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
               String.valueOf(aRental.getCharge()) + "\n";
    }
    
    public String customersCharge(Customer aCustomer) {
        return "Amount owed is " +
               String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }
    
    public String earnedPoints(Customer aCustomer) {
        return "You earned " +
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               " frequent renter points";
    }
}
