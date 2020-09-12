package es.com.arisnegro.spring.services.traceable.demo;

import org.springframework.stereotype.Service;

import es.com.arisnegro.spring.services.traceable.annotations.Traceable;
import es.com.arisnegro.spring.services.traceable.enums.Level;

@Service
@Traceable
public class TestService {

	public String tracedMethod(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(level=Level.FATAL)
	public String tracedMethodFatalLevel(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(level=Level.ERROR)
	public String tracedMethodErrorLevel(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(level=Level.WARN)
	public String tracedMethodWarnLevel(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(level=Level.INFO)
	public String tracedMethodInfoLevel(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(level=Level.DEBUG)
	public String tracedMethodDebugLevel(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(level=Level.TRACE)
	public String tracedMethodTraceLevel(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(levelStart=Level.INFO, levelEnd=Level.DEBUG)
	public String tracedMethodStartInfoEndDebug(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(printInput = false)
	public String tracedMethodSkipInput(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(printOutput = false)
	public String tracedMethodSkipOutput(String id) {
		
		return "#" + id + "#";
	}
	
	@Traceable(inputArgsIndex = { 0, 2, 4 })
	public String tracedMethodSelectedParameters(String id1, String id2, String id3, String id4, String id5) {
		
		return "#" + id1 + "#" + id2 + "#" + id3 + "#" + id4 + "#" + id5 + "#";
	}
}