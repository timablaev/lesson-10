package nix_solutions;

public class Main {

    public static void main(String[] args) {

        final HouseBuilder builder = new HouseBuildImpl();
        final HouseBuildDirector houseBuildDirector = new HouseBuildDirector(builder);
        System.out.println(houseBuildDirector.construct());


    }

    public static class HouseBuildDirector {
        private final HouseBuilder builder;
        public HouseBuildDirector(final HouseBuilder builder) {
            this.builder = builder;
        }
        public House construct() {
            return builder.setWindows(8)
                            .setDoors(6)
                            .setColor("light-green")
                            .build();
        }

    }
}
