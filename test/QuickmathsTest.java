import junit.framework.TestCase;
import org.junit.Test;

public class QuickmathsTest extends TestCase{

    @Test
    public void testSum(){
        Quickmaths qm=new Quickmaths();

        assertEquals(10,qm.sum(2,8));
        assertEquals(50,qm.sum(15,35));
        assertEquals(60,qm.sum(25,35));
        assertEquals(8008,qm.sum(1001,7007));
    }

    @Test
    public void testGennemsnit(){
        Quickmaths qm=new Quickmaths();

        assertEquals(5.0,qm.gennemsnit(2,8));
        assertEquals(25.0,qm.gennemsnit(15,35));
        assertEquals(30.0,qm.gennemsnit(25,35));
        assertEquals(4004.0,qm.gennemsnit(1001,7007));
    }

}