package exercises.technology;

public class SmartPhone extends Computer{
    private String networkProvider;
    public SmartPhone(int memory, String processor, int storage, String networkProvider) {
        super(memory, processor, storage);
        this.networkProvider = networkProvider;
    }

    public String getNetworkProvider() {
        return networkProvider;
    }

    public void setNetworkProvider(String networkProvider) {
        this.networkProvider = networkProvider;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
                "Network Provider: " + getNetworkProvider() + "\n" +
                "Processor: " + getProcessor() + "\n" +
                "Memory: " + getMemory() + "\n" +
                "Storage: " + getStorage();
    }
}
