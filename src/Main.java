public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15_599;
        int oneMiles = 20;
        int bonusMiles = ticketPrice / oneMiles;
        System.out.println("Стоимость билета:" + ticketPrice);
        System.out.println("Колличсетво бонусов:" + bonusMiles);

    }
}