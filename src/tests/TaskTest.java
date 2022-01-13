package tests;

import tasks.Task;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class TaskTest {
    @Test
    public void taskTest() {
        Task lunch = new Task("Lunch with a beautiful girl",
                LocalDateTime.of(2021,8,24,16,0));

        LocalDateTime start = LocalDateTime.of(2021,3,1,8,15);
        LocalDateTime end = LocalDateTime.of(2021,9,1,8,15);
        long interval = 24;
        Task run = new Task("Morning run",start,end,interval);

        Task medication = new Task("Taking medication",
                LocalDateTime.of(2021,8,20,8,15),
                LocalDateTime.of(2021,8,28,0,0),
                12);

        Task friends = new Task("Meeting with friends",
                LocalDateTime.of(2021,9,1,18,0));

        System.out.println(medication);
        medication.setActive(true);

        System.out.println(medication.nextTimeAfter(
                LocalDateTime.of(2021,8,20,12,0)));

        start = LocalDateTime.of(2021,8,20,7,0);
        end = LocalDateTime.of(2021,8,28,15,0);
        interval = 8;
        medication.setTime(start,end,interval);
        System.out.println();
        System.out.println(medication);
    }
}
