// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ClimbSub. */
  WPI_TalonSRX intake;
  

  public IntakeSubsystem() {
    intake = new WPI_TalonSRX(Constants.IntakeConstants.IntakePort);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void IntakeUp(){
    intake.set(ControlMode.PercentOutput,1);
    
  }
  public void IntakeDown(){
    intake.set(ControlMode.PercentOutput,-1);
    
  }
  public void IntakeStop(){
    intake.set(ControlMode.PercentOutput,0);
    
  }
}

