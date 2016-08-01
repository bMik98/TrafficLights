package io.khasang.TrafficLights.model.LightProgram;

import io.khasang.TrafficLights.model.Light.Light;

import java.util.ArrayList;
import java.util.List;

public class LightProgram {
    private List<LightProgramItem> items;
    private long cycleTime;

    public LightProgram() {
        this.items = new ArrayList<>();
        this.cycleTime = 0;
    }

    public void appendLightToSequence(final Light light) {
        items.add(new LightProgramItem(light, cycleTime, cycleTime + light.getDuration() - 1));
        cycleTime += light.getDuration();
    }

    public Light getLightAt(long time) {
        long cycleTimeStamp = (time > 0) ? time % this.cycleTime : 0;
        for (LightProgramItem item : this.items) {
            if (item.isOnTime(cycleTimeStamp)) {
                return item.getLight();
            }
        }
        return null;
    }

    public int getLightIndexAt(long time) {
        long cycleTimeStamp = (time > 0) ? time % this.cycleTime : 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).isOnTime(cycleTimeStamp)) {
                return i;
            }
        }
        return -1;
    }

    public int getNextLightIndex(long time) {
        int currentIndex = getLightIndexAt(time);
        return (currentIndex >= items.size() || currentIndex < 0) ? 0 : currentIndex + 1;
    }

}
