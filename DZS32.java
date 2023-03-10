//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
package S3;

import java.util.ArrayList;

public class DZS32 {
    public static void main(String[] args) {
        ArrayList<Integer> mixed= new ArrayList<Integer>();


        mixed.add(244);
        mixed.add(4123);
        mixed.add(23);
        mixed.add(22);
        mixed.add(3);
        mixed.add(2);

        System.out.println(mixed);

        for (int i=0;i<mixed.size();i++){
            int even=mixed.get(i)%2;
            if (even==0){
                System.out.println("This is Even Number:"+ mixed.get(i));
                mixed.remove(i);
                i--;
            }
        }

        System.out.println(mixed);
    }
}
