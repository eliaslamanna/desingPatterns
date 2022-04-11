package abstract_factory;

public class EnemyShipTesting {
    public static void main(String[] args) {

        //va a mandar el mensaje a la factory correcta para crear el ufo
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        //Creo diferentes ufos
        EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
