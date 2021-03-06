// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2509.Robot2016;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Encoder armLocationEncoder;
    public static CANTalon armMotor;
    public static CANTalon beltMotor;
    public static SpeedController driveTrainLFMotor;
    public static SpeedController driveTrainRFMotor;
    public static SpeedController driveTrainLRMotor;
    public static SpeedController driveTrainRRMotor;
    public static RobotDrive driveTrainRobotDrive41;
    public static CANTalon shooterMotor;
    public static Encoder shooterEncoder;
    public static CANTalon winchMotor1;
    public static CANTalon winchMotor2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        armLocationEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Arm", "Location Encoder", armLocationEncoder);
        armLocationEncoder.setDistancePerPulse(1.0);
        armLocationEncoder.setPIDSourceType(PIDSourceType.kRate);
        armMotor = new CANTalon(1);
        LiveWindow.addActuator("Arm", "Motor", armMotor);
        
        beltMotor = new CANTalon(2);
        LiveWindow.addActuator("Belt", "Motor", beltMotor);
        
        driveTrainLFMotor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "LF Motor", (Talon) driveTrainLFMotor);
        
        driveTrainRFMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "RF Motor", (Talon) driveTrainRFMotor);
        
        driveTrainLRMotor = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "LR Motor", (Talon) driveTrainLRMotor);
        
        driveTrainRRMotor = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "RR Motor", (Talon) driveTrainRRMotor);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainLFMotor, driveTrainLRMotor,
              driveTrainRFMotor, driveTrainRRMotor);
        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        shooterMotor = new CANTalon(0);
        LiveWindow.addActuator("Shooter", "Motor", shooterMotor);
        
        shooterEncoder = new Encoder(3, 4, false, EncodingType.k4X);
        LiveWindow.addSensor("Shooter", "Encoder", shooterEncoder);
        shooterEncoder.setDistancePerPulse(1.0);
        shooterEncoder.setPIDSourceType(PIDSourceType.kRate);
        winchMotor1 = new CANTalon(4);
        LiveWindow.addActuator("Winch", "Motor 1", winchMotor1);
        
        winchMotor2 = new CANTalon(3);
        LiveWindow.addActuator("Winch", "Motor 2", winchMotor2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
