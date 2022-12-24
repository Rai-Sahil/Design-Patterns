package org.example.BuilderPattern.PhoneExample;

//This will create for us
public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screeSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreeSize(double screeSize) {
        this.screeSize = screeSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, processor, screeSize, battery);
    }
}
