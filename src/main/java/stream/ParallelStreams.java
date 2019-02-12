package stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ParallelStreams {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("aza");words.add("azamat");words.add("omar");words.add("ffffffffffff");

        //bad code
        int[] shortWords = new int[10];

        words.parallelStream().forEach(s -> {
            if (s.length()<10) shortWords[s.length()]++;
        });
        System.out.println(Arrays.toString(shortWords));

        //good code

        Map<Integer,Long> showWordCounts = words.parallelStream()
                .filter(s -> s.length()<10)
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));

        System.out.println(showWordCounts);


        Map<Integer,List<String>> result = words.parallelStream()
                .filter(s -> s.length()<10)
                .collect(Collectors.groupingByConcurrent(String::length));

        System.out.println(result.get(1));



        //example with Object
        User user1 = new User(1L,"ccc1",25,"ccc1@bk");
        User user2 = new User(2L,"ccc2",25,"ccc2@bk");
        User user3 = new User(3L,"ccc3",26,"ccc3@bk");
        User user4 = new User(4L,"ccc4",26,"ccc4@bk");

        List<User> userList = new LinkedList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);


        Map<Integer,List<User>> users = userList
                .stream()
                .parallel()
                .collect(Collectors.groupingBy(User::getAge));





    }
}
