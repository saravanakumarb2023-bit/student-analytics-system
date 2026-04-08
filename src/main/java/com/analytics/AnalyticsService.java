package com.analytics;

import java.util.*;

public class AnalyticsService {

    // ✅ Calculate Average Marks
    public double calculateAverage(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0);
    }

    // ✅ Rank Students (Highest marks first)
    public List<Student> rankStudents(List<Student> students) {
        students.sort((a, b) -> b.getMarks() - a.getMarks());
        return students;
    }

    // ✅ Performance Category
    public String getPerformanceTrend(int marks) {
        if (marks >= 75) return "Excellent";
        else if (marks >= 50) return "Average";
        else return "Poor";
    }
}