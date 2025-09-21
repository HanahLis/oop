import edu.princeton.cs.algs4.*;
public class RandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        double b = 0.1;
        double theta = 0;
        for (int i=1; i<=5000; i++) {
            double r = b*theta;
            double x = r*Math.cos(theta);
            double y = r*Math.sin(theta);

            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.2);
            StdDraw.show();
            StdDraw.pause(5);

            theta += 0.05;
        }
    }

}
