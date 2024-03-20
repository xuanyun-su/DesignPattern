package Builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String screenSize;

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.screenSize = builder.screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }

    static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String storage;
        private String screenSize;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }


}
