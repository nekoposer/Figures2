package figures;

import consts.Const;

import java.util.ArrayList;

public class Sphere extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public Sphere(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.size() == 2) {
            if ((coords.get(0).size() == coords.get(1).size()) && (coords.get(0).size() == Const.XY_COORDS || coords.get(0).size() == Const.XYZ_COORDS)) {
                if (coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS) == coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS)
                    && coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS) == coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS)
                    && coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS) == coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS)) {
                    return false;
                }
                System.out.println("The figure is valid");
                return true;
            }
        }
        System.out.println("The figure is invalid");
        return false;
    }

    @Override
    public double isArea() {
        double radius = 0;
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLength = Math.pow((coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS)), 2);
            double yLength = Math.pow((coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS)), 2);
            radius = Math.sqrt(xLength + yLength);
        } else {
            double xLength = Math.pow((coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS)), 2);
            double yLength = Math.pow((coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS)), 2);
            double zLength = Math.pow((coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS)), 2);
            radius = Math.sqrt(xLength + yLength + zLength);
        }

        double area = 2 * 2 * Math.PI * Math.pow(radius, 2);
        System.out.printf("The figure area %.2f", area);
        return area;
    }
}
