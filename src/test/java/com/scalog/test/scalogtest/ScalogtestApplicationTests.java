package com.scalog.test.scalogtest;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScalogtestApplicationTests {
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",
            Locale.CHINA);


    @Test
    void contextLoads() {
        long startTime = System.currentTimeMillis();
        LocalDateTime localDateTime = LocalDateTime
                .ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault());
        System.out.println(localDateTime.toString());
        System.out.println(FORMAT.format(localDateTime));
        System.out.println(FORMAT.format(localDateTime.minusHours(-12)));
    }

}
