class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }

    public static class Builder {
        private final String cpu;
        private final String ram;
        private String storage;
        private String graphicsCard;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// BuilderTest.java
class BuilderTest {
    public static void main(String[] args) {
        Computer basic = new Computer.Builder("Intel i3", "8GB").build();
        Computer gaming = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();

        System.out.println("Basic Computer:");
        basic.showSpecs();

        System.out.println("\nGaming Computer:");
        gaming.showSpecs();
    }
}
