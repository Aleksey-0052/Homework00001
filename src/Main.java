public class Main {
    public static void main(String[] args) {
        task1() ;
        task2() ;
        task3() ;
        task4() ;
        task5() ;
        task6() ;
        task7() ;
        task8() ;
    }
    public static void task1() {
        System.out.println ("Задача 1") ;
        var dog = 8.0 ;
        System.out.println (dog) ;
        var cat = 3.6 ;
        System.out.println (cat) ;
        var paper = 763789 ;
        System.out.println (paper) ;
    }
    public static void task2() {
        System.out.println ("Задача 2") ;
        var paper = 763789 ;
        paper = paper + 4 ;
        System.out.println (paper) ;
        var cat = 3.6 ;
        cat = cat + 4.0 ;
        System.out.println (cat) ;
        var dog = 8.0 ;
        dog = dog + 4.0 ;
        System.out.println (dog) ;
    }
    public static void task3() {
        System.out.println ("Задача 3") ;
        var paper = 763789 ;
        paper = paper - 7639 ;
        System.out.println (paper) ;
        var cat = 3.6 ;
        cat = cat - 1.6 ;
        System.out.println (cat) ;
        var dog = 8.0 ;
        dog = dog - 3.5 ;
        System.out.println (dog) ;
    }
    public static void task4() {
        System.out.println ("Задача 4") ;
        var friend = 19 ;
        System.out.println (friend) ;
        friend = friend + 2 ;
        System.out.println (friend) ;
        friend = friend / 7 ;
        System.out.println (friend) ;
    }

    public static void task5() {
        System.out.println ("Задача 5") ;
        var frog = 3.5 ;
        System.out.println (frog) ;
        frog = frog * 10 ;
        System.out.println (frog) ;
        frog = frog / 3.5 ;
        System.out.println (frog) ;
        frog = frog + 4.0 ;
        System.out.println (frog) ;
    }

    public static void task6() {
        System.out.println ("Задача 6") ;
        var boxer1Weight = 78.2 ;
        var boxer2Weight = 82.7 ;
        var boxersWeight = boxer1Weight + boxer2Weight ;
        System.out.println ("Общий вес боксеров " + boxersWeight + " кг") ;
    }

    public static void task7() {
        System.out.println ("Задача 7") ;
        var boxer1Weight = 78.2 ;
        var boxer2Weight = 82.7 ;

        var differenceWeight1 = boxer2Weight - boxer1Weight ;
        System.out.println ("Разница в весе боксеров " + differenceWeight1 + " кг") ;

        var differenceWeight2 = boxer2Weight % boxer1Weight ;
        System.out.println ("Разница в весе боксеров " + differenceWeight2 + " кг") ;
    }
    public static void task8() {
        System.out.println ("Задача 8") ;
        var employeesTime = 640 ;
        var employeeTime = 8 ;
        var employeesNumber = employeesTime / employeeTime ;
        System.out.println ("Всего работников в компании " + employeesNumber + " человек") ;

        var employeesNumber1 = employeesNumber + 94 ;
        var employeesTime1 = employeesNumber1 * employeeTime ;
        System.out.println ("Если в компании работает " + employeesNumber1 + " человек, то всего " + employeesTime1 + " часов работы может быть поделено между сотрудниками") ;
    }
}
