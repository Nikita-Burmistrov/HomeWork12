package Ex2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(args.length);
        int arra[] = new int [50];
        int a = 0;
        for ( int d = 0; d < 100; d++){
            if (d % 2 == 0){
                arra[a] = d;
                a++;
            }
        }
        for (int d:arra){
            list1.add(Integer.valueOf(d));
        }
        System.out.println("Чётные числа " +list1);
        System.out.println("");
        int array[] = new int[100];
        List<Integer> list = new ArrayList<>(args.length);
        int l = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 1 == 0) {
                array[l] = i;
                l++;
            }
        }
        for (int i: array){
            list.add(Integer.valueOf(i));
        }
        System.out.println("Все числа "+list);
    }
}
