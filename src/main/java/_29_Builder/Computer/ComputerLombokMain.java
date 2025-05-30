package _29_Builder.Computer;

public class ComputerLombokMain {
    public static void main(String[] args) {
        ComputerLombok computerLombok = ComputerLombok.builder()
                .cpu("AMD 7500f")
                .ram(16)
                .storage(256)
                .hasWifi(false)
                .hasBluetooth(true)
                .build();

        System.out.println(computerLombok);
    }
}
