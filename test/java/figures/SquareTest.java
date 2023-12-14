package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {
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
        secondPoint.add(2);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(2);
        point.add(thirdPoint);
        fourthPoint.add(2);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Square square = new Square(point);
        boolean vaild = square.isValid();
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
        secondPoint.add(2);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(2);
        point.add(thirdPoint);
        fourthPoint.add(2);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Square square = new Square(point);
        double area = square.isArea();
        Assertions.assertEquals(4.0, area);
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
        secondPoint.add(2);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(2);
        point.add(thirdPoint);
        fourthPoint.add(2);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Square square = new Square(point);
        double perimeter = square.isPerimeter();
        Assertions.assertEquals(8.0, perimeter);
    }
}

