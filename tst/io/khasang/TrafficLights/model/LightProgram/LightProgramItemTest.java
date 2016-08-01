package io.khasang.TrafficLights.model.LightProgram;

import io.khasang.TrafficLights.model.Light.Light;
import io.khasang.TrafficLights.model.Light.LightColour;
import io.khasang.TrafficLights.model.Light.LightMode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightProgramItemTest {
    private static long START = 10;
    private static long DURATION = 20;

    @Test
    public void isTurnedOn() throws Exception {
        Light light = new Light(LightColour.GREEN, LightMode.CONTINUOUS, DURATION);
        long stopTime = START + light.getDuration();
        long middleTime = START + ((stopTime - START) / 2);
        LightProgramItem lightProgramItem = new LightProgramItem(light, START, stopTime);
        assertTrue("Just turned On", lightProgramItem.isOnTime(START));
        assertTrue("Last moment", lightProgramItem.isOnTime(stopTime));
        assertTrue("Already should be On", lightProgramItem.isOnTime(middleTime));
        assertFalse("Yet should not be On", lightProgramItem.isOnTime(START - 1));
        assertFalse("Already should be Off", lightProgramItem.isOnTime(stopTime + 1));
    }
}