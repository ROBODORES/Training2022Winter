// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.Climber_command;
import frc.robot.subsystems.Climber;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Climber m_ClimbSubsystem = new Climber();

  public static final XboxController climbController = new XboxController(0);
  public static final JoystickButton shootButton = new JoystickButton(climbController, Button.kRightBumper.value);

  // public final JoystickButton armUpButton = new JoystickButton(climbController, Button.kRightBumper.value);
  // public final JoystickButton armDownButton = new JoystickButton(climbController, Button.kLeftBumper.value);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    m_ClimbSubsystem.setDefaultCommand(new Climber_command(m_ClimbSubsystem));
    // Configure the button bindings
    configureButtonBindings();
    
  }
  private void configureButtonBindings() {
  }
}
