package figures;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TruncatedSphereTest {
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
        secondPoint.add(2);
        secondPoint.add(0);
        secondPoint.add(0);
        point.add(secondPoint);
        thirdPoint.add(0);
        thirdPoint.add(2);
        thirdPoint.add(0);
        point.add(thirdPoint);
        TruncatedSphere truncatedSphere = new TruncatedSphere(point);
        boolean vaild = truncatedSphere.isValid();
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
        secondPoint.add(2);
        secondPoint.add(0);
        secondPoint.add(0);
        point.add(secondPoint);
        thirdPoint.add(0);
        thirdPoint.add(2);
        thirdPoint.add(0);
        point.add(thirdPoint);
        TruncatedSphere truncatedSphere = new TruncatedSphere(point);
        double area = truncatedSphere.isArea();
        Assertions.assertEquals(37.69911184307752, area);
    }
}

