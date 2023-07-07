package streamRT;

import java.time.Duration;
import java.time.Instant;

public class Test08 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        long sum = 0;
        for(long i = 0; i <= 50000000000L; i++){
            sum += i;
        }
        Instant end = Instant.now();
        //time: 25038
        System.out.println("time: "+ Duration.between(start, end).toMillis())   ;
    }
}
