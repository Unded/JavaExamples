package concurrency.fork_join.recurs_task;

public class SumTaskDemo {
    public static void main(String[] args) {
        double[] data = new double[5000];

        for (int i = 0; i < data.length; i++) {
            //if i%2 == 0 (при делении на 2 остаток равен нулю)
            //then date[i] = i else date[i] = -i
            data[i] = (((i % 2) == 0) ? i : -i);
        }

        SumTask sumTask = new SumTask(data, 0, data.length);

        double sum = sumTask.invoke();

        System.out.println("Summ = " + sum );
    }
}
