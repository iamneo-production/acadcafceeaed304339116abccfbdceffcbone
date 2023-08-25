package com.example.springapp;

import com.example.springapp.service.TemperatureService;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

@SpringBootTest
public class SpringappApplicationTests {

    @Test
    public void testConvertToCelsius() {
        // Arrange
        TemperatureService temperatureService = new TemperatureService();
        double temperatureFahrenheit = 68.0; // 20°C in Fahrenheit

        // Act
        double convertedTemperature = temperatureService.convertToCelsius(temperatureFahrenheit);

        // Assert
        double expectedTemperature = 154.4;
        assertEquals(expectedTemperature, convertedTemperature, 0.01); // Use delta for double comparison
    }

    @Test

    public void testcontrollerfolder() {

        String directoryPath = "src/main/java/com/example/springapp/controller"; //
        // Replace with the path to your
        // directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

    @Test

    public void testcontrollerfile() {

        String filePath = "src/main/java/com/example/springapp/controller/TemperatureController.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

    @Test

    public void testServiceFolder() {

        String directoryPath = "src/main/java/com/example/springapp/service"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

    @Test

    public void testServieFile() {

        String filePath = "src/main/java/com/example/springapp/service/TemperatureService.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

}