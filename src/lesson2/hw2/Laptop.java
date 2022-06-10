package lesson2.hw2;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Laptop extends Pc {
    private Boolean battery;
    private Boolean usb;
    private Boolean wifi;

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                ", usb=" + usb +
                ", wifi=" + wifi +
                "} " + super.toString();
    }
}
