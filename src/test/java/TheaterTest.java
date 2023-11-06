import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TheaterTest {
    
    @DisplayName("Theater Test 1")
    @Test
    void theater_Test01() {
        int col = 5;
        int t1 = 3;
        int t2 = 2;
        Theater tr = new Theater(col, t1, t2);
        int resultCol = tr.getTheaterSeats()[0].length;
        int resultRow = tr.getTheaterSeats().length;
        assertEquals(col, resultCol);       // Test width
        assertEquals(t1 + t2, resultRow);   // Test height
        assertEquals(1, tr.getTheaterSeats()[0][0].getTier());
        assertEquals(2, tr.getTheaterSeats()[t1][0].getTier());
    }
    
    @DisplayName("Theater Test 2")
    @Test
    void theater_Test02() {
        int col = 3;
        int t1 = 4;
        int t2 = 0;
        Theater tr = new Theater(col, t1, t2);
        int resultCol = tr.getTheaterSeats()[0].length;
        int resultRow = tr.getTheaterSeats().length;
        assertEquals(col, resultCol);       // Test width
        assertEquals(t1 + t2, resultRow);   // Test height
        assertEquals(1, tr.getTheaterSeats()[0][0].getTier());
        assertEquals(1, tr.getTheaterSeats()[t1-1][0].getTier());
    }
    
    @DisplayName("Theater Test 3")
    @Test
    void theater_Test03() {
        int col = 2;
        int t1 = 1;
        int t2 = 6;
        Theater tr = new Theater(col, t1, t2);
        int resultCol = tr.getTheaterSeats()[0].length;
        int resultRow = tr.getTheaterSeats().length;
        assertEquals(col, resultCol);       // Test width
        assertEquals(t1 + t2, resultRow);   // Test height
        assertEquals(1, tr.getTheaterSeats()[0][0].getTier());
        assertEquals(2, tr.getTheaterSeats()[t1][0].getTier());
    }
    
    @DisplayName("Theater Test 4")
    @Test
    void theater_Test04() {
        int col = 10;
        int t1 = 4;
        int t2 = 1;
        Theater tr = new Theater(col, t1, t2);
        int resultCol = tr.getTheaterSeats()[0].length;
        int resultRow = tr.getTheaterSeats().length;
        assertEquals(col, resultCol);       // Test width
        assertEquals(t1 + t2, resultRow);   // Test height
        assertEquals(1, tr.getTheaterSeats()[0][0].getTier());
        assertEquals(2, tr.getTheaterSeats()[t1][0].getTier());
    }
}
