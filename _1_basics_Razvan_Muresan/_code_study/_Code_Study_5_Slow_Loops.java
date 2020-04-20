import java.time.Duration;
import java.time.Instant;

public class Study_5 {

    public static void main(String[] args){
        loopUsingPrimitive();
        loopUsingWrapper();
    }

    private static void loopUsingWrapper(){
        Instant start2 = Instant.now();
        //System.out.println(start2);
        for (Integer i = 0; i < 10000000; i++);
        Instant stop2 = Instant.now();
        //System.out.println(stop2);
        Duration duration2 = Duration.between(start2, stop2);
        System.out.println("Using wrapper: "+ duration2);
    }

    private static void loopUsingPrimitive(){
        Instant start1 = Instant.now();
        for (int i = 0; i < 10000000; i++);
            Instant stop1 = Instant.now();
            Duration duration1 = Duration.between(start1, stop1);
            System.out.println("Using primitive: " + duration1);
    }

}
