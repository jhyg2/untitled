package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext339Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext339Application.class })
public class CucumberSpingConfiguration {}
