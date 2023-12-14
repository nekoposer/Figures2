package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConeTest {
    @Test
    @DisplayName("Is figure valid")
    public void isValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        ArrayList<Integer> thirdPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(1);
        secondPoint.add(0);
        secondPoint.add(0);
        point.add(secondPoint);
        thirdPoint.add(0);
        thirdPoint.add(2);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Cone cone = new Cone(point);
        boolean vaild = cone.isValid();
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
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(1);
        secondPoint.add(0);
        secondPoint.add(0);
        point.add(secondPoint);
        thirdPoint.add(0);
        thirdPoint.add(2);
        thirdPoint.add(0);
        point.add(thirdPoint);
        Cone cone = new Cone(point);
        double area = cone.isArea();
        Assertions.assertEquals(10.166407384630519, area);
    }
}

