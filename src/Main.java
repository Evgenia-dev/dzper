public class Main {
    public Main(String speed) {
    }

    public static void main(String[] args) {
        //  task 1
        System.out.println("task 1");
        int age = 10;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен" + age + "то он совершеннолетний");
        } else {
            System.out.printf("Если возраст человека равен" + age + "то он не достиг совершеннолетия");
        }


        // task 2
        System.out.println("Task 2");
        int tem = 10;
        if (tem < 5) {
            System.out.printf("На улице" + tem + "градусов,  то нужно надеть шапку ");
        } else {
            System.out.printf("На улице" + tem + "градусов, то не нужно надеть шапку ");
        }


        // task 3
        System.out.println("Task 3");
        int speed = 100;
        if (speed > 60) {
            System.out.printf("Если скорость" + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ехать спокойно");
        }


        // task 4
        System.out.println("Task 4");
        age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека" + age + ", то ему нужно ходить  в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека" + age + ", то ему нужно ходить  в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека" + age + ", то ему нужно ходить  в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека" + age + ", то ему нужно ходить  на работу");
        }

        // task 5
        System.out.println("task 5");
        age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка" + age + ", то ему нельзя кататься на аттракционах");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка" + age + ", то ему можно в сопровождении кататься на аттракционах");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка" + age + ", то ему можно кататься на аттракционах");
        }

        // task 6
        int places = 102;
        int sitplaces = 60;
        int people = 80;
        if (people < sitplaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people >= sitplaces && people < places) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= sitplaces) {
            System.out.println("В вагоне нет мест");
        }
        // task 7
        System.out.println("task 7");
        int one = 10;
        int two = 5;
        int three = 30;
        if (one >= two && one >= three) {

            System.out.println("Максимальное число в переменной one, равно" + one);
        }else if (two >= three) {
            System.out.println("Максимальное число в переменной two, равно" + two);
        } else {
            System.out.println("Максимальное число в переменной three, равно" + three);
        }
    }

}
