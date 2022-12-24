package org.example.BuilderPattern.PhoneExample;

public interface IPhoneBuilder {

    PhoneBuilder setOs(String os);
    PhoneBuilder setRam(int ram);
    PhoneBuilder setProcessor(String processor);
    PhoneBuilder setScreenSize(double screenSize);
    PhoneBuilder setBattery(int battery);
}
