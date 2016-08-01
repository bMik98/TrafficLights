package io.khasang.TrafficLights.model.Light;

public class Light {
    private LightColour lightColour;
    private LightMode lightMode;
    private long lightDuration;

    public Light(LightColour lightColour, LightMode lightMode, long lightDuration) {
        this.lightColour = lightColour;
        this.lightMode = lightMode;
        this.lightDuration = lightDuration;
    }

    public LightColour getLightColour() {
        return lightColour;
    }

    public LightMode getLightMode() {
        return lightMode;
    }

    public long getLightDuration() {
        return lightDuration;
    }
}
