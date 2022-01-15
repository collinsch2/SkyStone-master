package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@Autonomous (name = "BootyClaws")

public class BootyClaws extends LinearOpMode {
    Robo_tings robo_tings = new Robo_tings();

    @Override
    public void runOpMode() {
waitForStart();
robo_tings.LeftClaw.setPosition(0);
robo_tings.RightClaw.setPosition(0);

    }

}