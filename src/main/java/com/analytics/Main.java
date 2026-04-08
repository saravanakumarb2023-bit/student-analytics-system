package com.analytics;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create student list
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 60),
                new Student("Charlie", 40)
        );

        // Create service object
        AnalyticsService service = new AnalyticsService();

        // Average
        double avg = service.calculateAverage(students);
        System.out.println("Average Marks: " + avg);

        // Ranking
        System.out.println("\nRanking:");
        List<Student> ranked = service.rankStudents(students);
        for (Student s : ranked) {
            System.out.println(s.getName() + " - " + s.getMarks());
        }

        // Performance Trend
        System.out.println("\nPerformance:");
        for (Student s : students) {
            System.out.println(s.getName() + " - " +
                    service.getPerformanceTrend(s.getMarks()));
        }
    }
}