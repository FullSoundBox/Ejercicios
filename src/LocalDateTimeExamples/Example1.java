package LocalDateTimeExamples;

import java.time.LocalDateTime;

public class Example1 {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha);
        fecha = LocalDateTime.of(2021,8,24,16,0);
        System.out.println(fecha);
    }
}
