package es.com.arisnegro.spring.services.traceable.demo;

import org.springframework.context.annotation.Bean;

import es.com.arisnegro.spring.services.traceable.aspects.TraceableAspect;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public TraceableAspect traceableAspect() {
		
		return new TraceableAspect();
	}
}
