package ua.kovalev;

public class Dock implements Runnable{
    private DockService dockService;
    private Thread thread;
    private String name;

    public Dock(DockService dockService, String name) {
        this.dockService = dockService;
        this.name = name;
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        while (true) {
            Ship ship = dockService.getShip();
            if(ship == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                while (true){
                    try {
                        System.out.println(name + ". Разгружаю " + ship.getName() + ": " + ship.unloadCargo());
                        Thread.sleep(500);
                    } catch (ShipIsEmptyException e) {
                        System.out.println(e.getMessage());
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
