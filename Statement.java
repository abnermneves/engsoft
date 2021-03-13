import java.util.Enumeration;

public abstract class Statement {
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

    public abstract String forWhom(Customer aCustomer);

    public abstract String whichRental(Rental aRental);

    public abstract String customersCharge(Customer aCustomer);

    public abstract String earnedPoints(Customer aCustomer);
}
