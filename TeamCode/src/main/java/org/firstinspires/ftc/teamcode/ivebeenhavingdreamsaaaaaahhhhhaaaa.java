package org.firstinspires.ftc.teamcode;
import android.os.PowerManager;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Robo_tings;


    @Autonomous(name = "Justin's Red Triangle Shirt")
    public class ivebeenhavingdreamsaaaaaahhhhhaaaa extends LinearOpMode {

        Robo_tings robo_tings = new Robo_tings();

            @Override
            public void runOpMode() throws InterruptedException {
                robo_tings.hardware(hardwareMap);
                waitForStart();

                robo_tings.encodersForward(64, 1);

                robo_tings.TurnLeft(1);

                robo_tings.TurnRight(1);

                robo_tings.Backwards(1);

                robo_tings.TurnRight(1);


            }




        }






















