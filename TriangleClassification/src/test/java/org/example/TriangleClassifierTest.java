package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TriangleClassifierTest {

    private TriangleClassifier triangleClassifier;

    @BeforeEach
    void setUp() {
        triangleClassifier = new TriangleClassifier();
    }

    @Test
    @Order(1)
    @DisplayName("Not a triangle: a = 8, b = 2, c = 3")
    void testNotATriangle_Case1() {
        int a = 8, b = 2, c = 3;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertFalse(result);
    }

    @Test
    @Order(2)
    @DisplayName("Not a triangle: a = -1, b = 2, c = 1")
    void testNotATriangle_Case2() {
        int a = -1, b = 2, c = 1;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertFalse(result);
    }

    @Test
    @Order(3)
    @DisplayName("Not a triangle: a = 0, b = 1, c = 1")
    void testNotATriangle_Case3() {
        int a = 0, b = 1, c = 1;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertFalse(result);
    }

    @Test
    @Order(4)
    @DisplayName("Equilateral triangle: a = b = c = 2")
    void testEquilateralTriangle() {
        int a = 2, b = 2, c = 2;
        String expected = "Equilateral triangle";
        String result = triangleClassifier.typeTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @Order(5)
    @DisplayName("Isosceles triangle: a = b = 2, c = 3")
    void testIsoscelesTriangle() {
        int a = 2, b = 2, c = 3;
        String expected = "Isosceles triangle";
        String result = triangleClassifier.typeTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @Order(6)
    @DisplayName("Regular triangle: a = 3, b = 4, c = 5")
    void testRegularTriangle() {
        int a = 3, b = 4, c = 5;
        String expected = "Regular triangle";
        String result = triangleClassifier.typeTriangle(a, b, c);
        assertEquals(expected, result);
    }

}