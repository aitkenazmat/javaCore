package classloader;

public class ClassLoader {
    public static void main(String[] args) {
        java.lang.ClassLoader classLoader = A.class.getClassLoader();

        java.lang.ClassLoader parent = classLoader.getParent();
        System.out.println(parent.getClass().getName());
        System.out.println(classLoader.toString());

    }
}
