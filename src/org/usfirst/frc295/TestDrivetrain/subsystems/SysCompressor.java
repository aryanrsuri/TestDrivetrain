
package org.usfirst.frc295.TestDrivetrain.subsystems;

import org.usfirst.frc295.TestDrivetrain.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class SysCompressor extends Subsystem 
{

	
	private Compressor _compPrimary = new Compressor(RobotMap.CAN_PCM_MODULE);

	
    public SysCompressor()
    {
		super();
    	_compPrimary.setClosedLoopControl(true);
    }

	@Override
	protected void initDefaultCommand() 
	{
        // Set the default command for a subsystem here.
	}
}
