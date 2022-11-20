//ввод и сумма элементов массива друг с другом

import java.util.Scanner; //подключаем библиотеку ввода с консоли

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Подключаем ввод с консоли

        int[] array = new int[5]; //вводим массив array состоящий из 5 чисел
        System.out.println("Введите первое число"); //Выводим надпись "Введите первое число"
        array[0] = sc.nextInt(); //первому элементу массива присваиваем значение первого числа, введенного в консоль
        System.out.println("Введите второе число");//Выводим надпись "Введите второе число"
        array[1] = sc.nextInt();//второму элементу массива присваиваем значение второго числа, введенного в консоль
        System.out.println("Введите третье число");//Выводим надпись "Введите третье число"
        array[2] = sc.nextInt();//третьему элементу массива присваиваем значение третьего числа, введенного в консоль
        System.out.println("Введите четвертое число");//Выводим надпись "Введите четвертое число"
        array[3] = sc.nextInt();//четвертому элементу массива присваиваем значение четвертого числа, введенного в консоль
        System.out.println("Введите пятое число");//Выводим надпись "Введите пятое число"
        array[4] = sc.nextInt();//пятому элементу массива присваиваем значение пятого числа, введенного в консоль

        int sum = 0; //вводим переменную sum, которая будет подсчитывать значения элементов массива
        for (int i : array) { //вводим цикл foreach, который будет рассчитывать значения элементов массива
            sum = i + sum; //sum равна sum и значению i-ого элемента массива
            System.out.println("Сумма нынешнего и предыдущего равна" + sum); //вывод на экран значения текущего и предыдушего значений
        }
        System.out.println("Сумма всего" + sum); //Вывод на экран итоговой суммы
    }
}