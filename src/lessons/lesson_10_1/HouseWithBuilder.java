package lessons.lesson_10_1;

public class HouseWithBuilder {
    private String color = "White";
    private String topRoof = "Red";
    private int windows = 4;
    private int mainDoors = 1;

    protected HouseWithBuilder(Builder builder){
        this.color = builder.color;;
        this.topRoof = builder.topRoof;
        this.windows = builder.windows;
        this.mainDoors = builder.mainDoors;
    }

    public String getColor() {
        return color;
    }

    public String getTopRoof() {
        return topRoof;
    }

    public int getWindows() {
        return windows;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "color='" + color + '\'' +
                ", topRoof='" + topRoof + '\'' +
                ", windows=" + windows +
                ", mainDoors=" + mainDoors +
                '}';
    }

    public static class Builder{
        private String color = "White";
        private String topRoof = "Red";
        private int windows = 4;
        private int mainDoors = 1;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setTopRoof(String topRoof) {
            this.topRoof = topRoof;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }
}
