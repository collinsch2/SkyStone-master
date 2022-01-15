package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "AUTOzone")


public class GayleeSupreme extends LinearOpMode {

    Robo_tings robo_tings = new Robo_tings();

    @Override
    public void runOpMode() {

        robo_tings.hardware(hardwareMap);

        waitForStart();
        robo_tings.ArmDown(-0.05);
        sleep(350);

        robo_tings.encodersForward(27, 1);

        robo_tings.Stop();
        sleep(1000);

        robo_tings.ArmDown(1);
        robo_tings.Stop();
        sleep(1000);

        robo_tings.ArmDown(0.5);
        robo_tings.encodersForward(-25, -1);
        sleep(4000);


        robo_tings.ArmDown(-0.69999999999);
        sleep(3000);
        robo_tings.ArmDown(0);
        sleep(100);

        robo_tings.NoETurnRight(-1);
        sleep(5000);
        robo_tings.NoETurnRight(-1);
        sleep(5000);

        //robo_tings.ArmDown(-0.15);
        //sleep(400);
        //robo_tings.Stop();

        //robo_tings.hardware(hardwareMap);
       // robo_tings.NoETurnRight(1);
        //sleep(1000);
//16.75

    }
        // robo_tings.encodersForward(-40, 1);    }

    }