package observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    //contador estatico
    private static int observerIDtracker = 0;

    //id de cada observer para diferenciarlos
    private int observerId;

    private Subject stockGrabber;

    public StockObserver(Subject stockSubject) {
        this.stockGrabber = stockSubject;

        this.observerId = ++observerIDtracker;

        System.out.println("New observer: " + this.observerId);

        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        printPrices();
    }

    public void printPrices() {
        System.out.println(observerId + "\nIBM: " + ibmPrice + "\nAPPLE: " +
                applePrice + "\nGOOGLE: " + googlePrice + "\n");
    }

}
