package figures;

import consts.Const;

import java.util.ArrayList;

public class Parallelogram extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Parallelogram(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.size() != Const.NUMBER_SQUARE_COORDS) {
            return false;
        }
        if (coords.get(Const.POINT_ZERO).size() == Const.XY_COORDS
            && coords.get(Const.POINT_ONE).size() == Const.XY_COORDS
            && coords.get(Const.POINT_TWO).size() == Const.XY_COORDS
            && coords.get(Const.POINT_THREE).size() == Const.XY_COORDS) {

            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine);

            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            double secondLine = Math.sqrt(xLine + yLine);

            xLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS), 2);
            double thirdLine = Math.sqrt(xLine + yLine);

            xLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS), 2);
            double fourthLine = Math.sqrt(xLine + yLine);

            if (firstLine == thirdLine && secondLine == fourthLine) {
                System.out.println("The figure is valid");
                return true;
            }
        } else if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS
                   && coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS
                   && coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS
                   && coords.get(Const.POINT_THREE).size() == Const.XYZ_COORDS) {

            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);

            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS), 2);
            double secondLine = Math.sqrt(xLine + yLine + zLine);

            xLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS), 2);
            double thirdLine = Math.sqrt(xLine + yLine + zLine);

            xLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_THREE).get(Const.Z_FROM_COORDS), 2);
            double fourthLine = Math.sqrt(xLine + yLine + zLine);

            System.out.println(firstLine + "\n" + thirdLine + "\n" + secondLine + "\n" + fourthLine);

            if (firstLine == thirdLine && secondLine == fourthLine) {
                System.out.println("The figure is valid");
                return true;
            }
        }
        System.out.println("The figure is invalid");
        return false;
    }

    @Override
    public double isArea() {
        double area = 0;
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine);
            
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine);
            
            double xOne = coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS);
            double yOne = coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
            
            double xTwo = coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS);
            double yTwo = coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS);
            
            double cos = (xOne * xTwo + yOne * yTwo) / Math.sqrt((Math.pow(xOne, 2) + Math.pow(yOne, 2)) * (Math.pow(xTwo, 2) + Math.pow(yTwo, 2)));
            area = Math.sqrt(1 - Math.pow(cos, 2)) * firstDiagonal * secondDiagonal / 2;
            System.out.printf("The figure area %.2f", area);

        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double zLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine + zLine);
            
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine + zLine);
            
            double xOne = coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS);
            double yOne = coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS);
            double zOne = coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS);
            
            double xTwo = coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS);
            double yTwo = coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS);
            double zTwo = coords.get(Const.POINT_THREE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS);
            
            double cos = (xOne * xTwo + yOne * yTwo + zOne * zTwo) / Math.sqrt((Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2)) * (Math.pow(xTwo, 2) + Math.pow(yTwo, 2) + Math.pow(zOne, 2)));
            area = Math.sqrt(1 - Math.pow(cos, 2)) * firstDiagonal * secondDiagonal / 2;
            System.out.printf("The figure area %.2f", area);
        }
        return area;
    }

    @Override
    public double isPerimeter() {
        double perimeter = 0;
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine);

            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            double secondLine = Math.sqrt(xLine + yLine);

            perimeter = firstLine * 2 + secondLine * 2;
            System.out.printf("\nThe figure perimeter %.2f", perimeter);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);

            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS), 2);
            double secondLine = Math.sqrt(xLine + yLine + zLine);

            perimeter = firstLine * 2 + secondLine * 2;
            System.out.printf("\nThe figure perimeter %.2f", perimeter);
        }
        return perimeter;
    }
}