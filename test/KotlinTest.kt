import KotlinSolutions.compareTheTriplets
import KotlinSolutions.simpleArraySum
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


    @Test
    fun testSimpleArraySum(){
        assertEquals(10, simpleArraySum(arrayOf(3,3,4)))
        assertEquals(12, simpleArraySum(arrayOf(5,3,4)))
        assertEquals(14, simpleArraySum(arrayOf(5,5,4)))
        assertEquals(16, simpleArraySum(arrayOf(5,5,6)))
    }

}