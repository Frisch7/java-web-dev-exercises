package exercises.technology.Test;
import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LaptopTest {

    Laptop laptop;
    @Before
    public void CreateNewLaptop() {
        laptop = new Laptop(2048, "Intel i7", 200000, 17.5);
    }
    @Test
    public void testProcessor(){
        assertEquals("Intel i7", laptop.getProcessor());
    }
    @Test
    public void testmemory(){
        assertEquals(2048, laptop.getMemory(), .001);
    }
    @Test
    public void testStorage(){
        assertEquals(200000, laptop.getStorage(), .001);
    }

}
