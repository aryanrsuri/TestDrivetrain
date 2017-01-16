// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc295.TestDrivetrain.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc295.TestDrivetrain.Robot;

/**
 *
 */
public class CmdDriveWithJoystick extends Command 
{
	private Joystick         _joystickDriver;
	
    public CmdDriveWithJoystick() 
    {
        requires(Robot.sysDriveTrain);
        _joystickDriver = Robot.oi.getJoystickDriver();
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	Robot.sysDriveTrain.tankDrive(_joystickDriver.getRawAxis(1), _joystickDriver.getRawAxis(3));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
        Robot.sysDriveTrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
        end();
    }
}
