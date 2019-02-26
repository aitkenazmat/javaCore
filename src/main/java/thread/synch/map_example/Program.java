package thread.synch.map_example;



import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        User user1 = new User(1l,"aza1",26);
        User user2 = new User(2l,"aza2",26);
        User user3 = new User(3l,"aza3",26);
        User user4 = new User(4l,"aza4",26);
        Map<Long,User> map = new HashMap<>();
        map.put(101L,user1);
        map.put(102L,user2);
        map.put(103L,user3);
        map.put(104L,user4);

        UserDAO userDAO = new UserDAO(map);

        new Thread(new MyThread(userDAO, 1L),"Thread-1").start();
        new Thread(new MyThread(userDAO, 2L),"Thread-2").start();
        new Thread(new MyThread(userDAO, 1L),"Thread-3").start();




    }
}
