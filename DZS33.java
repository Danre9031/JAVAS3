//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
package S3;

import java.util.ArrayList;

public class DZS33 {
    public static void main(String[] args) {
        ArrayList<Integer> mixed= new ArrayList<Integer>();

        mixed.add(2);
        mixed.add(3);
        mixed.add(4);
        mixed.add(5);

        int min = 999999;
        int max = 0;
        double avg = 0;

        int leg= mixed.size();
        for (int i = 0; i < mixed.size(); i++) {

            if (max < mixed.get(i)) {
                max = mixed.get(i);
            }

            if (min > mixed.get(i)) {
                min=mixed.get(i);
            }

            avg+=mixed.get(i);

        }

        avg=(avg/leg);

        System.out.printf("Max = %d\n",max);
        System.out.printf("Min = %d\n",min);
        System.out.printf("AVG = %s\n",avg);
    }
}
