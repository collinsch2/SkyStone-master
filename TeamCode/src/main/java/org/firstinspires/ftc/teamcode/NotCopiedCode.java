

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.HardwareMap;
@TeleOp(name= "Mr.Tan'sGoatee")
public class NotCopiedCode extends OpMode {
        ;
        Robo_tings robo_tings = new Robo_tings();

        @Override
        public void init() {
                gamepad1.setJoystickDeadzone(0.1f);
                gamepad2.setJoystickDeadzone(0.1f);

                robo_tings.hardware(hardwareMap);
        }

        @Override
        public void loop() {


                double ThighMeat = gamepad1.left_stick_y;
                double ThicccyNikki = gamepad1.left_stick_x;
                double SkinnyLegend = gamepad1.right_stick_x;

                robo_tings.FrontLeft.setPower(ThighMeat+ThicccyNikki+SkinnyLegend);
                robo_tings.FrontRight.setPower(ThighMeat-ThicccyNikki-SkinnyLegend);
                robo_tings.BackLeft.setPower(ThighMeat-ThicccyNikki+SkinnyLegend);
                robo_tings.BackRight.setPower(ThighMeat+ThicccyNikki-SkinnyLegend);

        }
        }
