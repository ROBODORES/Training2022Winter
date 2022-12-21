// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid; 


public class Climber extends SubsystemBase {
  /** Creates a new Climber. */
  public WPI_TalonFX motor_right;
  public WPI_TalonFX motor_left; 

  public double armUpSpeed = -0.2;
  public double armDownSpeed = 0.2;

  public double max = 142502.0;
  public double min = 0.0;

  public boolean isArmUp = false;

  public Solenoid stopper;
  boolean holding = false;



  public Climber() {
    motor_right = new WPI_TalonFX(12);
    motor_left = new WPI_TalonFX(13);

    stopper = new Solenoid(PneumaticsModuleType.REVPH, 1);

  }

  public void set(double power){
    motor_left.set(power);
    motor_right.set(power);
  }

  public void stop(){
    set(0.0);
  }

  public void hold(){
    stopper.set(holding);
  }

  public void release(){
    stopper.set(!holding);
  }

  



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
