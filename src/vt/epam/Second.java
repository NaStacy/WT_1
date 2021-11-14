package vt.epam;

public class Second {
    public static void main(String[] args) {
        System.out.println("Решить задачу.\n" +
                "2. Для данной области составить программу, которая печатает true, если точка с координатами  \n" +
                "(х,у) принадлежит закрашенной области, и false — в противном случае.");

        System.out.print("Enter x : ");
        int x = InputScan.scanInt();

        System.out.print("Enter y : ");
        int y = InputScan.scanInt();

        boolean d = (x <= 6) && (x >= -6) && (y >= -3) && (y <= 0) || (x <= 4) && (x >= -4) && (y >= 0) && (y <= 5);
        System.out.printf("Result : %s \n", d);
    }
}