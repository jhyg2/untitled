package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext473Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext473Application.class })
public class CucumberSpingConfiguration {}
