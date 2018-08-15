package hello;
//import org.joda.time.LocalTime;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);


    public static void main(String[] args) {
        org.joda.time.LocalTime currentTime = new org.joda.time.LocalTime();
        System.out.println("The current local time is: " + currentTime);

       // Greeter greeter = new Greeter();
        //System.out.println(greeter.sayHello());
        logger.debug("[MAIN] Current Date : {}", getCurrentDate());
        System.out.println(getCurrentDate());
    }
    private static Date getCurrentDate(){
        return new Date();
    }
}
