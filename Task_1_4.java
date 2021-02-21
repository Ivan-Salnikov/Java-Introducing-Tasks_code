public class Task_1_4 {

        // nnn.ddd must become ddd.nnn
        public static void main (String[] args) {

            TaskHelper helper = new TaskHelper();
            String strChar = helper.GetUserInput("Input ddd.nnn: ");

            int radixLoc = strChar.indexOf('.');

            int nnn = Integer.parseInt(strChar.substring(0,radixLoc));
            //System.out.println("nnn = " + nnn);

            int ddd = Integer.parseInt(strChar.substring(radixLoc + 1, strChar.length()));
            //System.out.println("ddd = " + ddd);

            System.out.println("ddd.nnn = " + ddd + "." + nnn);


        }
    }


