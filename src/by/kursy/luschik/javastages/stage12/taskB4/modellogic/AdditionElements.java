package by.kursy.luschik.javastages.stage12.taskB4.modellogic;

public class AdditionElements {
    public static double SumOddNumsVector(double...arrays){
        double sum=0;
        for (double element: arrays) {
            if (element %2==0) {
                sum+=element;
            }
        }
        return sum;
    }

    public static double SumEvenNumsVector(double...arrays){
        double sum=0;
        for (double element: arrays) {
            if (element %2==1) {
                sum+=element;
            }
        }
        return sum;
    }
}
