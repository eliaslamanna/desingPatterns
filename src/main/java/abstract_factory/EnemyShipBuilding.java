package abstract_factory;

//Abstract order form for creating enemyShip
public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip enemyShip = makeEnemyShip(typeOfShip);

        enemyShip.makeShip();
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();

        return enemyShip;
    }
}
