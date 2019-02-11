package stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectIterate {
    public static void main(String[] args) {

        User user1= new User(110L,"aza",26,"aza@statdata.kz");
        User user2= new User(111L,"ara",26,"ara@statdata.kz");
        User user3= new User(112L,"mura",25,"mura@statdata.kz");
        User user4= new User(113L,"zhora",27,"zhora@statdata.kz");
        User user5= new User(114L,"beka",26,"beka@statdata.kz");

        List<User> users = new LinkedList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        //итераторы
        users.stream().forEach(u->{
            System.out.println(u.getName());
        });

        System.out.println("-------------------");

        users.stream().forEachOrdered(user -> {
            System.out.println(user.getName());
        });

        System.out.println("-------------------");
        //переоброзование список множества карта итд
        List<User> list = users.stream().collect(Collectors.toList());
        Set<User> set = users.stream().collect(Collectors.toSet());
        TreeSet<User> treeSet = users.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("-------------------");

        Map<Long,String> map = users.stream().collect(Collectors.toMap(User::getId,User::getName));
        System.out.println(map.get(111L));

        System.out.println("-------------------------");

        //group by
        List<User> userList =  users.stream().collect(Collectors.groupingBy(User::getAge)).get(28);
        if (userList!= null && !userList.isEmpty()) {
            userList.stream().forEach(user -> {
                if (user!=null)
                    System.out.println(user.getName());
            });
        }
        System.out.println("-------------------------");
        Set<User> userList1 =  users.stream().collect(Collectors.groupingBy(User::getAge, Collectors.toSet())).get(26);
        userList1.stream().forEach(user -> {
            System.out.println(user.getName());
        });

        System.out.println("-----------------------------");
        Map<Integer,Long> map1 =  users.stream().collect(Collectors.groupingBy(User::getAge, Collectors.counting()));
        System.out.println(map1.get(25));
        System.out.println();
        Map<Integer,Integer> map2 = users.stream().collect(Collectors.groupingBy(User::getAge, Collectors.summingInt(User::getAge)));
        System.out.println(map1.get(26));


    }
}
