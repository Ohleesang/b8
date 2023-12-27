class Solution {
    fun solution(message: String): Int {
        var answer: Int = 0
        answer = message.length*2
        return answer
    }
}

fun main(){
    val a =Solution()
    a.solution("happy birthday!")//30
    a.solution("I love you~")//22
}