package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {

    // Initialize Motors
    private final WPI_TalonFX left0 = new WPI_TalonFX(0), left1 = new WPI_TalonFX(1), left2 = new WPI_TalonFX(2);
    private final WPI_TalonFX right3 = new WPI_TalonFX(3), right4 = new WPI_TalonFX(4), right5 = new WPI_TalonFX(5);
    
    // Make them work together 
    private final MotorControllerGroup leftSide = new MotorControllerGroup(left0, left1, left2);
    private final MotorControllerGroup rightSide = new MotorControllerGroup(right3, right4, right5);

    private final DifferentialDrive testDrive = new DifferentialDrive(leftSide, rightSide);
    
    //----------------------------------------------------------------------------------//


    //-------------------------------- Constructor -------------------------------------//

    public DriveTrain() {
        // Spin other way so it doesn't go in circles
        leftSide.setInverted(true);

    }

    //----------------------------------------------------------------------------------//


    //---------------------------------- Methods ---------------------------------------//

    @Override
    public void periodic() {
        
    }

    public void simulationPeriodic() {
        
    }

    public void arcadeDrive(double forwardSpeed, double turnSpeed) { 
        testDrive.arcadeDrive(forwardSpeed, turnSpeed);
    }
}
