package com.c;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
/**
 * @author Mazhey Polina
 * @since JDK 15.0.2
 * @serialData
 * @version
 */
public class Main {

    public static void main(String[] args) {
        double a, b, c;
        double D;
        System.out.println("Программа решает квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
        System.out.println("\n");
        Calendar temp = Calendar.getInstance();
        temp.set(2021, 2, 13, 15, 00);
        Date dateOfDelivery = new Date();
        Date dateOfReceiving = temp.getTime();
        System.out.println("Developer surname and name: Mazhey Polina\n" +
                "Date of delivery: " + dateOfReceiving.toString() +
                "\nDate of receipt of the task: " + dateOfDelivery.toString()
        );
    };
}

