import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число ");
        //Проверяем число (натуральное или нет)
        if (scanner.hasNextInt()) {
            a = scanner.nextInt(); //если а -натуральное число
            System.out.println("Делителями числа  - " + a + " являются");
            for (int i = a; i > 0; i--) {
                int b=a%i;
                if(b==0)
                    System.out.println(i+" ");
            }
        } else {
            System.out.println("Ошибка! Введено не натуральное число!");
        }
    }


}


