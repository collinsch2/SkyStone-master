package org.firstinspires.ftc.teamcode;

import android.os.PowerManager;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Robo_tings;

@Autonomous (name = "PepsiCo(tm)")
public class auto   extends LinearOpMode {

    Robo_tings robo_tings = new Robo_tings();

    @Override
    public void runOpMode() throws InterruptedException {
        robo_tings.hardware(hardwareMap);
        waitForStart();

        robo_tings.ArmDown(-0.15);
        sleep(150);

        robo_tings.encodersForward(28, 1);

        robo_tings.Stop();
        sleep(2000);

        robo_tings.ArmDown(1);
        robo_tings.Stop();
        sleep(1000);

        robo_tings.ArmDown(0.5);

        robo_tings.encodersForward(-100, -1);
        sleep(4000);






    }


}