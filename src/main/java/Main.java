import java.util.*;

public class Main {
    public static void main(String[] args) {

        //        Задание
        //
        //Пусть дан произвольный список целых чисел.
        //
        //1) Нужно удалить из него чётные числа
        //2) Найти минимальное значение
        //3) Найти максимальное значение
        //4) Найти среднее значение


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);

        // 1

        for (int value :
                list) {
            if (value % 2 == 0) {
                list_1.add(value);
            }
        }
        System.out.println(list_1);

        list.removeAll(list_1);

        System.out.println(list);


        // 2.1

        Optional<Integer> i = list.stream().min(Comparator.naturalOrder());
        System.out.println(i);

        // 2.2
//
        list.sort(Comparator.naturalOrder());
        Integer min = list.get(0);
        System.out.println(min);

        // 3

        list.sort(Comparator.reverseOrder());
        Integer max = list.get(0);
        System.out.println(max);

        // 4

        Iterator<Integer> iter_list = list.iterator();
        Float sum = (float) 0;
        while (iter_list.hasNext()){
            int item = iter_list.next();
            sum = sum + item;
        }
        System.out.println(sum);

        Float average = sum / list.size();

        System.out.println(average);
    }
}
