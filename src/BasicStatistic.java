
import java.util.List;

import reader.ReadFile;

public class BasicStatistic {
    private static final List<Integer> number = ReadFile.read();

    public static double meanCalc() {
        float sum = 0;
        float size = number.size();

        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        double res = sum / size;
        return res;
    }

    public static int modeCalc() {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < number.size(); ++i) {
            int count = 0;
            for (j = 0; j < number.size(); ++j) {
                if (number.get(j) == number.get(i))
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = number.get(i);
            }
        }
        return maxValue;
    }

    public static double medianCalc() {
        int size = number.size();
        double res = 0;

        if (size % 2 == 1) {
            res = number.get((size + 1) / 2 - 1);
        } else {
            res = (number.get(size / 2 - 1) + number.get(size / 2) / 2);
        }
        return res;
    }

}
