package figures;

import consts.Const;

import java.util.ArrayList;

public class Polygon extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Polygon(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        int chet = 0;
        if (coords.size() >= 3) {
            if ((coords.get(0).size() == 2) || (coords.get(0).size() == 3)) {
                for (int i = 0; i < coords.size() - 1; ++i) {
                    if (coords.get(i).size() != coords.get(i + 1).size()) {
                        System.out.println("The figure is invalid\n");
                        return false;
                    }
                    for (int k = i + 1; k < coords.size(); ++k) {
                        if (coords.get(i).equals(coords.get(k))) {
                            ++chet;
                        }
                    }

                }
                if (coords.size() - chet < 3) {
                    System.out.println("The figure is invalid\n");
                    return false;
                } else {
                    System.out.println("The figure is valid\n");
                    return true;
                }
            }
        }
        System.out.println("The figure is invalid\n");
        return false;
    }

    @Override
    public double isArea() {
        double sFirst = 0;
        double sSecond = 0;

        for (int i = 0; i < coords.size() - 1; ++i) {
            sFirst += coords.get(i).get(Const.X_FROM_COORDS) * coords.get(i + 1).get(Const.Y_FROM_COORDS);
            sSecond += coords.get(i).get(Const.Y_FROM_COORDS) * coords.get(i + 1).get(Const.X_FROM_COORDS);
        }
        double area = Math.abs(sFirst - sSecond) / 2;
        System.out.printf("The figure area %.2f \n", area);
        return area;
    }

    @Override
    public double isPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < coords.size(); ++i) {
            double xLine = Math.pow(coords.get(i).get(Const.X_FROM_COORDS) - coords.get(i - 1).get(Const.X_FROM_COORDS), 2);
            double yLine = Math.pow(coords.get(i).get(Const.Y_FROM_COORDS) - coords.get(i - 1).get(Const.Y_FROM_COORDS), 2);
            double Line = Math.sqrt(xLine + yLine);
            perimeter += Line;
        }
        perimeter += Math.sqrt(Math.pow(coords.get(0).get(Const.X_FROM_COORDS) - coords.get(coords.size() - 1).get(Const.X_FROM_COORDS), 2) + Math.pow(coords.get(0).get(Const.Y_FROM_COORDS) - coords.get(coords.size() - 1).get(Const.Y_FROM_COORDS), 2));
        System.out.printf("The figure perimeter %.2f", perimeter);
        return perimeter;
    }
}