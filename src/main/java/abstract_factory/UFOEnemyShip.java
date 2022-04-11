package abstract_factory;

public class UFOEnemyShip extends EnemyShip {

    private EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory enemyShipFactory) {
        this.shipFactory = enemyShipFactory;
    }

    @Override
    public void makeShip() {
        System.out.println("Making enemy ship: " + getName());

        this.weapon = shipFactory.addESGun();
        this.engine = shipFactory.addESEngine();
    }

}
