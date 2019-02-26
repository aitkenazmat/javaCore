package thread.synch.map_example;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserDAO {

    private Map<Long,User> data;

    public UserDAO(Map<Long, User> data) {
        this.data = data;
    }

    public List<User> getUserList(){
        List<User> users = new LinkedList<>();
        for (Map.Entry entry : data.entrySet()) {
            users.add((User) entry.getValue());
        }
        return users;
    }


    public synchronized void update(Long id) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " started work" + " time " + new Date());

        User user = this.data.get(id);
        if (user!=null) {
            System.out.println(user.getId() + " was updated");
        } else {
            System.out.println(id + " not found data");
        }

        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName() + " finished work"+ " time " + new Date());


    }

    public void  delete(Long id) {
        User user = this.data.get(id);
        System.out.println(user.getId() + " was deleted");
    }
}
