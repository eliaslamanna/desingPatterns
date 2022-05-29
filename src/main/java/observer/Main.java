package observer;

public class Main {
    public static void main(String[] args) {

        //Creo el Subject
        StockSubject stockGrabber = new StockSubject();

        //Creo observers
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        System.out.println("AHORA CON THREADS");
        //Aca se puede hacer con threads
        Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getApple = new GetTheStock(stockGrabber, 2, "Apple", 677.60);
        Runnable getGoogle = new GetTheStock(stockGrabber, 2, "Google", 676.40);

        //llamo a los threads
        new Thread(getIbm).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();
    }
}
