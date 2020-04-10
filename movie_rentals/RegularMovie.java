public class RegularMovie extends Movie {

    public static final int NUM_DAYS_BASE_CONST = 2;
    public static final int BASE_RENTAL_COST = 2;
    public static final double LONG_TERM_RENTAL_COST = 1.5;
    public static final int FREQUENT_RENTER_POINTS = 1;

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getCharge(int _daysRented) {
        double result = 0;
        // determine amounts for each line
        result += BASE_RENTAL_COST;
        if (_daysRented > NUM_DAYS_BASE_CONST)
            result += (_daysRented - NUM_DAYS_BASE_CONST) * LONG_TERM_RENTAL_COST;
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int _daysRented) {
        int frequentRenterPoints = FREQUENT_RENTER_POINTS;
        return frequentRenterPoints;
    }
}
