package io.khasang.TrafficLights.model.Light;

public class Light {
    private LightColour colour;
    private LightMode mode;
    private long duration;

    public Light(LightColour colour, LightMode mode, long duration) {
        this.colour = colour;
        this.mode = mode;
        this.duration = duration;
    }

    public LightColour getColour() {
        return colour;
    }

    public LightMode getMode() {
        return mode;
    }

    public long getDuration() {
        return duration;
    }
}
