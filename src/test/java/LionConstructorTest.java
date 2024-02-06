import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionConstructorTest {
    String sex;
    boolean expectedHasMane;
    @Mock
    Feline feline;

    public LionConstructorTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Самец", true},
                {"Самка", false}
        });
    }
    @Test
    public void testHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}