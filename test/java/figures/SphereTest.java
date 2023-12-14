package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SphereTest {
    @Test
    @DisplayName("Is figure valid")
    public void isValid() {
        ArrayList<ArrayList<Integer>> point = new ArrayList<>();
        ArrayList<Integer> firstPoint = new ArrayList<>();
        ArrayList<Integer> secondPoint = new ArrayList<>();
        firstPoint.add(0);
        firstPoint.add(0);
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        secondPoint.add(0);
        point.add(secondPoint);
        Sphere sphere = new Sphere(point);
        boolean vaild = sphere.isValid();
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
        firstPoint.add(0);
        point.add(firstPoint);
        secondPoint.add(0);
        secondPoint.add(1);
        secondPoint.add(0);
        point.add(secondPoint);
        Sphere sphere = new Sphere(point);
        double area = sphere.isArea();
        Assertions.assertEquals(12.566370614359172, area);
    }
}

