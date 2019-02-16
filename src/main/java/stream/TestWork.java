package stream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestWork {

    public static void main(String[] args) {
        User user1 = new User(1l,"name1",11,"email@1");
        User user6 = new User(1l,"name1",11,"email@1");
        User user2 = new User(2l,"name2",12,"email@2");
        User user3 = new User(3l,"name3",66,"email@3");
        User user4 = new User(4l,"name4",15,"email@4");
        User user5 = new User(5l,"name5",25,"email@5");

        List<User> userList = new LinkedList<>();
        userList.add(user5);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user1);
        userList.add(user6);

        //count
        long userCount = userList.stream().filter(user -> user.getAge()<25).count();
        System.out.println("userCount = " + userCount);






    }
}
