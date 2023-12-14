package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    @DisplayName("Is figure valid")
    public void isValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(2);
        secondPoint.add(2);
        point.add(secondPoint);
        thirdPoint.add(4);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Triangle triangle = new Triangle(point);
        boolean vaild = triangle.isValid();
        Assertions.assertEquals(true, vaild);
    }

    @Test
    @DisplayName("Is area valid")
    public void areaValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(2);
        secondPoint.add(2);
        point.add(secondPoint);
        thirdPoint.add(4);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Triangle triangle = new Triangle(point);
        double area = triangle.isArea();
        Assertions.assertEquals(3.9999999999999982, area);
    }

    @Test
    @DisplayName("Is perimeter valid")
    public void perimeterValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(2);
        secondPoint.add(2);
        point.add(secondPoint);
        thirdPoint.add(4);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Triangle triangle = new Triangle(point);
        double perimeter = triangle.isPerimeter();
        Assertions.assertEquals(9.65685424949238, perimeter);
    }
}

