import java.util.*;

public class Main {
    public static void main(String[] args) {
        String Cloth;
        Map<String, String> map = new HashMap<>();
        map.put("human", "set");
        map.put("human1", "set");
        System.out.println(map);


        Human human = new Human("Виктор", 25);
        Human human1 = new Human("Мария", 35);
        Set<String> set = new HashSet<>();

        set.add("Пальто");
        set.add("Брюки");


        Map<Human, Set<String>> map1 = new HashMap<>();
        map1.put(human, set);
        map1.put(human1, set);
        map1.put(human, new HashSet<String>(Arrays.asList("gjhgkk", "hjgk")));
        System.out.println(map1);

        // Двумерный массив превратить в одномерный список
        Random random = new Random();


        int[][] array = new int[10][8];
        //List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(10);
                //   list.add(array[i][j]);
            }
        }
        //List <Integer> list = new ArrayList<>();
        //System.out.println(list);
        // }

        System.out.println(func2(array));
        Map<String, String> map8 = new HashMap<>();
        map8.put("human", "set");
        System.out.println(map8.keySet());
        System.out.println(map8.values());
    }
    // метод из двумерного массива двумерный список
    public static List<List<Integer>> func2 ( int[][] array){
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            List<Integer> sublist = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                sublist.add(array[i][j]);
            }

            list.add(sublist);
        }
        return list;
    }
// из массива сделать список и вывести только уникальные значения

}

