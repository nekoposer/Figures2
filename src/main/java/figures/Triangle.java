package figures;

import consts.Const;

import java.util.ArrayList;

public class Triangle extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Triangle(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }
    @Override
    public boolean isValid() {
        if (area(coords).get(1) == 0) {
            System.out.println("The figure is invalid");
            return false;
        }
        System.out.println("The figure is valid");
        return true;
    }
    public ArrayList<Double> area(ArrayList<ArrayList<Integer>> coords) {
        ArrayList<Double> result = new ArrayList<>();
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine);
            
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            double secondLine = Math.sqrt(xLine + yLine);
            
            xLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS), 2);
            double thirdLine = Math.sqrt(xLine + yLine);

            double temp = (firstLine + secondLine + thirdLine) / 2;
            double square = Math.sqrt(temp * (temp - firstLine) * (temp - secondLine) * (temp - thirdLine));

            result.add(temp);
            result.add(square);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);
            
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS), 2);
            double secondLine = Math.sqrt(xLine + yLine + zLine);
            
            xLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS), 2);
            double thirdLine = Math.sqrt(xLine + yLine + zLine);

            double temp = (firstLine + secondLine + thirdLine) / 2;
            double square = Math.sqrt(temp * (temp - firstLine) * (temp - secondLine) * (temp - thirdLine));

            result.add(temp);
            result.add(square);
        }
        return result;
    }

    @Override
    public double isArea() {
        double figureArea = area(coords).get(1);
        System.out.printf("The figure area %.2f", figureArea);
        return figureArea;
    }

    @Override
    public double isPerimeter() {
        double perimeter = area(coords).get(0) * 2;
        System.out.printf("\nThe figure perimeter %.2f", perimeter);
        return perimeter;
    }
}