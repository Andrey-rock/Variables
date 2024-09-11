public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763_789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 2
        System.out.println("");
        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 3
        System.out.println("");
        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 4
        System.out.println("");
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend +=2;
        System.out.println("friend = " + friend);
        friend /=7;
        System.out.println("friend = " + friend);

        // Задача 5
        System.out.println("");
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // Задача 6
        System.out.println("");
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Общая масса бойцов " + (weightBoxer1 + weightBoxer2));
        System.out.println("Разница в массе бойцов " + (weightBoxer2 - weightBoxer1));

        // Задача 7
        System.out.println("");
        System.out.println("Задача 7");
        var weightRemains = weightBoxer2 % weightBoxer1;
        System.out.println("Остаток " + weightRemains);

        // Задача 8
        System.out.println("");
        System.out.println("Задача 8");
        var jobTime = 640;
        var hours = 8;
        var countEmployees = jobTime / hours;
        System.out.println("Всего работников в компании — " + countEmployees + " человек");

        var newCountEmployees = countEmployees + 94;
        var newJobTime = hours * newCountEmployees;
        System.out.println("Если в компании работает " + newCountEmployees + " человек, то всего " + newJobTime +
                " часов работы может быть поделено между сотрудниками");
    }
}