import JavaSolutions.CompareTheTriplets;
import JavaSolutions.SolveMeFirst;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaTest {

    private SolveMeFirst solver;
    private CompareTheTriplets compareTheTriplets;


    @Before
    public void beforeTest(){
        solver = new SolveMeFirst();
        compareTheTriplets = new CompareTheTriplets();

    }


    @Test
    public void testSolverMeFirstSolution(){

        assertEquals(15, solver.func(10,5));
        assertEquals(3, solver.func(10, -7));
        assertEquals(-2, solver.func(-10, 8));
    }


    @Test
    public void setCompareTheTripletsSolutionTest(){

        assertArrayEquals(new int[]{1,1}, compareTheTriplets.compare(new int[] {5,6,7}, new int[]{3,6,10}));
    }
}
