package adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        this.theRobot = newRobot;
    }

    //Adapta los metodos de enemyRobot
    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkforward();
    }

    @Override
    public void assignDriver(String driverMan) {
        theRobot.reactToHuman(driverMan);
    }

}
