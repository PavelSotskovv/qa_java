
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionFuncTest {
    @Mock
    private Predator predator;
    @Test
    public void getKittens() throws Exception {
        when(predator.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", predator);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка", predator);
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test(expected = Exception.class)
    public void testConstructorWithInvalidSex() throws Exception {
        try {
            new Lion("UnknownSex", predator);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            throw e;
        }
    }
}