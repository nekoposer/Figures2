package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    @DisplayName("Is figure valid")
    public void isValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        ArrayList<Integer> fourthPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(3);
        thirdPoint.add(1);
        point.add(thirdPoint);
        fourthPoint.add(3);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Rectangle rectangle = new Rectangle(point);
        boolean vaild = rectangle.isValid();
        Assertions.assertEquals(true, vaild);
    }

    @Test
    @DisplayName("Is area valid")
    public void areaValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        ArrayList<Integer> fourthPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(3);
        thirdPoint.add(1);
        point.add(thirdPoint);
        fourthPoint.add(3);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Rectangle rectangle = new Rectangle(point);
        double area = rectangle.isArea();
        Assertions.assertEquals(3.0, area);
    }

    @Test
    @DisplayName("Is perimeter valid")
    public void perimeterValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        ArrayList<Integer> fourthPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(3);
        thirdPoint.add(1);
        point.add(thirdPoint);
        fourthPoint.add(3);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Rectangle rectangle = new Rectangle(point);
        double perimeter = rectangle.isPerimeter();
        Assertions.assertEquals(8.0, perimeter);
    }
}

