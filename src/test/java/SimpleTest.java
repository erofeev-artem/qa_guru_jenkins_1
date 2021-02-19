import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTest {

    @Test
    @Tag("positive")
    public void FirstTest() {
        assertThat(true, is(true));
    }

    @Test
    @Tag("negative")
    public void SecondTest() {
        assertThat(true, is(false));
    }
}
