package homework;

public class Hw {
    public static void Task1(){
        System.out.println("Task 1 :");

        for(int i = 0; i < 11; i++){
            System.out.println("Итерация: " + i);
        }

        System.out.println("");
    }
    public static void Task2(){
        System.out.println("Task 2 :");

        for(int i = 10; i > 0; i--){
            System.out.println("Итерация: " + i);
        }

        System.out.println("");
    }
    public static void Task3(){
        System.out.println("Task 3 :");

        for(int i = 0; i < 18; i++){
            if(i % 2 == 0){
                System.out.println("Четное число - " + i);
            }
        }

        System.out.println("");
    }
    public static void Task4(){
        System.out.println("Task 4 :");

        for(int i = 10; i > -11; i--){
            System.out.println("Итерация: " + i);
        }

        System.out.println("");
    }
    public static void Task5(){
        System.out.println("Task 5 :");

        for(int i = 1904; i < 2097; i++){
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " - год является високосным");
            }
        }

        System.out.println("");
    }
    public static void Task6(){
        System.out.println("Task 6 :");

        for(int i = 7; i < 99; i = i + 7){
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
    }
    public static void Task7(){
        System.out.println("Task 7 :");

        for(int i  = 1; i < 513; i = i * 2){
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
    }
    public static void Task8(){
        System.out.println("Task 8 :");

        var monthly = 29000;
        var total = 0;

        for(int i = 1; i < 13; i++){
            total = total + monthly;
            System.out.println("Месяц - " + i + ", сумма накоплений равна: " + total +" Руб.");
        }

        System.out.println("");
    }
    public static void Task9(){
        System.out.println("Task 9 :");

        var monthly = 29000;
        var total = 0;

        for(int i = 1; i < 13; i++){
            total = total + monthly;
            total = (int) (total + total*0.01);
            System.out.println("Месяц - " + i + ", сумма накоплений равна: " + total + " Руб.");
        }

        System.out.println("");
    }
    public static void Task10(){
        System.out.println("Task 10 :");

        for(int i = 1; i < 11; i++){
            System.out.println("2*" + i + "=" + 2 * i);
        }

        System.out.println("");
    }
}
