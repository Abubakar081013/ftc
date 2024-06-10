

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;



@TeleOp(name="AbubakarHassan", group="Linear OpMode")

public class AbubakarHassan extends LinearOpMode {
    Servo hookL;
    Servo hookR;
    DcMotor backLeftDrive;
    DcMotor backRightDrive;
    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor wrist;
    DcMotor leftShoulder;
    DcMotor rightShoulder;
    BNO055IMU imu;

@Override
    public void runOpMode() {
      //Gamepad gamepad1 = new FTCGamepad();
      hookL = hardwareMap.get(Servo.class, "hookL");
      hookR = hardwareMap.get(Servo.class, "hookR");
    //   backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
    //   backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
    //   frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
    //   frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
    //   wrist = hardwareMap.get(DcMotor.class, "wrist");
    //   leftShoulder = hardwareMap.get(DcMotor.class, "leftShoulder");
    //   rightShoulder = hardwareMap.get(DcMotor.class, "rightShoulder");
    //   imu = hardwareMap.get(BNO055IMU.class, "imu");
      // Put initialization blocks here
      waitForStart();
      // Put run blocks here
      while (opModeIsActive()) {
        // Put loop blocks here
        if (gamepad1.y) {
        //   backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        //   frontLeftDrive.setPower(1);
        //   frontRightDrive.setPower(1);
        //   backLeftDrive.setPower(1);
        //   backRightDrive.setPower(1);
          hookL.setPosition(0);
        } 
        //else if (gamepad1.x) {
        //   backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        //   frontLeftDrive.setPower(-1);
        //   frontRightDrive.setPower(1);
        //   backLeftDrive.setPower(0);
        //   backRightDrive.setPower(0);
        //} 
        else if (gamepad1.b) {
        //   backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        //   frontLeftDrive.setPower(-1);
        //   frontRightDrive.setPower(-1);
        //   backLeftDrive.setPower(-1);
        //   backRightDrive.setPower(-1);
            hookL.setPosition(0.5);
         } 
        else if (gamepad1.a) {
        //   backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        //   frontLeftDrive.setPower(1);
        //   frontRightDrive.setPower(-1);
        //   backLeftDrive.setPower(0);
        //   backRightDrive.setPower(0);
            hookL.setPosition(1);
        } 
        else {
        //   frontLeftDrive.setPower(0);
        //   frontRightDrive.setPower(0);
        //   backLeftDrive.setPower(0);
        //   backRightDrive.setPower(0);
            
        }
      }
    }
    
}
