package KotlinSolutions

fun simpleArraySum(ar: Array<Int>): Int {


    tailrec fun calc(array:Array<Int>, pointer: Int, res: Int): Int =
            when (pointer) {
                array.size -> res
                else -> calc(array, pointer + 1, res + array[pointer])
            }

    return calc(ar,0,0)
}