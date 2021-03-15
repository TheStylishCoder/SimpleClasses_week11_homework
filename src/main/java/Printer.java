public class Printer {

    private int numberOfSheets;
    private int toner;

    public Printer(int numberOfSheets, int toner){
        this.numberOfSheets = numberOfSheets;
        this.toner = toner;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public int getToner() {
        return toner;
    }

    //original function but changed to boolean below
//    public int print(int numberOfPages, int numberOfCopies) {
//        int paperNeeded = numberOfPages * numberOfCopies;
//        if(this.numberOfSheets >= paperNeeded){
//            this.numberOfSheets = this.numberOfSheets - paperNeeded;
//            return this.numberOfSheets;
//        } else {
//            return this.numberOfSheets;
//        }
//    }

    public boolean print(int numberOfPages, int numberOfCopies) {
        int paperNeeded = numberOfPages * numberOfCopies;
        if(this.numberOfSheets >= paperNeeded){
            this.numberOfSheets = this.numberOfSheets - paperNeeded;
            return true;
        } else {
            return false;
        }
    }
}
