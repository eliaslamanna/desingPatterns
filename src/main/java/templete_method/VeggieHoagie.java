package templete_method;

public class VeggieHoagie extends Hoagie {
    private String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    private String[] condimentsUsed = { "Oil", "Vinegar" };

    //Con esto hago que no se ejecuten los pasos de agregar carne o queso
    @Override
    public boolean customerWantsMeat() { return false; }
    @Override
    public boolean customerWantsCheese() { return false; }

    @Override
    public void addVegetables(){
        System.out.print("Adding the Vegetables: ");
        for (String vegetable : veggiesUsed){
            System.out.print(vegetable + " ");
        }
    }

    @Override
    public void addCondiments(){
        System.out.print("Adding the Condiments: ");
        for (String condiment : condimentsUsed){
            System.out.print(condiment + " ");
        }
    }

    //Dejo los metodos vacios
    @Override
    public void addMeat() {}

    @Override
    public void addCheese() {}
}
