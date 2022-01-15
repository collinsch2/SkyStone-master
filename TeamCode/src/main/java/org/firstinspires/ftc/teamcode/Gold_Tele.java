package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        //import com.qualcomm.robotcore.hardware.DcMotor;
        //import com.qualcomm.robotcore.hardware.HardwareMap;


@TeleOp (name = "Justin's Jeans")
public class Gold_Tele extends OpMode {
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

        double FrontLeft = -(gamepad1.left_stick_y - (gamepad1.left_stick_x) + -gamepad1.right_stick_x);
        double FrontRight = -(gamepad1.left_stick_y + (gamepad1.left_stick_x) - -gamepad1.right_stick_x);
        double BackLeft = -(gamepad1.left_stick_y + (gamepad1.left_stick_x) + -gamepad1.right_stick_x);
        double BackRight = -(gamepad1.left_stick_y - (gamepad1.left_stick_x) - -gamepad1.right_stick_x);

        robo_tings.FrontLeft.setPower(FrontLeft);
        robo_tings.FrontRight.setPower(FrontRight);
        robo_tings.BackLeft.setPower(BackLeft);
        robo_tings.BackRight.setPower(BackRight);

        if(gamepad2.left_bumper){
            robo_tings.Arm.setPower(0.5);
        }
        else if(gamepad2.right_bumper) {
            robo_tings.Arm.setPower(-0.5);
        }
        else{robo_tings.Arm.setPower(0);}


        if (gamepad2.y) {
            robo_tings.Right.setPosition(0);
            robo_tings.Left.setPosition(1);
        }
         if ( gamepad2.x ) {
            robo_tings.Right.setPosition(0.2);
            robo_tings.Left.setPosition(0.8);
        }
         if ( gamepad2.a) {
            robo_tings.Right.setPosition(0.8);
            robo_tings.Left.setPosition(0.2);
        }
         if(gamepad2.b)  {
                 robo_tings.Right.setPosition(0.4);
                 robo_tings.Left.setPosition(0.6);
                 }

                 }
                 }