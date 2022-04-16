package by.kursy.luschik.javastages.stage12.taskB2.modellogic;

public class Mirror {
    public static boolean isNumsInMirrorView(double... arrays) {
        for (int i = 0, k = arrays.length - 1; i < k; i++, k--) {
            if (arrays[i] != arrays[k]) {
                return false;
            }
        }
        return true;
    }
}
