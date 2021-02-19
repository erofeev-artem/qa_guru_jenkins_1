import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTest {

    @Test
    public void FirstTest() {
        assertThat(true, is(true));
    }
}
