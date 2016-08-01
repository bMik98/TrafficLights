package io.khasang.TrafficLights.model.LightProgram;

import io.khasang.TrafficLights.model.Light.Light;
import java.util.ArrayList;
import java.util.List;

public class LightProgram {
    private List<LightProgramItem> items = new ArrayList<>();
    private long cycleTime;

    public void turnLightOn(final Light light, long lightTime) {
        cycleTime++;
        items.add(new LightProgramItem(light, cycleTime, cycleTime + lightTime));
        cycleTime += lightTime;
    }

    public Light getLightAt(long time) {

    }
}
