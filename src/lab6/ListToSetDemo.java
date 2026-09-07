package lab6;

import java.util.*;

public class ListToSetDemo {
    public static void main(String[] args){
        Set<Integer> idList=new HashSet<>();
        idList.add(23); idList.add(25);

        // Using Iterator explicitly
        System.out.println(idList);

        Iterator<Integer> it = idList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Map<String, Double> groceriesList = new HashMap<>();
        groceriesList.put("Biscuits",19.5);
        groceriesList.put("Shampoo",145.0);
        groceriesList.put("Rice",1500.25);

        System.out.println("List size:" + groceriesList.size());
        System.out.println("Rice Price:" + groceriesList.get("Rice"));
        System.out.println("Keys:" + groceriesList.keySet());
        System.out.println("Values:" + groceriesList.values());
//
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10); queue.add(12); queue.add(35);
        System.out.println(queue.poll());
        System.out.println("Queue size:" + queue.size());

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.add("C");
        deque.addLast("B");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println("Deque size:" + deque.size());
    }
}
