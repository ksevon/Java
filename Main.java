import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваша задача угадать число");

        Integer RandomValue = CreateRandomValue(); // "Запекание" числа

        while (true){
            System.out.print("--->");
            Integer UserValue= scanner.nextInt(); // Получение числа
            if (UserValue == RandomValue){ // Совпадение
                System.out.println("Верно! " + RandomValue);
                RandomValue = CreateRandomValue();
            } else if (UserValue > RandomValue) {
                if (UserValue < (RandomValue + 15)){ // Границы
                    System.out.println("Загаданное близко но число меньше");
                } else {
                    System.out.println("Загаданное число меньше");
                }

            } else if (UserValue < RandomValue) {
                if (UserValue > (RandomValue - 15)){ // Границы
                    System.out.println("Загаданное близко но число больше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }
    }
    static int CreateRandomValue() { // Функция создания случаного числа
        Integer RandomValue = (int) (Math.random() * 100); // Случаное целочисленное значение от 0 до 100
        return RandomValue;
    }
}