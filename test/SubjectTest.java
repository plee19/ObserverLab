import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectTest {
    Subject subject;

    @Before
    public void setUp() throws Exception {
        subject = new Subject();
        subject.setState(20);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getState() {
        assertEquals(20, subject.getState());
    }
}