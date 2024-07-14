package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "tutorial2")
public class tutorial2 extends OpMode {

    DcMotor motor2br;
    /* Refers to motor 2, at the back right of the robot */
    DcMotor motor1bl;
    /* Refers to motor 1, at the back left of the robot */
    DcMotor motor4fl;
    /* Refers to motor 4, at the front left of the robot */
    DcMotor motor3fr;
    /* Refers to motor 3, at the front right of the robot */

    @Override
    public void init() {
        motor1bl = hardwareMap.get(DcMotor.class, "1bl");
        motor2br = hardwareMap.get(DcMotor.class, "2br");
        motor3fr = hardwareMap.get(DcMotor.class, "3fr");
        motor4fl = hardwareMap.get(DcMotor.class, "4fl");
        telemetry.addData("Hardware", "Initialized");
    }

    public void loop() {
        float x = gamepad1.left_stick_x;
        float y = gamepad1.left_stick_y;
        telemetry.addData("Initialization", String.format("%s %s", x, y));
        telemetry.update();
        if (x == 0 && y == -1){
            motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor1bl.setPower(0.5);
            motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
            motor2br.setPower(0.5);
            motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
            motor3fr.setPower(0.5);
            motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor4fl.setPower(0.5);


        } if (x == 0 && y == 1) {
            motor1bl.setPower(0.5);
            motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor2br.setPower(0.5);
            motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
            motor3fr.setPower(0.5);
            motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
            motor4fl.setPower(0.5);
            motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if (x == -1 && y == 0) {
            motor1bl.setPower(0.5);
            motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor2br.setPower(0.5);
            motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
            motor3fr.setPower(0.5);
            motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
            motor4fl.setPower(0.5);
            motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if (x == 1 && y == 0) {
            motor1bl.setPower(0.5);
            motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor2br.setPower(0.5);
            motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
            motor3fr.setPower(0.5);
            motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
            motor4fl.setPower(0.5);
            motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);

        }
        if (x > 0 && x < 1) {
            if (y > 0 && y <1) {
                motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
                motor1bl.setPower(0.5);
                motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
                motor3fr.setPower(0.5);
               /*bottom-Right*/
            }
        }
        if (x >-1 && x < 0) {
            if (y > -1 && y <0) {
                motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
                motor1bl.setPower(0.5);
                motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
                motor3fr.setPower(0.5);
                /*Top-Left*/
            }
        }
        if (x > -1 && x < 0) {
            if (y > 0 && y <1) {
                motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
                motor4fl.setPower(0.5);
                motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
                motor2br.setPower(2);
               /*Bottom-Left*/
            }
        }
        if (x < 1 && x > 0) {
            if (y > -1 && y <0) {
                motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);
                motor4fl.setPower(0.5);
                motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
                motor2br.setPower(2);
                /*Top-Right*/
            }
        }
        if (gamepad1.a){
            motor1bl.setPower(0.5);
            motor1bl.setDirection(DcMotorSimple.Direction.FORWARD);
            motor2br.setPower(0.5);
            motor2br.setDirection(DcMotorSimple.Direction.FORWARD);
            motor3fr.setPower(0.5);
            motor3fr.setDirection(DcMotorSimple.Direction.FORWARD);
            motor4fl.setPower(0.5);
            motor4fl.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if (gamepad1.x){
            motor1bl.setPower(0.5);
            motor1bl.setDirection(DcMotorSimple.Direction.REVERSE);
            motor2br.setPower(0.5);
            motor2br.setDirection(DcMotorSimple.Direction.REVERSE);
            motor3fr.setPower(0.5);
            motor3fr.setDirection(DcMotorSimple.Direction.REVERSE);
            motor4fl.setPower(0.5);
            motor4fl.setDirection(DcMotorSimple.Direction.FORWARD);
        }
        motor1bl.setPower(0);
        motor2br.setPower(0);
        motor3fr.setPower(0);
        motor4fl.setPower(0);
    }
}