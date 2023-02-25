// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private static Spark frontLeft = new Spark(0);
  private static Spark rearLeft = new Spark(0);
  private static Spark frontRight = new Spark(0);
  private static Spark rearRight = new Spark(0);

  private static MotorControllerGroup rightMotors = new MotorControllerGroup(frontRight, rearRight);
  private static MotorControllerGroup leftMortors = new MotorControllerGroup(frontLeft, rearLeft);

  private static DifferentialDrive drive = new DifferentialDrive(leftMortors, rightMotors);

  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static void Drive(double rightSpeed, double leftSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}
