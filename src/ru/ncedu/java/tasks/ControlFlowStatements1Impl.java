package ru.ncedu.java.tasks;

/**
 * Created by i.ruzhentsev on 13.07.2017.
 */
public class ControlFlowStatements1Impl implements ControlFlowStatements1 {
    public ControlFlowStatements1Impl(){}

    public static void main(String[] args) {
    ControlFlowStatements1 obj = new ControlFlowStatements1Impl();
        System.out.println(obj.decodeWeekday(4));
        System.out.println(obj.getFunctionValue(0f));
        System.out.println(obj.calculateBankDeposit(12.5));
    }

    @Override
    public float getFunctionValue(float x) {

        float f;
        if (x > 0) {
            f = 2 * (float)Math.sin(x);
        } else {
            f = 6f - x;
        }
        return f;
    }

    @Override
    public String decodeWeekday(int weekday) {
        String s = null;
        switch (weekday) {
            case 1:
                s = "Monday";
                break;
            case 2:
                s = "Tuesday";
                break;
            case 3:
                s = "Wednesday";
                break;
            case 4:
                s = "Thursday";
                break;
            case 5:
                s = "Friday";
                break;
            case 6:
                s = "Saturday";
                break;
            case 7:
                s = "Sunday";
                break;
        }
        return s;
    }

    @Override
    public int[][] initArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = i*j;
            }
        }
        return array;
    }

    @Override
    public int getMinValue(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    @Override
    public BankDeposit calculateBankDeposit(double P) {
        BankDeposit obj = new BankDeposit();
        double sum = 1000;
        int i = 0;
        while (sum <= 5000) {
            sum += sum * P/100;
            i++;
        }
        obj.amount = sum;
        obj.years = i;
        return obj;
    }
}
