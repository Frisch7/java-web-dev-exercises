package exercises.technology;

public class Laptop extends Computer {
    private double screenSize;
    public Laptop(int memory, String processor, int storage, Double screenSize) {
        super(memory, processor, storage);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
                "Screen Size: " + getScreenSize() + "\n" +
                "Processor: " + getProcessor() + "\n" +
                "Memory: " + getMemory() + "\n" +
                "Storage: " + getStorage();
    }
}
