import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = forWhom(aCustomer);
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for each rental
           result += whichRental(each);
        }
        //add footer lines
        result += customersCharge(aCustomer);
        result += earnedPoints(aCustomer);
        return result;
    }

    private String forWhom(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }


    private String whichRental(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
               String.valueOf(aRental.getCharge()) + "\n";
    }
    
    private String customersCharge(Customer aCustomer) {
        return "Amount owed is " +
               String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }
    
    private String earnedPoints(Customer aCustomer) {
        return "You earned " +
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               " frequent renter points";
    }
}
