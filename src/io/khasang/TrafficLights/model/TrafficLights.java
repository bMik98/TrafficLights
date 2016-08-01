package io.khasang.TrafficLights.model;

import io.khasang.TrafficLights.model.Light.Light;
import io.khasang.TrafficLights.model.LightProgram.LightProgram;

public class TrafficLights {
    public static String DEFAULT_NAME = "TrafficLights";
    private LightProgram lightProgram;
    private String name;

    public TrafficLights(LightProgram lightProgram, final String name) {
        this.lightProgram = lightProgram;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LightProgram getLightProgram() {
        return lightProgram;
    }

    public void setLightProgram(LightProgram lightProgram) {
        this.lightProgram = lightProgram;
    }

    public Light getLightAt(long time) {
        return lightProgram.getLightAt(time);
    }
}
