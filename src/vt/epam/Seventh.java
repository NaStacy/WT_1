package vt.epam;

public class Seventh {
    public static void main(String[] args) {
        System.out.println("7. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по \n" +
                "возрастанию. Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . \n" +
                "Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится \n" +
                "перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.\n");
        int[] mass = new int[] { 1, 7, 4, 4, 2, 9, 10, 3 };
        shellSort(mass);
        System.out.print("Sorted array: ");
        for (int i = 0; i < mass.length; i++)
            System.out.print(" " + mass[i]);
    }

    private static void shellSort(int mass[])
    {
        int n = mass.length, i, j, step;
        int tmp;
        for (step = n / 2; step > 0; step /= 2)
            for (i = step; i < n; i++)
            {
                tmp = mass[i];
                for (j = i; j >= step; j -= step)
                {
                    if (tmp < mass[j - step])
                        mass[j] = mass[j - step];
                    else
                        break;
                }
                mass[j] = tmp;
            }
    }
}
