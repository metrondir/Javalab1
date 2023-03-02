public class Main {
    private static Math math;

    public static void main(String[] args) {
        double y=0;
        double x=0;


        while(x<=5)
        {
            y = Math.pow(4 * Math.pow(x, 3) + Math.pow(x, 2),1./4);
            System.out.print("x="+x);
            System.out.print("y="+y);
            x+=0.5;
        }

    }

}
