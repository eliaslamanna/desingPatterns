package adapter;

public class Main {
    public static void main(String[] args) {

        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);

        System.out.println("The Robot");
        robot.reactToHuman("Paul");
        robot.walkforward();
        robot.smashWithHands();

        System.out.println("The enemy Tank");
        tank.assignDriver("Frank");
        tank.driveForward();
        tank.fireWeapon();

        //Funciona igual por el adapter
        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
