package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Robo_Stuff {

    DcMotor Arm;
    DcMotor FrontLeft;
    DcMotor BackLeft;
    DcMotor FrontRight;
    DcMotor BackRight;
    Servo  Right;
    Servo Left;


    public void hardware(HardwareMap hardwareMap){
        FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        BackLeft = hardwareMap.get(DcMotor.class,  "BackLeft");
        FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        BackRight = hardwareMap.get(DcMotor.class, "BackRight");
        Right = hardwareMap.get(Servo.class, "Right");
        Left = hardwareMap.get(Servo.class, "Left");
        Arm = hardwareMap.get(DcMotor.class, "Arm");

        FrontRight.setDirection(DcMotor.Direction.REVERSE);
        BackRight.setDirection(DcMotor.Direction.REVERSE);

    }


    public void Forward(double Power){
        FrontLeft.setPower(Power);
        FrontRight.setPower(Power);
        BackLeft.setPower(Power);
        BackRight.setPower(Power);
        Arm.setPower(Power);
    }






}
