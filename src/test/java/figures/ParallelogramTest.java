package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParallelogramTest {
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
        secondPoint.add(1);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(1);
        point.add(thirdPoint);
        fourthPoint.add(1);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Parallelogram parallelogram = new Parallelogram(point);
        boolean vaild = parallelogram.isValid();
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
        secondPoint.add(1);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(1);
        point.add(thirdPoint);
        fourthPoint.add(1);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Parallelogram parallelogram = new Parallelogram(point);
        double area = parallelogram.isArea();
        Assertions.assertEquals(1.0, area);
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
        secondPoint.add(1);
        secondPoint.add(1);
        point.add(secondPoint);
        thirdPoint.add(2);
        thirdPoint.add(1);
        point.add(thirdPoint);
        fourthPoint.add(1);
        fourthPoint.add(0);
        point.add(fourthPoint);
        Parallelogram parallelogram = new Parallelogram(point);
        double perimeter = parallelogram.isPerimeter();
        Assertions.assertEquals(4.82842712474619, perimeter);
    }
}

