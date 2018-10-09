/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot

Robot rd2d = new Robot();

        // 3. Put the robot's pen down
rd2d.penDown();

        // 6. Make the robot move as fast as possible

rd2d.setSpeed(15);
        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)

for (int i = 0; i <8  ; i++) {
	
	rd2d.move(100);
	rd2d.turn(360/8);
}
    }
    
}
