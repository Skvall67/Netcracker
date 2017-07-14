package ru.ncedu.java.tasks;

/**
 * Created by i.ruzhentsev on 13.07.2017.
 */
public class ControlFlowStatements3Impl implements ControlFlowStatements3 {
    public ControlFlowStatements3Impl(){}

    public static void main(String[] args) {
        ControlFlowStatements3 object = new ControlFlowStatements3Impl();
        System.out.println(object.decodeSeason(2));
    }
    @Override
    public double getFunctionValue(double x) {
        double f;
        if (x <= 0) {
            f = -x;
        } else if (x >= 2) {
            f = 4;
        } else {
            f = x * x;
        }
        return f;
    }

    @Override
    public String decodeSeason(int monthNumber) {
        String str;
        switch (monthNumber) {
            case 1:
                str = "Winter";
                break;
            case 2:
                str = "Winter";
                break;
            case 3:
                str = "Spring";
                break;
            case 4:
                str = "Spring";
                break;
            case 5:
                str = "Spring";
                break;
            case 6:
                str = "Summer";
                break;
            case 7:
                str = "Summer";
                break;
            case 8:
                str = "Summer";
                break;
            case 9:
                str = "Autumn";
                break;
            case 10:
                str = "Autumn";
                break;
            case 11:
                str = "Autumn";
                break;
            case 12:
                str = "Winter";
                break;
            default:
                str = "Error";
                break;
        }
        return str;
    }

    @Override
    public long[][] initArray() {
        long[][] array = new long[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (long)Math.pow(Math.abs(i - j), 5);
            }
        }
        return array;
    }

    @Override
    public int getMaxProductIndex(long[][] array) {
        int iMax = 0;
        long sum, max = -1;
        for (int i = 0; i < array.length; i++) {
            sum = 1;
            for (int j = 0; j < array[i].length; j++) {
                sum *= array[i][j];
            }
            if (Math.abs(sum) > max) {
                max = Math.abs(sum);
                iMax = i;
            }
        }
        return iMax;
    }

    @Override
    public float calculateLineSegment(float A, float B) {
        do {
            A = A - B;
        } while (A >= 0);
        A = A + B;
        return A;
    }
}
