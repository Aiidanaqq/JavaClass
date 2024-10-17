public class Computer {

    private String brand;
    private String model;
    private String processor;
    private int RAM;

    public Computer() {
    }

    public Computer(String brand, String model, String processor, int RAM) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.RAM = RAM;
    }

    public void displayInfo() {
        if ((brand != null && !brand.isEmpty()) || 
            (model != null && !model.isEmpty()) || 
            (processor != null && !processor.isEmpty()) || 
            RAM > 0) {
            
            System.out.println("------------------------------------------------");
            System.out.println("Computer Details:");

            if (brand != null && !brand.isEmpty()) {
                System.out.println("Brand      : " + brand);
            }

            if (model != null && !model.isEmpty()) {
                System.out.println("Model      : " + model);
            }

            if (processor != null && !processor.isEmpty()) {
                System.out.println("Processor  : " + processor);
            }

            if (RAM > 0) {
                System.out.println("RAM        : " + RAM + " GB");
            }

            System.out.println(" ");
        }
    }

    public void upgradeRAM(int additionalRAM) {
        if (additionalRAM > 0) {
            this.RAM += additionalRAM;
            System.out.println("RAM has been successfully upgraded by " + additionalRAM + " GB.");
            System.out.println("New Total RAM: " + this.RAM + " GB.");
        } else {
            System.out.println("Invalid RAM value. Upgrade failed.");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Computer defaultComputer = new Computer();
        defaultComputer.displayInfo();

        Computer gamingComputer = new Computer("Alienware", "M15", "Intel Core i7", 16);
        gamingComputer.displayInfo();

        gamingComputer.upgradeRAM(16);
        gamingComputer.displayInfo();

        Computer workComputer = new Computer("HP", "Envy", "AMD Ryzen 5", 8);
        workComputer.displayInfo();
    }
}
