package by.kursy.luschik.javastages.stage12.taskA2.modellogic;

import by.kursy.luschik.javastages.stage12.util.Convertor;

public class Change {
    public static String changeOfPlacesExtremeValues(double... arrays) {
        double min = arrays[0];
        double max = arrays[0];
        int indexMinValue=0;
        int indexMaxValue=0;

        for (int i = 0; i < arrays.length; i++) {
            if (min > arrays[i]) {
                min = arrays[i];
                indexMinValue = i;
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            if (max < arrays[i]) {
                min = arrays[i];
                indexMaxValue = i;
            }
        }

        double temp = arrays[indexMaxValue];
        arrays[indexMaxValue]=arrays[indexMinValue];
        arrays[indexMinValue]=temp;

        return Convertor.convert(arrays);
    }
}
