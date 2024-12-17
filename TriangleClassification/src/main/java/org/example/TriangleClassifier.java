package org.example;

public class TriangleClassifier {
    public boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public String typeTriangle(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return "Not a triangle";
        }
        if (a == b && b == c) {
            return "Equilateral triangle";
        }
        if (a == c || b == c || a == b) {
            return "Isosceles triangle";
        }
        return "Regular triangle";
    }
}
