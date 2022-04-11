package abstract_factory;

//Concrete order form for creating enemyShip (choses parts from factory)
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip enemyShip = null;

        //Cada factory se selecciona correctamente y le da las partes que necesita cada UFO
        if(typeOfShip.equals("UFO")) {
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            enemyShip = new UFOEnemyShip(shipPartsFactory);
            enemyShip.setName("UFO Grunt Ship");
        } else if(typeOfShip.equals("UFO BOSS")) {
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            enemyShip = new UFOBossEnemyShip(shipPartsFactory);
            enemyShip.setName("UFO Boss Ship");
        }

        return enemyShip;
    }

}
