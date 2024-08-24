public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        int [] expenses = {12541, 51298, 35242, 39481, 12493};
        int sum = 0;
        for (int i : expenses){
            sum += i;
        }
        System.out.printf("Сумма расходов за месяц составила %d рублей\n", sum);
    }
    public static void task2(){
        int [] expenses = {12541, 51298, 35242, 39481, 12493};
        int min =expenses[0];
        int max = expenses[0];
        for (int expens : expenses) {
            if (expens < min) {
                min = expens;
            }
        }
        for (int expens : expenses) {
            if (expens > max) {
                max = expens;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей\n", min, max);
    }
    public static void task3(){
        int [] expenses = {12541, 51298, 35242, 39481, 12493};
        int sum = 0;
        for (int i : expenses){
            sum += i;
        }
        float average = (float) sum /expenses.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);
    }
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char sym = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = sym;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}