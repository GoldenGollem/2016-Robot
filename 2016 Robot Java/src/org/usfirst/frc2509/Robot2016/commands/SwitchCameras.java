package org.usfirst.frc2509.Robot2016.commands;

import org.usfirst.frc2509.Robot2016.subsystems.Cameras;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2509.Robot2016.Robot;

/**
 *
 */
public class SwitchCameras extends Command {

    public SwitchCameras() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//put in each cam name found in roborio
    	if(Cameras.cam == ""){
    		Cameras.cam = "";
    	}else if(Cameras.cam == ""){
    		Cameras.cam = "";
    		//Leave following if statement equal to blank
    	}else if(Cameras.cam == "")
    		Cameras.cam = "";
    	Robot.server = CameraServer.getInstance();
    	Robot.server.startAutomaticCapture(Cameras.cam);
    	end();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
