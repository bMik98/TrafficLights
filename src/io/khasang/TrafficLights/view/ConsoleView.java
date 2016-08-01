package io.khasang.TrafficLights.view;

import io.khasang.TrafficLights.model.Light.Light;
import io.khasang.TrafficLights.model.TrafficLights;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;
    private TrafficLights trafficLights;

    public ConsoleView(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
        this.scanner = new Scanner(System.in);
    }

    public void showLightAt(long time) {
        Light light = trafficLights.getLightAt(time);
        if (light == null) {
            System.out.println();
        }
    }

    public void showLight(long time, final String colour, final String mode) {
        System.out.printf("%d  %s - %s %s", time, trafficLights.);
    }
}
