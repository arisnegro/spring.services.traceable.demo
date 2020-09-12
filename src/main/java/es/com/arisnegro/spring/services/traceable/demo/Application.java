package es.com.arisnegro.spring.services.traceable.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private TestService testService;
	
	@Override
    public void run(String... args) throws Exception {

        logger.info("Application starts");
        
        this.testService.tracedMethod("1");    	
        this.testService.tracedMethodFatalLevel("2");    	
        this.testService.tracedMethodErrorLevel("3");
        this.testService.tracedMethodWarnLevel("4");
        this.testService.tracedMethodInfoLevel("5");
        this.testService.tracedMethodDebugLevel("6");
        this.testService.tracedMethodTraceLevel("7");
        this.testService.tracedMethodStartInfoEndDebug("8");
        this.testService.tracedMethodSkipInput("9");
        this.testService.tracedMethodSkipOutput("10");
        this.testService.tracedMethodSelectedParameters("11", "12", "13", "14", "15");
        
        logger.info("Application ends");
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}