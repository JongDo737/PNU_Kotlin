
    fun main() {
        val array = Array(5) { index ->
            when (index) {
                0 -> "0"
                1 -> "1"
                2 -> "4"
                3 -> "9"
                4 -> "25"
                else -> throw IllegalArgumentException("인덱스 오류: $index")
            }
        }

        for (i:Int in 0..array.size-1) {
            array[i] = (array[i].toInt() + 5).toString()
            println("array[$i] = ${array[i]}")
        }
    }
