package io.khasang.TrafficLights.controller;

import io.khasang.TrafficLights.model.TrafficLights;
import io.khasang.TrafficLights.view.ConsoleView;

public class TrafficLightsSimulator {
    private TrafficLights trafficLights;
    private ConsoleView consoleView

    public static void main(String[] args) {
        new TrafficLightsSimulator().run();
    }

    public void run() {

        trafficLights = new TrafficLights("");
    }

    public void runSequence(final long steps, final long stepDuration) {

    }
}
