public class Task_1_3 {
    // z = (sin (x) + cos (y)) / (cos (x) - sin (y)) * tg (x*y)
    public static void main (String[] args) {

        TaskHelper helper = new TaskHelper();

        double x = Math.toRadians(Integer.parseInt(helper.GetUserInput("Input х: ")));
        //System.out.println("Entered: "+x + ". Cosine " + x + " = " + Math.cos(x));
        double y = Math.toRadians(Integer.parseInt(helper.GetUserInput("Input y: ")));
        //System.out.println("Entered: y="+y + ". Sinus " + y + " = " + Math.cos(y));

        if ((Math.cos(x)-Math.sin(y)) != 0) {
            if(Math.cos(x*y) != 0){
                //System.out.println("Cos (" + x*y + ") = " + Math.cos(x*y));
                double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
                System.out.println("Expression = " +z);
            }
            else {
                System.out.println("Mistake! Cos(x*y) must not be zero");
            }
        }
        else {
            System.out.println("Mistake! Cos(x) must not be equal to Sin(y)");
        }
    }
}
