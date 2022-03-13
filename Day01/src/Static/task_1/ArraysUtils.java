package Static.task_1;

public class ArraysUtils {
    /*
    私有构造器
     */
    private ArraysUtils(){

    }

    //1.
    public static String tosString(int[] st){
        if (st == null)
            return null;
        String s = "[";
        for (int i = 0; i < st.length; i++) {
            s += (i == st.length - 1 ? st[i] : st[i] + ",");
        }
        s += "]";
        return s;
    }

    //2.平均分
    public static double getAverage(double[] st){
        double sum = 0;
        double average;
        double max = st[0];
        double min = st[0];
        for (int i = 0; i < st.length; i++) {
            if (st[i] > max )
                max = st[i];
            if (st[i] < min)
                min = st[i];
            sum += st[i];
        }
        average = (sum - max - min) / (st.length - 2);
        return average;
    }
}
