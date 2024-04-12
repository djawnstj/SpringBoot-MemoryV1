package memory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryFinderTest {

    @Test
    public void get() throws Exception {
        final MemoryFinder memoryFinder = new MemoryFinder();
        final Memory memory = memoryFinder.get();
        assertThat(memory).isNotNull();
    }
}
