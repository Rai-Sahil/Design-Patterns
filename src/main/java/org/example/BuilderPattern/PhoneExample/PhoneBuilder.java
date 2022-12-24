package org.example.BuilderPattern.PhoneExample;

import java.util.Objects;

//This will create for us
public class PhoneBuilder implements IPhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screeSize;
    private int battery;

    @Override
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    @Override
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public PhoneBuilder setScreenSize(double screeSize) {
        this.screeSize = screeSize;
        return this;
    }

    @Override
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, processor, screeSize, battery);
    }
}
