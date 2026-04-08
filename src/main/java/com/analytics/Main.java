package com.analytics;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 60));
        students.add(new Student("Charlie", 40));

        AnalyticsService service = new AnalyticsService();

        // Average
        double avg = service.calculateAverage(students);
        System.out.println("Average Marks: " + avg);

        // ✅ FIXED: rankStudents
        System.out.println("\nRanking:");
        service.rankStudents(students)
                .forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));

        // ✅ FIXED: getPerformanceTrend
        System.out.println("\nPerformance:");
        for (Student s : students) {
            System.out.println(s.getName() + " - " +
                    service.getPerformanceTrend(s.getMarks()));
        }
    }
}