import java.util.*

fun compute(str: String): String {
	var start = 0
	val strChars = str.toCharArray()
	val revChars = str.reversed()
	var longestPalindrome = StringBuffer()

	while(start < str.length){
		if(strChars[start] == revChars[start]){
			longestPalindrome.append(revChars[start])
		}
		start++
	}
	
	return longestPalindrome.toString()
}

fun main(args: Array<String>){
	println(compute("madam"))
	println(compute("badad"))
	println(compute("nurses run"))
	println(compute("ahkwque"))
} 
