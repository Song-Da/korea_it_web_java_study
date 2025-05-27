package _24_interface;

public class Main {
    public static void main(String[] args) {
        TvRemoterController tvRemoterController = new TvRemoterController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoterController.onPressedPowerButton();
        tvRemoterController.onPressedPowerButton();

        tvRemoterController.onPressedPowerButton();

    }
}