package io.khasang.TrafficLights.model.LightProgram;

import io.khasang.TrafficLights.model.Light.Light;

public class LightProgramItem {
    private Light light;
    private long startTime;
    private long stopTime;

    public LightProgramItem(Light light, long startTime, long stopTime) {
        this.light = light;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public Light getLight() {
        return light;
    }

    public boolean isOnTime(long time) {
        return ((time >= startTime) && (time <= stopTime));
    }
}
