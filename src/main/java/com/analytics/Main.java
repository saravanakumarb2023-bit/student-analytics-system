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

        // Ranking
        System.out.println("\nRanking:");
        service.getRanking(students)
                .forEach(s -> System.out.println(s.getName() + " - " + s.getMarks()));

        // Performance
        System.out.println("\nPerformance:");
        service.getPerformance(students)
                .forEach((name, performance) ->
                        System.out.println(name + " - " + performance));
    }
}