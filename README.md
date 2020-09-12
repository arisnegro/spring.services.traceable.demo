# Description
Simple Spring project that integrates [services.traceable](https://github.com/arisnegro/spring.services.traceable) and prints different log messages to show the utility of the library.

# Instructions
Use maven to build and run the application.

```bash
mvn spring-boot:run
```

After some seconds, you must see an output like this:

```bash
2020-09-12 10:33:17.066  INFO 5777 --- [           main] e.c.a.s.s.traceable.demo.Application     : Application starts
2020-09-12 10:33:17.076 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethod: Args [ 1 ]
2020-09-12 10:33:17.089 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethod: Output [ #1# ]
2020-09-12 10:33:17.089 ERROR 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodFatalLevel: Args [ 2 ]
2020-09-12 10:33:17.090 ERROR 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodFatalLevel: Output [ #2# ]
2020-09-12 10:33:17.090 ERROR 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodErrorLevel: Args [ 3 ]
2020-09-12 10:33:17.091 ERROR 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodErrorLevel: Output [ #3# ]
2020-09-12 10:33:17.091  WARN 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodWarnLevel: Args [ 4 ]
2020-09-12 10:33:17.091  WARN 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodWarnLevel: Output [ #4# ]
2020-09-12 10:33:17.092  INFO 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodInfoLevel: Args [ 5 ]
2020-09-12 10:33:17.092  INFO 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodInfoLevel: Output [ #5# ]
2020-09-12 10:33:17.092 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodDebugLevel: Args [ 6 ]
2020-09-12 10:33:17.093 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodDebugLevel: Output [ #6# ]
2020-09-12 10:33:17.093 TRACE 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodTraceLevel: Args [ 7 ]
2020-09-12 10:33:17.093 TRACE 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodTraceLevel: Output [ #7# ]
2020-09-12 10:33:17.094  INFO 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodStartInfoEndDebug: Args [ 8 ]
2020-09-12 10:33:17.094 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodStartInfoEndDebug: Output [ #8# ]
2020-09-12 10:33:17.094 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodSkipInput
2020-09-12 10:33:17.094 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodSkipInput: Output [ #9# ]
2020-09-12 10:33:17.095 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodSkipOutput: Args [ 10 ]
2020-09-12 10:33:17.095 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodSkipOutput
2020-09-12 10:33:17.095 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : Start tracedMethodSelectedParameters: Args [ 11, 13, 15 ]
2020-09-12 10:33:17.096 DEBUG 5777 --- [           main] e.c.a.s.s.traceable.demo.TestService     : End tracedMethodSelectedParameters: Output [ #11#12#13#14#15# ]
2020-09-12 10:33:17.096  INFO 5777 --- [           main] e.c.a.s.s.traceable.demo.Application     : Application ends
```