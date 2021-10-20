package ua.kovalev;

public class Main {
    public static void main(String[] args) {
        DockService dockService = new DockService();
        Ship ship1 = new Ship("Корабль 1");
        Ship ship2 = new Ship("Корабль 2");
        Ship ship3 = new Ship("Корабль 3");
        dockService.setShips(new Ship[] {ship1, ship2, ship3});
    }
}
