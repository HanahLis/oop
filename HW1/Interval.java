import java.util.Scanner;

public class Interval {
    private double left;
    private double right;

    public void setCoordinate (double l, double r){
        if (l < 0 || r < 0 || l > r)
            throw new IllegalArgumentException("khong hop le");
        left = l;
        right = r;
    }
    public boolean contain (double x){
        return (x>=left) && (x<=right);
    }
    public boolean intersects (Interval b){
        if ((b.right < this.left) || (this.right<b.left)) return false;
        return true;
    }
    public String toString(){
        return "[" + left + ", " + right + "]";
    }

    public static void main(String[] args) {
        Interval x = new Interval();
        Interval y = new Interval();

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        x.setCoordinate(a, b);
        y.setCoordinate(c, d);

        System.out.println(x.intersects(y));
        System.out.println(x.toString());
    }
}
