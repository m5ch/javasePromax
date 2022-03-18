package api.StringBuilder;

//定义方法接收任意整型数组，返回数组内容格式

public class Task1 {
    public static void main(String[] args) {
        int[] a1 = {11,22,33,44,5};
        System.out.println(append(a1));
        System.out.println("============");
        int[] a2 = null;
        System.out.println(append(a2));
        System.out.println("============");
        int[] a3 = {};
        System.out.println(append(a3));
    }

    public static String append(int[] a){
        if (a != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < a.length; i++) {
                sb.append(a[i]).append(i == a.length - 1 ? "" : ",");
            }
            sb.append("]");
            return sb.toString();
        }
        else
            return null;
    }
}
