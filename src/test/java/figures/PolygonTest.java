package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PolygonTest {
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
        secondPoint.add(1);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(1);
        point.add(thirdPoint);
        Polygon polygon = new Polygon(point);
        boolean vaild = polygon.isValid();
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
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(1);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Polygon polygon = new Polygon(point);
        double area = polygon.isArea();
        Assertions.assertEquals(0.5, area);
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
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(1);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Polygon polygon = new Polygon(point);
        double perimeter = polygon.isPerimeter();
        Assertions.assertEquals(3.414213562373095, perimeter);
    }
}

