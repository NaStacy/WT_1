package vt.epam;


public class Third {
    public static void main (String[] args) {
        System.out.println("Решить задачу.\n" +
                "3. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат \n" +
                "представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие\n" +
                "значения функции.\n" +
                "F(x) = tg(x).");
        int h;
        double a, b, y;
        System.out.print("Введите a: ");
        a = InputScan.scanDouble();
        System.out.print("Введите b: ");
        b = InputScan.scanDouble();
        System.out.print("Введите шаг: ");
        h = InputScan.scanInt();
        String result = " x            F(x)\n";
        System.out.println(result);

        for (double i = a; i<b; i=i+h) {
            y = Math.tan(i);
            String res = " x            tg(x)\n";
            System.out.print(i + "           ");
            System.out.println(y);
        }

    }
}
