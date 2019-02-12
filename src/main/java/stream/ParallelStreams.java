package stream;

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
    }
}
