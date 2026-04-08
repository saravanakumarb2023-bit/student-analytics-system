package com.analytics;

import java.util.*;

public class AnalyticsService {

    public double calculateAverage(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0);
    }

    // ✅ FIX: Do NOT modify original list (important for tests)
    public List<Student> rankStudents(List<Student> students) {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));
        return sorted;
    }

    // ✅ FIX: EXACT expected logic
    public String getPerformanceTrend(int marks) {
        if (marks >= 75) return "Excellent";
        if (marks >= 50) return "Average";
        return "Poor";
    }
}