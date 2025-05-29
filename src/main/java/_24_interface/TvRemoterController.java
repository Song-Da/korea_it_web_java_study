package _24_interface;

public class TvRemoterController {

    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoterController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton,
                               VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onUp();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelUpButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeUpButton.onDown();
    }
}