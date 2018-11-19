import KotlinSolutions.compareTheTriplets
import KotlinSolutions.solveMeFirst
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import kotlin.test.assertEquals

class KotlinTest{

    @Test
    fun testSolveMeFirstImpl(){
        assertEquals(3,solveMeFirst(1,2))
        assertEquals((150 + 1024), solveMeFirst(150, 1024))
        assertEquals((-23 + 350), solveMeFirst(-23, 350))
        assertEquals((-222 + 25), solveMeFirst(-222, 25))
    }

    @Test
    fun testCompareTheTripletsSolution(){
        assertArrayEquals(arrayOf(1,1), compareTheTriplets(arrayOf(5,6,7), arrayOf(3,6,10)))
    }


}