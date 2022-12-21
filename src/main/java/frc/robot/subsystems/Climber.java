// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Climber extends SubsystemBase {
  WPI_TalonFX leftMotor = new WPI_TalonFX(12);
  WPI_TalonFX rightMotor = new WPI_TalonFX(13);
  Solenoid arm = new Solenoid(PneumaticsModuleType.REVPH, 1);


  /** Creates a new Climber. */
  public Climber() {}

  public void setLeft(double power) {
    leftMotor.set(power);
  }

  public void setRight(double power) {
    rightMotor.set(power);
  }

  public void extendArm(){
    arm.set(true);
  }

  public void retractArm(){
    arm.set(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
