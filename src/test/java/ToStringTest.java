import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ToStringTest {
    private Theater createTheater1() {
        Theater nt = new Theater(3, 2, 3);
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if ((r+c) % 2 != 0)
                    nt.assignSeat(r, c);
            }
        }
        return nt;
    }

    private Theater createTheater2() {
        Theater nt = new Theater(4, 4, 0);
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if ((r+c) % 2 == 0)
                    nt.assignSeat(r, c);
            }
        }
        return nt;
    }
    
    @DisplayName("toString Test 1")
    @Test
    void toString_Test01() {
        String expected = "";
        expected += "1 O X O\n";
        expected += "1 X O X\n";
        expected += "2 O X O\n";
        expected += "2 X O X\n";
        expected += "2 O X O\n";
        Theater tr = createTheater1();
        String result = tr.toString();
        assertEquals(expected, result);
    }
   
    @DisplayName("toString Test 2")
    @Test
    void toString_Test02() {
        String expected = "";
        expected += "1 X O X O\n";
        expected += "1 O X O X\n";
        expected += "1 X O X O\n";
        expected += "1 O X O X\n";

        Theater tr = createTheater2();
        String result = tr.toString();
        assertEquals(expected, result);
    }
}
