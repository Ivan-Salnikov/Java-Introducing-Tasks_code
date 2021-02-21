public class Task_1_5 {

    // A natural number T is given, which is the duration of the elapsed time in seconds.
    // Print the given duration value in hours, minutes and seconds. Output format "HHч MMм SSс"

    public static void main (String[] args) {

        TaskHelper helper = new TaskHelper();
        String strChar = helper.GetUserInput("Input duration in seconds: ");

        int durationTime = Integer.parseInt(strChar);
        //System.out.println("durationTime = " + durationTime);

        int hourQuantity = (int) Math.floor (durationTime/3600);
        //System.out.println("hourQuantity = " + hourQuantity);

        int minuteQuantity = (int) Math.floor ((durationTime-hourQuantity*3600)/60);
        //System.out.println("minuteQuantity = " + minuteQuantity);

        int secondQuantity = (int) Math.floor (durationTime-hourQuantity*3600 - minuteQuantity*60);
        //System.out.println("secondQuantity = " + secondQuantity);

        System.out.println(hourQuantity + "ч " + minuteQuantity + "м " + secondQuantity + "с");


    }
}
