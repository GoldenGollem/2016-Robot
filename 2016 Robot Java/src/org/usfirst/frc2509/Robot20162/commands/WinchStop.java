package org.usfirst.frc2509.Robot20162.commands;

import org.usfirst.frc2509.Robot20162.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WinchStop extends Command {

    public WinchStop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.winch);
    	setTimeout(0.5);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.winch.Stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
