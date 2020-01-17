package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void randomizerTest() {

        for (int i = 0; i < 1000; i++){
            int random = App.randomizer(3);
            assertTrue(random< 3);
            assertTrue(random> -1);
        }
    }
}
