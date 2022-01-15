package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "REd Triangle")
public class SurajMoreLikeSurgay_auto  extends LinearOpMode {

    Robo_tings robo_tings = new Robo_tings();

    @Override
    public void runOpMode() throws InterruptedException {
        robo_tings.hardware(hardwareMap);
        waitForStart();

        robo_tings.hardware(hardwareMap);
        waitForStart();


        robo_tings.Forward(1);
        sleep(2000);



        robo_tings.encodersTurnLeft(-1, 20);

        robo_tings.TurnRight(1);

        robo_tings.Backwards(1);

        robo_tings.TurnRight(1);
    }
}