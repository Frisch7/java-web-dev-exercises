package exercises.technology;

public class Computer {
    private int memory;
    private String processor;
    private int storage;
    private int id;
    private static int nextId = 1;

    public Computer(Integer memory, String processor, Integer storage){
        this.memory = memory;
        this.processor = processor;
        this.storage = storage;
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }
}
