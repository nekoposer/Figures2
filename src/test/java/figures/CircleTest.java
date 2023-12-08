package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    @DisplayName("Is figure valid")
    public void isValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        Circle circle = new Circle(point);
        boolean vaild = circle.isValid();
        Assertions.assertEquals(true, vaild);
    }

    @Test
    @DisplayName("Is area valid")
    public void areaValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        Circle circle = new Circle(point);
        double area = circle.isArea();

        Assertions.assertEquals(3.141592653589793, area);
    }

    @Test
    @DisplayName("Is perimeter valid")
    public void perimeterValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        Circle circle = new Circle(point);
        double perimeter = circle.isPerimeter();

        Assertions.assertEquals(6.283185307179586, perimeter);
    }
}
