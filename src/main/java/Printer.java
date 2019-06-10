public class Printer {

    private int numOfSheets;
    private int tonerVolume;

    public Printer(int numOfSheets, int tonerVolume){
        this.numOfSheets = numOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumOfSheets(){
        return numOfSheets;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

    public void print(int numOfPages, int numOfCopies){
        if (numOfPages * numOfCopies <= numOfSheets) {
            this.numOfSheets -= (numOfPages * numOfCopies);
            this.tonerVolume -= numOfPages;
        }
    }
}
