package figures;

import consts.Const;

import java.util.ArrayList;

public class Square extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Square(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
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
            
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine);
            
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine);
            
            if (firstLine == thirdLine && firstLine == secondLine && secondLine == fourthLine && firstDiagonal == secondDiagonal) {
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
            
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine + zLine);
            
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS), 2);
            zLine = Math.pow(coords.get(Const.POINT_THREE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine + zLine);
            
            if (firstLine == thirdLine && firstLine == secondLine && secondLine == fourthLine && firstDiagonal == secondDiagonal) {
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
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine);

            area = Math.pow(firstLine, 2);
            System.out.printf("The figure area %.2f", area);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);

            area = Math.pow(firstLine, 2);
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

            perimeter = 4 * firstLine;
            System.out.printf("\nThe figure perimeter %.2f", perimeter);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.X_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Y_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Y_FROM_COORDS), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(Const.Z_FROM_COORDS) - coords.get(Const.POINT_ZERO).get(Const.Z_FROM_COORDS), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);

            perimeter = 4 * firstLine;
            System.out.printf("\nThe figure perimeter %.2f", perimeter);
        }
        return perimeter;
    }
}