
package org.usfirst.frc295.TestDrivetrain.subsystems;

import org.usfirst.frc295.TestDrivetrain.RobotMap;
import org.usfirst.frc295.TestDrivetrain.commands.*;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class SysDriveTrainShifter extends Subsystem 
{
    private final DoubleSolenoid.Value SOLENOID_GEAR_HIGH = DoubleSolenoid.Value.kReverse;
    private final DoubleSolenoid.Value SOLENOID_GEAR_LOW  = DoubleSolenoid.Value.kForward;
	
    private DoubleSolenoid 		_dsolShifter;

    
    public SysDriveTrainShifter()
    {
		super();
		
        _dsolShifter = new DoubleSolenoid(RobotMap.CAN_PCM_MODULE, RobotMap.CAN_PCM_PORT_SHIFTER);
        LiveWindow.addActuator("SysDriveTrainShifter", "Shifter Solonoid", (DoubleSolenoid)  _dsolShifter);
		_dsolShifter.set(SOLENOID_GEAR_HIGH);
    }

	@Override
	protected void initDefaultCommand() 
	{
        // Set the default command for a subsystem here.
	}
	
	public void setHighGear()
	{
		_dsolShifter.set(SOLENOID_GEAR_HIGH);
	}
	
	public void setLowGear()
	{
		_dsolShifter.set(SOLENOID_GEAR_LOW);		
	}
}
