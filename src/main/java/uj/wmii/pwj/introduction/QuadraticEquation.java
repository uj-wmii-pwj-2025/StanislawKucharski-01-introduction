package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        double delt = b*b - 4 * a * c;

        if (delt > 0) {
            delt = Math.sqrt(delt);
            double x1 = (-b + delt) / (2 * a);
            double x2 = (-b - delt) / (2 * a);
            return new double[]{x1, x2};
        } else if (delt == 0) {
            double x0 = -b / (2 * a);
            return new double[]{x0};
        }
        return new double[]{};
    }

}

