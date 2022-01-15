package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "JackSparrow")


public class JackSparrow extends LinearOpMode {

    Robo_tings robo_tings = new Robo_tings();

    @Override
    public void runOpMode() {

    robo_tings.hardware(hardwareMap);

    waitForStart();

        robo_tings.encodersForward(39,1);



        }
        }
