public class HtmlStatement extends Statement {

    public String forWhom(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
               "</EM></H1><P>\n";
    }

    public String whichRental(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
               String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    public String customersCharge(Customer aCustomer) {
        return "<P>You owe <EM>" +
               String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String earnedPoints(Customer aCustomer) {
        return "On this rental you earned <EM>" + 
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               "</EM> frequent renter points<P>";
    }
}
