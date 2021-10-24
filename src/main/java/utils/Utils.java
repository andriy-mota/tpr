package utils;

import lab1.Lab1;
import lab2.Lab2;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;

public class Utils {

    public static Integer[][] readLab1Data() {
        Integer[][] res = new Integer[3][3];
        String[] inputData = getResourceAsString("../lb_1_input.txt").replaceAll("\n", "").split(";");
        int z = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                res[i][j] = Integer.parseInt(inputData[z++]);
            }
        }
        return res;
    }

    public static Double[] readLab2Data() {
        Double[] res = new Double[14];
        String[] inputData = getResourceAsString("../lb_2_input.txt").split(";");
        int z = 0;
        for (int i = 0; i < 14; ++i) {
            res[i] = Double.parseDouble(inputData[z++]);
        }
        return res;
    }

    public static Integer[] readLab3PointsData() {
        Integer[] points = new Integer[5];
        String[] inputData = getResourceAsString("../lb_3_points.txt").split(";");
        for (int i = 0; i < 5; ++i) {
            points[i] = Integer.parseInt(inputData[i]);
        }
        return points;
    }

    public static Character[][] readLab3ComparisonData() {
        Character[][] comparison = new Character[3][5];
        String[] inputData = getResourceAsString("../lb_3_comparison.txt").split(";");

        int z = 0;
        for (int i = 0; i < 3; ++i) {
            for(int j = 0; j < 5; ++j) {
                comparison[i][j] = inputData[z++].toCharArray()[0];
            }
        }
        return comparison;
    }

    private static String getResourceAsString(String fileName) {
        try (InputStream is = Lab2.class.getResourceAsStream(fileName)) {
            return IOUtils.toString(is);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
