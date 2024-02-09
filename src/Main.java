import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Коллекции
        // Collections - класс
        // Collection - интерфейс

        // List - интерфейс
       // List-ы (Списки) => ArrayList, LinkedList, Queue, Stack, Vector


        int[] x = new int[5]; // 0 0 0 0 0
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();
        arrayList.add(0);
        arrayList.add("New");
        arrayList.add(new Object());

   //     int p = (int)arrayList.get(1);

       // System.out.println();
        ArrayList<String> names = new ArrayList<>();
        names.add("Olga");
        names.add("Maria");
        names.add("Alex");


        ArrayList<Integer> arrayList1 = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList1.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add to the begin:  "+(end-start));

        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList1.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the begin: "+(end-start));

        start = System.nanoTime();
        for(int i=30000;i<60000;i++) {
            arrayList1.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get from the middle: "+(end-start));

        start = System.nanoTime();
        for(int i=30000;i<60000;i++) {
            linkedList1.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get from the middle: "+(end-start));


        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList1.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add to the end:  "+(end-start));

        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList1.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the end: "+(end-start));

        // Queue
        // FIFO - First In - First Out
        // Stack
        // LIFO - Last In - First Out
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>(); // классическая очередь
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // кладем в стек
            queue.offer(s); // кладем в очередь
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
            // удаляем с конца (сверху) и печатем значение
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
            // удаляем сначала и печатаем
        }

        int intArr[] = {30,20,5,12,16};
        // 5 12 16 20 30

        Arrays.sort(intArr);
        System.out.println(Arrays.binarySearch(intArr,15));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList,3,4,6,32,12,41234);

        Collections.sort(integerArrayList);
       // Collections.binarySearch()

        class City implements Comparable<City>{
            private String name;
            private int popul;

            public City(String name, int popul) {
                this.name = name;
                this.popul = popul;
            }

            @Override
            public int compareTo(City o) {
                //return this.popul-o.popul;
                return this.name.compareTo(o.name);
            }
        }
        Comparator<City> sort_by = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.popul-o2.popul;
            }
        };

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Moscow",20342324));
        cities.add(new City("Berlin",3342342));
        cities.add(new City("Paris",2293340));
        cities.add(new City("Amsterdam",820343));

        Collections.sort(cities,sort_by);


    }
}