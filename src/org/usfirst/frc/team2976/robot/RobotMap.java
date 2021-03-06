package org.usfirst.frc.team2976.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static int frontLeftCIMPort = 3;
	public static int frontRightCIMPort = 1;
	public static int backLeftCIMPort = 4;
	public static int backRightCIMPort = 0;
	public static int frontTurnMotorPort = 1;
	public static int backTurnMotorPort = 2;
	
	public static int frontEncoderAPort = 1;
	public static int frontEncoderBPort = 0;
	public static int backEncoderAPort = 2;
	public static int backEncoderBPort = 3;
	
	public static int gyroPort = 0;
}
