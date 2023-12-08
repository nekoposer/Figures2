package figures;

import consts.Const;

import java.util.ArrayList;

public class TruncatedSphere extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public TruncatedSphere(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS
            && coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS
            && coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS) {

            double xZero = coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS); //radius
            double yZero = coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
            double zZero = coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);

            double xOne = coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS); //do sechenia
            double yOne = coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
            double zOne = coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);

            double radius = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));
            double sechenie = Math.sqrt(Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2));
            if (radius == sechenie) {
                System.out.println("The figure is valid");
                return true;
            }
        }
        System.out.println("The figure is invalid");
        return false;
    }

    @Override
    public double isArea() {
        ArrayList<Integer> tempPoint = new ArrayList<>();
        tempPoint.add(coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS));
        tempPoint.add(coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS));
        tempPoint.add(coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS));
        coords.add(tempPoint);

        double xZero = coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS);
        double yZero = coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
        double zZero = coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);
        double radius = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));

        double xH = coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS);
        double yH = coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS);
        double zH = coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.Z_FROM_COORDS);
        double hMin = Math.sqrt(Math.pow(xH, 2) + Math.pow(yH, 2) + Math.pow(zH, 2));

        double hMax = radius - hMin;
        double areaSegment = Math.PI * 2 * radius * hMax;
        double areaSphere = 2 * 2 * Math.PI * Math.pow(radius, 2);
        double radiusMin = Math.sqrt(Math.pow(radius, 2) - Math.pow(hMin, 2));
        double areaDisk = Math.PI * Math.pow(radiusMin, 2);
        double area = areaSphere - areaSegment + areaDisk;
        System.out.printf("The figure area %.2f", area);

        return area;
    }
}
