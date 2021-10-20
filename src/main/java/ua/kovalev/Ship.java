package ua.kovalev;

public class Ship {
    private Cargo array [];
    private int curIndex;
    private String name;

    public Ship() {
        super();
    }

    public Ship(String name) {
        super();
        this.name = name;
        this.array = new Cargo[] {
                new Cargo("Контейнер 1"),
                new Cargo("Контейнер 2"),
                new Cargo("Контейнер 3"),
                new Cargo("Контейнер 4"),
                new Cargo("Контейнер 5"),
                new Cargo("Контейнер 6"),
                new Cargo("Контейнер 7"),
                new Cargo("Контейнер 8"),
                new Cargo("Контейнер 9"),
                new Cargo("Контейнер 10")
        };
    }

    public Cargo unloadCargo() throws ShipIsEmptyException{
        if(curIndex>=array.length){
            throw new ShipIsEmptyException(String.format("[%s] уже полностью разгружен", name));
        }
        return array[curIndex++];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
