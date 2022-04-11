package abstract_factory;

public abstract class EnemyShip {

    protected String name;
    protected ESWeapon weapon;
    protected ESEngine engine;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Because I defined the toString method in engine
    // when it is printed the String defined in toString goes
    // on the screen

    public void followHeroShip(){

        System.out.println(getName() + " is following the hero at " + engine );

    }

    public void displayEnemyShip(){

        System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots(){

        System.out.println(getName() + " attacks and does " + weapon);

    }

    public abstract void makeShip();


    @Override
    public String toString() {
        return "EnemyShip{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", esEngine=" + engine +
                '}';
    }
}
