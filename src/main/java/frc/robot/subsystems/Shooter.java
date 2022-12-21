// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  // Initialize Motors for this
  private final WPI_TalonFX leftMotor;
  private final WPI_TalonFX rightMotor;

  public Shooter() {
    // assign motors to the correct port
    leftMotor = new WPI_TalonFX(6);
    rightMotor = new WPI_TalonFX(7);

    // make them work together
    rightMotor.follow(leftMotor);

    // face them the correct way
    leftMotor.setInverted(TalonFXInvertType.Clockwise);
    rightMotor.setInverted(TalonFXInvertType.OpposeMaster);

  }

  public void setSpeed(double speed) {
    leftMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
