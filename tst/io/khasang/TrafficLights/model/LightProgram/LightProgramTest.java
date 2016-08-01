package io.khasang.TrafficLights.model.LightProgram;

import io.khasang.TrafficLights.model.Light.Light;
import io.khasang.TrafficLights.model.Light.LightColour;
import io.khasang.TrafficLights.model.Light.LightMode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightProgramTest {
    @Test
    public void getLightAt() throws Exception {
        LightProgram lightProgram = new LightProgram();
        lightProgram.appendLightToSequence(new Light(LightColour.RED, LightMode.CONTINUOUS, 5));
        lightProgram.appendLightToSequence(new Light(LightColour.YELLOW, LightMode.CONTINUOUS, 5));
        lightProgram.appendLightToSequence(new Light(LightColour.GREEN, LightMode.CONTINUOUS, 5));
        assertEquals("Zero", LightColour.RED, lightProgram.getLightAt(0).getColour());
        assertEquals("First", LightColour.RED, lightProgram.getLightAt(1).getColour());
        assertEquals("Middle", LightColour.RED, lightProgram.getLightAt(2).getColour());
        assertEquals("Last", LightColour.RED, lightProgram.getLightAt(4).getColour());
        assertEquals("First", LightColour.YELLOW, lightProgram.getLightAt(5).getColour());
        assertEquals("Middle", LightColour.YELLOW, lightProgram.getLightAt(7).getColour());
        assertEquals("Last", LightColour.YELLOW, lightProgram.getLightAt(9).getColour());
        assertEquals("First", LightColour.GREEN, lightProgram.getLightAt(10).getColour());
        assertEquals("Middle", LightColour.GREEN, lightProgram.getLightAt(13).getColour());
        assertEquals("Last", LightColour.GREEN, lightProgram.getLightAt(14).getColour());
        assertEquals("First next cycle", LightColour.RED, lightProgram.getLightAt(15).getColour());
    }
}