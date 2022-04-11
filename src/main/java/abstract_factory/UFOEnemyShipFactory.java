package abstract_factory;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    //Agrego las partes que son especificas para la regular UFO
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }

}
