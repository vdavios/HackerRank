package KotlinSolutions

fun compareTheTriplets(aliceArray: Array<Int>, bobArray: Array<Int>): Array<Int>{
    fun calc(ar1: Array<Int>, ar2: Array<Int>, resAr: Array<Int>): Array<Int>{
        for(i in 0..2){
            when {
                ar1[i] - ar2[i]> 0 -> resAr[0]+=1
                ar1[i] - ar2[i]< 0 -> resAr[1]+=1
            }
        }

        return resAr
    }

    return calc(aliceArray, bobArray, Array(2){0})
}
