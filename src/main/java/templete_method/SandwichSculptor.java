package templete_method;

public class SandwichSculptor {
    public static void main(String[] args) {
        Hoagie cust12 = new ItalianHoagie();

        cust12.makeSandwitch(); //llamado al Template Method

        Hoagie cust15 = new VeggieHoagie();

        cust15.makeSandwitch();
    }
}
