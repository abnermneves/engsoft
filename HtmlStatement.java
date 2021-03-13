import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
               "</EM></H1><P>\n";
    }

    private String whichRental(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
               String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    private String customersCharge(Customer aCustomer) {
        return "<P>You owe <EM>" +
               String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    private String earnedPoints(Customer aCustomer) {
        return "On this rental you earned <EM>" + 
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               "</EM> frequent renter points<P>";
    }
}
