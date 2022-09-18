import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] payments = generateRandomArray();

        System.out.println("Задача 1");
        int[] cost = new int[30];
        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + "  рублей");

        System.out.println("Задача 2");

         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for (int payment : payments) {
            if (payment > max) {
              max = payment;
           }
            if (payment < min) {
                  min = payment;
             }
          }
         System.out.println("«Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей».");

         System.out.println("Задача 3");
         double averageSpending = (double) sum / payments.length;//средние траты
         System.out.println("Средняя сумма трат за месяц составила "+averageSpending+" рублей" );

         System.out.println("Задача 4");
         char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
         for (int u = reverseFullName.length - 1; u >= 0; u--){
             System.out.print(reverseFullName[u]);
         }
      }
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }

            return arr;//возращаться

        }

}

