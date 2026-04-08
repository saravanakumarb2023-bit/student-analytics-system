package com.analytics;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AnalyticsServiceTest {

    AnalyticsService service = new AnalyticsService();

    @Test
    void testAverage() {
        List<Student> students = Arrays.asList(
                new Student("A", 80),
                new Student("B", 60)
        );

        assertEquals(70.0, service.calculateAverage(students));
    }

    @Test
    void testRanking() {
        List<Student> students = Arrays.asList(
                new Student("A", 50),
                new Student("B", 90)
        );

        List<Student> ranked = service.rankStudents(students);

        assertEquals("B", ranked.get(0).getName());
    }

    @Test
    void testPerformanceTrend() {
        assertEquals("Excellent", service.getPerformanceTrend(85));
        assertEquals("Average", service.getPerformanceTrend(60));
        assertEquals("Poor", service.getPerformanceTrend(30));
    }
}