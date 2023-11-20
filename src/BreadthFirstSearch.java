import java.util.*;


/**
 * ПОИСК В ШИРИНУ
 * */

public class BreadthFirstSearch {
    private static Map<String, List<String>> graph = new HashMap<>();
    public static boolean shortestPath(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

        //С помощью этого списка вы сможете отслеживать, каких людей вы искали раньше
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            if (searched.contains(person)) {
                if(personIsSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return false;
    }

    private static boolean personIsSeller(String name) {
        return name.endsWith("m");
    }

    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        System.out.println(shortestPath("you"));
    }
}
