package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "TurnTest")
public class TurnTest extends LinearOpMode {

    Robo_tings robo_tings = new Robo_tings();

    @Override
    public void runOpMode() throws InterruptedException{
        robo_tings.hardware(hardwareMap);
        waitForStart();

        robo_tings.ArmDown(-0.05);
        sleep(350);

        robo_tings.encodersForward(27, 1);

        robo_tings.Stop();
        sleep(2000);

        robo_tings.ArmDown(1);
        robo_tings.Stop();
        sleep(1000);

        robo_tings.ArmDown(0.5);
        robo_tings.encodersForward(-25, -1);
        sleep(4000);

        robo_tings.ArmDown(-1);
        sleep(100);

        robo_tings.NoETurnRight(1);
        sleep(1000);

    }
}
