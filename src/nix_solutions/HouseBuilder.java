package nix_solutions;

public interface HouseBuilder {
    House build();
    HouseBuilder setWindows(final int windows);
    HouseBuilder setDoors(final int doors);
    HouseBuilder setColor (final String color);

}
