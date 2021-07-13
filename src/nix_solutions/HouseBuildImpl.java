package nix_solutions;

public class HouseBuildImpl implements HouseBuilder{


    House house = new House();

    @Override
    public House build() {
       return house;
    }

    @Override
    public HouseBuilder setWindows(int windows) {
        house.setWindows(windows);
        return this;
    }

    @Override
    public HouseBuilder setDoors(int doors) {
        house.setDoors(doors);
        return this;
    }

    @Override
    public HouseBuilder setColor(String color) {
        house.setColor(color);
    return this;
    }
}
