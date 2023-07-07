package streamRT;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class Test09 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        LongStream longStream = LongStream.rangeClosed(0, 50000000000L);
        long asLong = longStream.parallel().reduce(Long::sum).getAsLong();
        System.out.println(asLong);
        Instant end = Instant.now();
        //time: 4286
        //并行流差分成多个线程， 最后在结合到一起， 但是会消耗CPU资源
        System.out.println("time: "+ Duration.between(start, end).toMillis());
    }
}
