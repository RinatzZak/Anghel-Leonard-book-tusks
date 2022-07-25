package chaper_two;
import com.rits.cloning.Cloner;

/**
 * Написать программу, которая иллюстрирует методы мелкого и глубокого клонирования.
 */

public class Task53 implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        Task53 task = new Task53(1, 2);
        Task53 ezClone = task.clone();
        ezClone.setX(10);
        Cloner cloner = new Cloner();
        Task53 deepClone = cloner.deepClone(task);

        System.out.println(task + "\n" + ezClone + "\n" + deepClone);
    }

    private int x;
    private int y;

    public Task53(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Task53 clone() throws CloneNotSupportedException {
        return (Task53) super.clone();
    }

    @Override
    public String toString() {
        return "task53{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
