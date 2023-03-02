public class task2 {
    private static Math math;
    public static double x;
    public static void main(String[] args) {
        double y=0;
        double x=-10;
        while(x<=10)
        {
            if(x<0)
            {
                Math.sin(Math.cos(x));
            }
            else y=Math.cos(Math.sin(x));
            System.out.print("y="+y );
            System.out.print("x="+x );
            x+=2;
        }
    }
}
