package io.khasang.TrafficLights.controller;

import io.khasang.TrafficLights.model.Light.Light;
import io.khasang.TrafficLights.model.Light.LightColour;
import io.khasang.TrafficLights.model.Light.LightMode;
import io.khasang.TrafficLights.model.LightProgram.LightProgram;
import io.khasang.TrafficLights.model.TrafficLights;
import io.khasang.TrafficLights.view.ConsoleView;

public class TrafficLightsSimulator {
    private TrafficLights trafficLights;
    private ConsoleView consoleView;

    public static void main(String[] args) {
        new TrafficLightsSimulator().run();
    }

    public void run() {
        LightProgram lightProgram = new LightProgram();
        lightProgram.appendLightToSequence(new Light(LightColour.GREEN, LightMode.CONTINUOUS, 10));
        lightProgram.appendLightToSequence(new Light(LightColour.YELLOW, LightMode.BLINKING, 5));
        lightProgram.appendLightToSequence(new Light(LightColour.RED, LightMode.CONTINUOUS, 10));
        lightProgram.appendLightToSequence(new Light(LightColour.YELLOW, LightMode.CONTINUOUS, 5));
        trafficLights = new TrafficLights(lightProgram, "Svetofor #1");
        consoleView = new ConsoleView(trafficLights);
        runLog(0, 40);
    }

    public void runLog(long start, long stop) {
        for (long i = start; i <= stop; i++) {
            consoleView.showLightAt(i);
        }
    }
}
