public class Drum {
    public static void main(String[] args) {
        int money = 100;
        int bid = 10;
        int size = 7;
        int win = 100;

        System.out.println("У вас " + money + "$, ставка " + bid + "$");
        while (money >= bid) {
            int drum1 = (int) Math.round(Math.random() * 100);
            int firstCounter = drum1 % size;
            int drum2 = (int) Math.round(Math.random() * 100);
            int secondCounter = drum2 % size;
            int drum3 = (int) Math.round(Math.random() * 100);
            int thirdCounter = drum3 % size;
            System.out.println("Крутим барабаны! Розыгрыш принёс следующие результаты: ");
            System.out.println("Первый барабан - " + firstCounter + ", второй барабан - " + secondCounter +
                    ", третий барабан " + thirdCounter);

            if (firstCounter == secondCounter && secondCounter == thirdCounter) {
                money = money + win;
                System.out.printf("Выигрыш %s$! Ваш капитал теперь составляет: %s$%n", win, money);
            } else {
                money = money - bid;
                System.out.printf("Проигрыш %s$, ваш капитал теперь составляет: %s$%n", bid, money);
            }
        }
    }
}

