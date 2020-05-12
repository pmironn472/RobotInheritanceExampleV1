package tests;

import robo.AbstractRobot;

public class DiagonalWalkTest {
    public static int diagonalWalkTest(AbstractRobot robot) {
        int percentage = 0;

        robot.setY(50);
        robot.setX(100);
        if (robot.moveDownRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownRight() out of bounds!");
            return percentage;
        }
        percentage += 20;

        robot.setY(50);
        robot.setX(100);
        if (robot.moveDownLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
            return percentage;
        }
        percentage += 10;


        robot.setY(50);
        robot.setX(0);
        if (robot.moveUpRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpRight() out of bounds!");
            return percentage;
        }
        percentage += 20;

        robot.setY(0);
        robot.setX(50);
        if (robot.moveUpLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpLeft() out of bounds!");
            return percentage;
        }
        percentage += 10;


        robot.setY(100);
        robot.setX(50);
        if (robot.moveDownRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownRight() out of bounds!");
            return percentage;
        }
        percentage += 10;

        robot.setY(50);
        robot.setX(100);
        if (robot.moveUpRight()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpRight() out of bounds!");
            return percentage;
        }
        percentage += 10;


        robot.setY(50);
        robot.setX(0);
        if (robot.moveUpLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveUpLeft() out of bounds!");
            return percentage;
        }
        percentage += 10;

        robot.setY(50);
        robot.setX(0);
        if (robot.moveDownLeft()) {
            System.err.println("Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
            return percentage;
        }
        percentage += 10;


        robot.setY(50);
        robot.setX(50);
        while (robot.moveDownLeft()) ;
        if (robot.getCharge() > 5) {
            System.err.println("Charge test failed\nREASON: The moving system should be calibrated!");
            return percentage;
        }
        return percentage;


    }
}
