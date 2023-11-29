import figures.Figure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> massCoords = new ArrayList<>();
        Pattern coordinates = Pattern.compile("-?\\d+ -?\\d+( -?\\d+)?");
        Pattern allFigures = Pattern.compile("FIGURE|CIRCLE|SQUARE|RECTANGLE|PARALLELOGRAM|TRIANGLE|POLYGON|SPHERE|TRUNCATED_SPHERE|CYLINDER|CONE");
        boolean flag = true;

        while (flag) {
            System.out.println("Enter figure");
            String inputFigure = in.nextLine();
            Matcher forFigures = allFigures.matcher(inputFigure);

            if (forFigures.matches()) {
                System.out.println("Enter coordinates");

                while (true) {
                    String enter = in.nextLine();
                    Matcher forCoordinates = coordinates.matcher(enter);

                    if (forCoordinates.matches()) {
                        massCoords.add(inputCoords(enter));
                    } else if (enter.equals("STOP_INPUT")) {
                        Figure figure = Figure.createFigure(inputFigure, massCoords);
                        if (figure.isValid()) {
                            figure.isArea();
                            figure.isPerimeter();
                            flag = false;
                        } else {
                            massCoords.clear();
                        }
                        break;
                    } else {
                        System.out.println("Please, retype");
                        massCoords.clear();
                    }
                }
            } else if (inputFigure.equals("END")) {
                break;
            } else {
                System.out.println("Incorrect input");
                massCoords.clear();
            }
        }
    }
    public static ArrayList<Integer> inputCoords(String coords) {
        ArrayList<Integer> coordinates = new ArrayList<>();
        String[] temp = coords.split(" ");

        for (String s : temp) {
            coordinates.add(Integer.parseInt(s));
        }
        return coordinates;
    }
}