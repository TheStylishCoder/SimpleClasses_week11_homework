public class Printer {

    private int numberOfSheets;

    public Printer(int numberOfSheets){
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public int print(int numberOfPages, int numberOfCopies) {
        int paperNeeded = numberOfPages * numberOfCopies;
        if(this.numberOfSheets >= paperNeeded){
            this.numberOfSheets = this.numberOfSheets - paperNeeded;
            return this.numberOfSheets;
        } else {
            return this.numberOfSheets;
        }
    }
}
