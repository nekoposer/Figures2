package figures;

import consts.Const;

import java.util.ArrayList;

public class Cone extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public Cone(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.size() != Const.POINT_THREE) {
            return false;
        }
        if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS
            && coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS
            && coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS) {

            double xZero = coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS);
            double yZero = coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
            double zZero = coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);

            double xOne = coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS);
            double yOne = coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
            double zOne = coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);
            double cosOne = (xZero * xOne + yZero * yOne + zZero * zOne) / (Math.sqrt(Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2)) * Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2)));

            if (cosOne == 0) {
                System.out.println("The figure is valid");
                return true;
            }
        }
        System.out.println("The figure is invalid");
        return false;
    }

    @Override
    public double isArea() {
        double xZero = coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS);
        double yZero = coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
        double zZero = coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);

        double xTwo = coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS);
        double yTwo = coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS);
        double zTwo = coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS);

        double radius = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));
        double length = Math.sqrt(Math.pow(xTwo, 2) + Math.pow(yTwo, 2) + Math.pow(zTwo, 2));
        double area = Math.PI * radius * (radius + length);
        System.out.printf("The figure area %.2f \n", area);
        return area;
    }
}
