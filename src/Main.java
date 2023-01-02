public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int p = 12;
        if (p % 2 == 0 && p != 0) {
            System.out.println("Число " + p + " чётное");
        } else{
            System.out.println("Число  " + p + " нечётное");
            }
    }


    private static void task2() {
        System.out.println("Задача 2");
        double p = 7.3;
        double d = 11.13;
        if (Math.abs(p - 10) > Math.abs(d - 10)) {
            System.out.println(d);
        } else {
            System.out.println(p);
        }
    }


    private static void task3() {
        System.out.println("Задача 3");
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(156) + 3;
        if (number <= 99 && number >= 22) {
            System.out.println("Число " + number + " попало в диапазон");
        } else {
            System.out.println("Число " + number + " не попало в диапазон");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(900) + 100;
        int a = number / 100;
        int b = (number - a* 100) / 10;
        int c = (number - a*100 - b*10);
        System.out.println(number + " " + a + " " + b + " " + c);
        if (a >= b) {
            if (a >= c) {
                System.out.println("Наибольший член " + a);
            } else {
                System.out.println("Наибольший член " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("Наибольший член " + b);
            } else {
                System.out.println("Наибольший член " + c);
            }
        }

    }

    private static void task5() {
        System.out.println("Задача 5");
        int a = -100;
        int b = 200;
        int c = 0;
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(c + " " + b + " " + a);
                } else {
                    System.out.println(b+ " " + c+ " " + a);
                }
            } else {
                System.out.println(b + " " + a + " " + c);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(c+ " " + a+ " " + b);
                } else {
                    System.out.println(a+ " " + c+ " " + b);
                }
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }

    }

    private static void task6() {
        System.out.println("Задача 6");
        java.util.Random random = new java.util.Random();
        int secondsToGo = random.nextInt(28801);
        System.out.println(secondsToGo);
        int minToGo = secondsToGo / 60;
        int hourToGo = minToGo / 60;
        System.out.println(hourToGo);

    }

}
