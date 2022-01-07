package com.company;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static int result = 0;
    static String[] array = new String[3];

    public static void main(String[] args) {

        //Выводим в консоли текст: "Введи уравнение: "
        System.out.println("Введи уравнение: ");

        //Создаем строковый массив из 3 переменных и записываем в, только что созданные, переменные значения из введенной в консоли строки (переменные отделены друг от друга пробелом: " ")
        array = scan.nextLine().split(" ");

        //Выброс исключения, если в массиве не 3 переменные
        if (array.length != 3) {
            throw new InputMismatchException();
        }

        if (Objects.equals(array[0], "1") | Objects.equals(array[0], "2") | Objects.equals(array[0], "3") | Objects.equals(array[0], "4") | Objects.equals(array[0], "5") | Objects.equals(array[0], "6") | Objects.equals(array[0], "7") | Objects.equals(array[0], "8") | Objects.equals(array[0], "9") | Objects.equals(array[0], "10")) {
            funcArabic();
        } else if (Objects.equals(array[0], "I") | Objects.equals(array[0], "II") | Objects.equals(array[0], "III") | Objects.equals(array[0], "IV") | Objects.equals(array[0], "V") | Objects.equals(array[0], "VI") | Objects.equals(array[0], "VII") | Objects.equals(array[0], "VIII") | Objects.equals(array[0], "IX") | Objects.equals(array[0], "X")) {
            funcRom();
        }
    }

    public static void funcArabic () {
        //Преобразование строчных чисел в int
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[2]);

//        if (Objects.equals(array[3], "+") | Objects.equals(array[3], "-") | Objects.equals(array[3], "*") | Objects.equals(array[3], "/")) {
//            throw new InputMismatchException();
//        }

        if (num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {
            if (Objects.equals(array[1], "+")) {
                result = num1 + num2;
            } else if (Objects.equals(array[1], "-")) {
                result = num1 - num2;
            } else if (Objects.equals(array[1], "/")) {
                result = num1 / num2;
            } else if (Objects.equals(array[1], "*")) {
                result = num1 * num2;
            }
            System.out.println(result);
        }
    }

    public static void funcRom () {

        if (Objects.equals(array[2], "1") | Objects.equals(array[2], "2") | Objects.equals(array[2], "3") | Objects.equals(array[2], "4") | Objects.equals(array[2], "5") | Objects.equals(array[2], "6") | Objects.equals(array[2], "7") | Objects.equals(array[2], "8") | Objects.equals(array[2], "9") | Objects.equals(array[2], "10")) {
            throw new InputMismatchException();
        }

        String rom_num1;
        String rom_num2;
        rom_num1 = array[0];
        rom_num2 = array[2];
        int  []A = {1, 4, 5, 9, 10, 40, 50, 90, 100};
        String []R = {"I","IV","V","IX","X","XL","L","XC","C"};
        int num1 = 0, num2 = 0;
        String result2 = "";

        if (Objects.equals(rom_num1, "I")) {
            num1 = 1;
        } else if (Objects.equals(rom_num1, "II")) {
            num1 = 2;
        } else if (Objects.equals(rom_num1, "III")) {
            num1 = 3;
        } else if (Objects.equals(rom_num1, "IV")) {
            num1 = 4;
        } else if (Objects.equals(rom_num1, "V")) {
            num1 = 5;
        } else if (Objects.equals(rom_num1, "VI")) {
            num1 = 6;
        } else if (Objects.equals(rom_num1, "VII")) {
            num1 = 7;
        } else if (Objects.equals(rom_num1, "VIII")) {
            num1 = 8;
        } else if (Objects.equals(rom_num1, "IX")) {
            num1 = 9;
        } else if (Objects.equals(rom_num1, "X")) {
            num1 = 10;
        }

        if (Objects.equals(rom_num2, "I")) {
            num2 = 1;
        } else if (Objects.equals(rom_num2, "II")) {
            num2 = 2;
        } else if (Objects.equals(rom_num2, "III")) {
            num2 = 3;
        } else if (Objects.equals(rom_num2, "IV")) {
            num2 = 4;
        } else if (Objects.equals(rom_num2, "V")) {
            num2 = 5;
        } else if (Objects.equals(rom_num2, "VI")) {
            num2 = 6;
        } else if (Objects.equals(rom_num2, "VII")) {
            num2 = 7;
        } else if (Objects.equals(rom_num2, "VIII")) {
            num2 = 8;
        } else if (Objects.equals(rom_num2, "IX")) {
            num2 = 9;
        } else if (Objects.equals(rom_num2, "X")) {
            num2 = 10;
        }

        if (num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {
            if (Objects.equals(array[1], "+")) {
                result = num1 + num2;
            } else if (Objects.equals(array[1], "-")) {
                result = num1 - num2;
            } else if (Objects.equals(array[1], "/")) {
                result = num1 / num2;
            } else if (Objects.equals(array[1], "*")) {
                result = num1 * num2;
            }
        }

        //Выброс исключения, если ответ < 0
        if (result < 0) {
            throw new InputMismatchException();
        }

        int i = 8;
        String resultRom = "";
        while (result > 0) {
            while (A[i] > result) {
                i--;
            }
            resultRom += R[i];
            result -= A[i];
        }
        System.out.println(resultRom);
    }
}
