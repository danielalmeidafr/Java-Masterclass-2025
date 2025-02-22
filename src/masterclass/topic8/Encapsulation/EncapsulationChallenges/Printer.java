package masterclass.topic8.Encapsulation.EncapsulationChallenges;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        this.tonerLevel += tonerAmount;
        if (this.tonerLevel < 0 || this.tonerLevel > 100) {
            return -1;
        } else {
            return tonerLevel;
        }
    }

    public int printPages(int pages){

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += jobPages;

        if (duplex) {
            System.out.print("Is a duplex printer. ");
        } else {
            System.out.print("Isn't a duplex printer. ");
        }

        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
