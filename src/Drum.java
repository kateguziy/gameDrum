public class Drum {
    public static void main(String[] args) {
        int money = 100;
        int bid = 10;
        int size = 7;

        int one = 1;
        int two = 1;
        int three = 1;


        System.out.println("У вас " + money + "$, ставка " + bid + "$");
        while (money > 9) {
            int drum1 = (int) Math.round(Math.random() * 100);
            int firstCounter = drum1 % size;
            int drum2 = (int) Math.round(Math.random() * 100);
            int secondCounter = drum2 % size;
            int drum3 = (int) Math.round(Math.random() * 100);
            int thirdCounter = drum3 % size;

            System.out.println("Крутим барабаны! Розыгрыш принёс следующие результаты: ");
            System.out.println("Первый барабан - " + firstCounter + ", второй барабан - " + secondCounter +
                    ", третий барабан " + thirdCounter);
            if (one == firstCounter && two == secondCounter && three == thirdCounter) {
                money = money + 100;
                System.out.println("Выигрыш 100$! Ваш капитал теперь составляет: " + money + "$");
            } else {
                money = money - bid;
                System.out.println("Проигрыш 10$, ваш капитал теперь составляет: " + money);
            }
        }
    }
}

