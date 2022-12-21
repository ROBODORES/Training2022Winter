// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climber;
import frc.robot.RobotContainer;

public class Climb extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  /** Creates a new Climb. */
  Climber climber;
  
  double threshhold = 0.5;

  public Climb(Climber m_climber) {
    addRequirements(m_climber);
    this.climber = m_climber;
  }

  public Climb() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rightY = -RobotContainer.mechanismController.getRightY();
    double leftY = -RobotContainer.mechanismController.getLeftY();
    boolean extend = RobotContainer.mechanismController.getRightBumper();
    boolean retract = RobotContainer.mechanismController.getLeftBumper();

    if (leftY > threshhold) {
      climber.setLeft(-0.5);
    } else if (leftY < -threshhold) {
      climber.setLeft(0.5);
    } else {
      climber.setLeft(0);
    }

    if (rightY > threshhold) {
      climber.setRight(-0.5);
    } else if (rightY < -threshhold) {
      climber.setRight(0.5);
    } else {
      climber.setRight(0);
    }

    if (extend) {
      climber.extendArm();
    } else if (retract) {
      climber.retractArm();
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
