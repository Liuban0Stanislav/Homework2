public class Main {
    public static void main(String[] args) {
        //Инициализировали все переменные из списка
        //Каждой переменной присвоили значение
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        //Переменные к задачам 6 и 7
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        task1((byte) dog, cat, paper);
        task2((byte) dog, cat, paper);
        task3((byte) dog, cat, paper);
        task4();
        task5();
        task6(boxer1, boxer2);
        task7(boxer1, boxer2);
        task8();

    }

    public static void task1 (byte dog, double cat, int paper) {
        System.out.println("Задача 1");

        //Значения всех переменных из списка вывели в консоль
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");
    }

    public static void task2 (byte dog, double cat, int paper) {
        //величина которую прибавляем к каждой переменной
        var four = 4;

        System.out.println("Задача 2");

        //Увеличиваем значение каждой перечисленной в прошлой задаче переменной на 4
        dog = (byte) (dog + four);
        cat = cat + four;
        paper = paper + four;

        //Вывод в консоль новые значения переменных
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");
    }

    public static void task3 (byte dog, double cat, int paper) {
        //величина на которую уменьшаем каждую переменную
        var decreaseDog = 3.5;
        var decreaseCat = 1.6;
        var decreasePaper = 7639;

        System.out.println("Задача 3");

        //Уменьшаем значение каждой перечисленной в прошлой задаче переменной
        dog = (byte) (dog - decreaseDog);
        cat = cat - decreaseCat;
        paper = paper - decreasePaper;

        //Вывод в консоль новые значения переменных
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("");
    }

    public static void task4 () {
        var friend = 19;

        System.out.println("Задача 4");

        System.out.println("переменная friend равна - " + friend);
        friend = friend + 2;
        System.out.println("переменную friend увеличиваем на 2 - " + friend);
        friend = friend / 7;
        System.out.println("переменную friend делим на 7 - " + friend);
        System.out.println("");
    }

    public static void task5 () {
        var frog = 3.5;

        System.out.println("Задача 5");

        System.out.println("переменная friend равна - " + frog);
        frog = frog * 10;
        System.out.println("переменную friend увеличиваем в 10 раз - " + frog);
        frog = frog / 3.5;
        System.out.println("переменную friend делим на 3.5 - " + frog);
        frog = frog + 4;
        System.out.println("переменную friend увеличиваем на 4 - " + frog);
        System.out.println("");
    }

    public static void task6 (double boxer1, double boxer2) {
//        var boxer1 = 78.2;
//        var boxer2 = 82.7;

        System.out.println("Задача 6");

        var summaWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов: " + summaWeight + " кг");
        var raznitsa = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов: " + raznitsa + " кг");
        System.out.println("");
    }

    public static void task7 (double boxer1, double boxer2) {
        System.out.println("Задача 7");

        var summaWeight = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов(метод1): " + summaWeight + " кг");
        var raznitsa = boxer2 % boxer1;
        System.out.println("Разница между весами бойцов(метод2): " + raznitsa + " кг");
        System.out.println("");
    }

    public static void task8 () {
        var hoursTotal = 640;
        var hoursForOne = 8;
        var increaseStuff = 94;

        System.out.println("Задача 8");

        var totalStuff = hoursTotal / hoursForOne;
        System.out.println("Всего работников в компании - " + totalStuff + " человек");

        var hoursTotalChange = hoursForOne * (totalStuff + increaseStuff);
        System.out.println("Если в компании работает " + (totalStuff + increaseStuff) + " человек, то всего " + hoursTotalChange +
                " часов работы может быть поделено между сотрудниками");
    }
}