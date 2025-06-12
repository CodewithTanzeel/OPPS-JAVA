class Computer {
    String brand;
    int ramSizeGB;
    
    public Computer(String brand, int ramSizeGB) {
        this.brand = brand;
        this.ramSizeGB = ramSizeGB;
    }
}
class Processor {
    String model;
    double speedGHz;
    
    public Processor(String model, double speedGHz) {
        this.model = model;
        this.speedGHz = speedGHz;
    }
}
class MyComputer extends Computer {
    Processor processor;
    String operatingSystem;
    
    public MyComputer(String brand, int ramSizeGB, Processor processor, String os) {
        super(brand, ramSizeGB);
        this.processor = processor;
        this.operatingSystem = os;
    }
}
class YourComputer extends Computer {
    Processor processor;
    int storageGB;
    
    public YourComputer(String brand, int ramSizeGB, Processor processor, int storageGB) {
        super(brand, ramSizeGB);
        this.processor = processor;
        this.storageGB = storageGB;
    }
}
class ComputerComparison {
    public static void compareProcessors(MyComputer myPC, YourComputer yourPC) {
        System.out.println("\nProcessor Comparison:");
        System.out.println("My PC Processor: " + myPC.processor.model + " (" + myPC.processor.speedGHz + " GHz)");
        System.out.println("Your PC Processor: " + yourPC.processor.model + " (" + yourPC.processor.speedGHz + " GHz)");
        
        double speedDiff = Math.abs(myPC.processor.speedGHz - yourPC.processor.speedGHz);
        System.out.println("\nDifference: " + speedDiff + " GHz speed difference");
        
        if (!myPC.processor.model.equals(yourPC.processor.model)) {
            System.out.println("Different processor models");
        } else {
            System.out.println("Same processor model");
        }
    }
    public static void main(String[] args) {
        Processor intelProcessor = new Processor("Intel i5", 3.2);
        Processor amdProcessor = new Processor("AMD Ryzen 5", 3.6);
        MyComputer myComputer = new MyComputer("Dell", 16, intelProcessor, "Windows 10");
        YourComputer yourComputer = new YourComputer("HP", 8, amdProcessor, 512);
        compareProcessors(myComputer, yourComputer);
    }
}
