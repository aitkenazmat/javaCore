package thread.synch.map_example;

public class MyThread implements Runnable {

    private UserDAO userDAO;
    private Long id;

    public MyThread(UserDAO userDAO,Long id) {
        this.userDAO = userDAO;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            userDAO.update(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
