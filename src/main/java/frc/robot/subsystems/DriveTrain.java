// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;



public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  WPI_TalonFX left0 = new WPI_TalonFX(0);
  WPI_TalonFX left1 = new WPI_TalonFX(1);
  WPI_TalonFX left2 = new WPI_TalonFX(2);

  private final MotorControllerGroup m_leftMotors = new MotorControllerGroup(left0, left1, left2);

  WPI_TalonFX right0 = new WPI_TalonFX(3);
  WPI_TalonFX right1 = new WPI_TalonFX(4);
  WPI_TalonFX right2 = new WPI_TalonFX(5);

  private final MotorControllerGroup m_rightMotors = new MotorControllerGroup(right0, right1, right2);

  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotors, m_rightMotors);

  public DriveTrain() {

    m_leftMotors.setInverted(true);

  }

  public void arcadeDrive(double fwd,double rot) {
    m_drive.arcadeDrive(fwd, rot);
  }
}
