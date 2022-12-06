fun main() {
    fun part1(input: List<String>): Int {
        var counter: Int=0
        
        for(i in input){
         if(i[0]=="A"){
             counter+=8
        }
         else if(i[0]=="B"){
             counter++
         }
         
         else if(i[0]=="C"){
         counter+=6
         }
        }
        
        return counter
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 1)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
