package _29_Builder.Computer;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Builder

public class ComputerLombok {
    private String cpu;
    private int ram;
    private int storage;
    private boolean hasWifi;
    private boolean hasBluetooth;
}
