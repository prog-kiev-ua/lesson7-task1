package ua.kovalev;

public class DockService {
    private Ship[] ships;
    private Dock[] docks;

    public DockService() {
        super();
        docks = new Dock[2];
        docks[0] = new Dock(this, "Док 1");
        docks[1] = new Dock(this, "Док 2");
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        this.ships = ships;
    }

    public synchronized Ship getShip(){
        Ship ship = null;
        for (int i = 0; ships!=null && i < ships.length; i++) {
            if(ships[i] != null){
                ship = ships[i];
                ships[i] = null;
                break;
            }
        }
        return ship;
    }
}
