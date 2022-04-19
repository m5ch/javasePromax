package genercity.function;

/**
 * @ Classname demo
 * @ Description TODO
 * @ Date 2022/4/19 15:45
 * @ Created by 落尘
 */
public class demo {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4};
        printArray(list);

    }

    public static <T> void printArray(T[] arr){
        if (arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0;i<arr.length;i++) {
                sb.append(i == arr.length -1 ? arr[i] : arr[i]+",");
            }
            sb.append("]");
            System.out.println(sb);
        }
        else
            System.out.println(arr);
    }
}
