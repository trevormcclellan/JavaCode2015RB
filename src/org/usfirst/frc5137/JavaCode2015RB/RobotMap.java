// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5137.JavaCode2015RB;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveBaseLeftMotor;
    public static SpeedController driveBaseRightMotor;
    public static SpeedController slideDriveMiddleMotor;
    public static DoubleSolenoid horizontalArmDoubleSolenoid1;
    public static Compressor horizontalArmCompressor;
    public static Relay cAHB20LinearActuator;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static TwistSteerDrive driveBasechassis;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseLeftMotor = new Talon(0);
        LiveWindow.addActuator("Drive Base", "Left Motor", (Talon) driveBaseLeftMotor);
        
        driveBaseRightMotor = new Talon(1);
        LiveWindow.addActuator("Drive Base", "Right Motor", (Talon) driveBaseRightMotor);
        
        slideDriveMiddleMotor = new Victor(2);
        LiveWindow.addActuator("Slide Drive", "MiddleMotor", (Victor) slideDriveMiddleMotor);
        
        horizontalArmDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("Horizontal Arm", "Double Solenoid 1", horizontalArmDoubleSolenoid1);
        
        horizontalArmCompressor = new Compressor(0);
        
        
        cAHB20LinearActuator = new Relay(0);
        LiveWindow.addActuator("CAHB20", "Linear Actuator", cAHB20LinearActuator);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBasechassis = new TwistSteerDrive(driveBaseLeftMotor, driveBaseRightMotor);
    }
}
