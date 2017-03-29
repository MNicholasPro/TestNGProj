/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/29.
 */
public class isBetweenq {
    public static boolean isBetween(int n, int lower, int upper) {
        if (lower <= n && n<= upper){
            return true;
        }else {
            return false;
        }
    }
}
