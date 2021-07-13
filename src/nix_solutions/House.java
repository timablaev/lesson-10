package nix_solutions;

  class House {
    private int windows;
    private int doors;
    private String color;


      public House(){

      }


      public void setDoors(int doors) {
          this.doors = doors;
      }
      public void setWindows(int windows) {
          this.windows = windows;
      }

      public void setColor(String color) {
          this.color = color;
      }
    @Override
      public String toString(){
          return "House [windows = " + windows + ", + doors = " +  doors + ", + color = " + color+"]";
      }

}


