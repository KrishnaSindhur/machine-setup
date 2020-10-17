import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestDemo {

    @Test
    void sampleTest() {
        assertThat(1, (equalTo(1)));
    }
}
