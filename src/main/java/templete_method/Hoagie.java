package templete_method;

public abstract class Hoagie {

    //Template Method
    final void makeSandwitch() {
        cutBun(); //es un metodo que siempre se va a ejecutar

        if(customerWantsMeat()) {  //van a ser opcionales dependiendo del tipo de sandwich y de la preferencia del cliente
            addMeat();
        }

        if(customerWantsCheese()) {
            addCheese();
        }

        if(customerWantsVegetables()) {
            addVegetables();
        }

        if(customerWantsCondiments()) {
            addCondiments();
        }

        wrapTheHoagie(); //siempre se va a ejecutar
    }

    public void cutBun() {
        System.out.println("The Hoagie is cut");
    }

    public void wrapTheHoagie() {
        System.out.println("Wrap the Hoagie");
    }

    public abstract void addMeat(); //abstract para forzar a implementarlo en las clases hijas
    public abstract void addCheese();
    public abstract void addVegetables();
    public abstract void addCondiments();

    public boolean customerWantsMeat() { //en este caso es opcional si queres sobreescribir o no
        return true;
    }

    public boolean customerWantsCheese() {
        return true;
    }

    public boolean customerWantsVegetables() {
        return true;
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
