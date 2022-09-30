package thread;

public class Test {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        System.out.println(t1.isAlive());
        t1.run();
        System.out.println(ThreadOne.activeCount());
        }
}