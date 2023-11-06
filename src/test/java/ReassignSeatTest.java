import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReassignSeatTest {
    private Theater createTheater() {
        Theater nt = new Theater(5, 2, 3);
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if ((r+c) % 2 != 0)
                    nt.assignSeat(r, c);
            }
        }
        return nt;
        /** If toString was called on this Theater object the array would
         * look like:
         * 1 O X O X O
         * 1 X O X O X
         * 2 O X O X O
         * 2 X O X O X
         * 2 O X O X O
         */
    }

    @DisplayName("reassignSeat Test 1")
    @Test
    void reassignSeat_Test01() {
        Theater tr = createTheater();
        int[] fromS = {0, 1};
        int[] toS = {0, 0};
        boolean expected = true;
        boolean result = tr.reassignSeat(fromS[0], fromS[1], toS[0], toS[1]);
        assertEquals(expected, result);
        assertTrue(tr.getTheaterSeats()[fromS[0]][fromS[1]].isAvailable());
    }

    @DisplayName("reassignSeat Test 2")
    @Test
    void reassignSeat_Test02() {
        Theater tr = createTheater();
        int[] fromS = {4, 3};
        int[] toS = {0, 4};
        boolean expected = false;
        boolean result = tr.reassignSeat(fromS[0], fromS[1], toS[0], toS[1]);
        assertEquals(expected, result);
        assertTrue(!tr.getTheaterSeats()[fromS[0]][fromS[1]].isAvailable());
    }

    @DisplayName("reassignSeat Test 3")
    @Test
    void reassignSeat_Test03() {
        Theater tr = createTheater();
        int[] fromS = {1, 2};
        int[] toS = {2, 4};
        boolean expected = true;
        boolean result = tr.reassignSeat(fromS[0], fromS[1], toS[0], toS[1]);
        assertEquals(expected, result);
        assertTrue(tr.getTheaterSeats()[fromS[0]][fromS[1]].isAvailable());
    }

    @DisplayName("reassignSeat Test 4")
    @Test
    void reassignSeat_Test04() {
        Theater tr = createTheater();
        int[] fromS = {0, 1};
        int[] toS = {0, 3};
        boolean expected = false;
        boolean result = tr.reassignSeat(fromS[0], fromS[1], toS[0], toS[1]);
        assertEquals(expected, result);
        assertTrue(!tr.getTheaterSeats()[fromS[0]][fromS[1]].isAvailable());
    }

    @DisplayName("reassignSeat Test 5")
    @Test
    void reassignSeat_Test05() {
        Theater tr = createTheater();
        int[] fromS = {1, 0};
        int[] toS = {3, 2};
        boolean expected = false;
        boolean result = tr.reassignSeat(fromS[0], fromS[1], toS[0], toS[1]);
        assertEquals(expected, result);
        assertTrue(!tr.getTheaterSeats()[fromS[0]][fromS[1]].isAvailable());
    }

    @DisplayName("reassignSeat Test 6")
    @Test
    void reassignSeat_Test06() {
        Theater tr = createTheater();
        int[] fromS = {4, 3};
        int[] toS = {2, 4};
        boolean expected = true;
        boolean result = tr.reassignSeat(fromS[0], fromS[1], toS[0], toS[1]);
        assertEquals(expected, result);
        assertTrue(tr.getTheaterSeats()[fromS[0]][fromS[1]].isAvailable());
    }
}
