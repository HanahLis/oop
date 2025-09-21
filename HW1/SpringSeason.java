import java.util.Scanner;

public class SpringSeason {
    public static class Date{
        private int day;
        private int month;

        public void setDate (int m, int d){
            month = m;
            day = d;
        }
        public boolean Spring (){
            switch (month) {
                case 3:
                    if (day>=20 && day<=31) return true;
                    else return false;
                case 4:
                    if (day>=1 && day<=30) return true;
                    else return false;
                case 5:
                    if (day>=1 && day<=31) return true;
                    else return false;
                case 6:
                    if (day<=20 && day>=1) return true;
                    else return false;
                default:
                    return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date today = new Date();

        int m = sc.nextInt();
        int d = sc.nextInt();

        today.setDate(m, d);
        System.out.println(today.Spring());
    }
}
