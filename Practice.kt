package com.avinash.clean.util

fun main() {
	PatternPrinting.square(6,6)
}

class Functions{
	companion object{
		
		fun areaOfCircle(radius : Int): Double {
			return (radius*radius)*Math.PI
		}
		
		fun evenOrOdd(number: Int): String {
			return if(number%2==0) "Even" else "Odd"
		}
		
		fun factorial(num : Int): Int {
			var fact = 1
			for(num in 1..num){
				fact *= num
			}
			return fact
		}
		
		fun primeOrNot(num: Int): Boolean {
			for(i in 2..(num/2)){
				if(num%i == 0){
					return false
					break
				}
			}
			return true
		}
		
		fun primeFromOneToN(n : Int){
			var builder = StringBuilder()
			for(num in 2..n){
				var prime = true
				if(num/2 >= 2){
					for(i in 2..num/2){
						if(num%i == 0){
							prime = false // not a prime number
							break
						}
					}
				}
				if(prime)
					builder.append("$num, ")
			}
			println("$builder")
		}
		
		fun printAllDigitsInAnIntegerWithoutLoop(num: Int){
			var finalNum = num

			while(finalNum > 0){
				var lastDigit = finalNum % 10 // get last digit
				println("$lastDigit")
				finalNum /= 10 // remove last digit
			}

		}
		
		fun printAllDigitsInAnIntegerWithLoop(num: Int){
			for(num in num.toString().toCharArray()){
				println(num)
			}
		}
		
		fun oneToNumWithoutLoop(num : Int){
			if(num>1)
				oneToNumWithoutLoop(num-1)
			println("$num")
		}
		
		fun digitsToNumber(){
			println("Enter a digit")
			var digit1 = readLine()

			println("Enter a digit")
			var digit2 = readLine()

			println("Enter a digit")
			var digit3 = readLine()

			println((digit1+digit2+digit3).toInt())
		}
		
		fun reverseAnInteger(num : Int){
			var str = ""
			var finalNum = num
			while(finalNum > 0){
				var lastDigit = finalNum % 10
				str += lastDigit
				finalNum /= 10
			}

			println("${str.toInt()}")
		}
		
		// 786
		fun reverseAnIntegerWithoutString(){
			var num = 786
			var reversed = 0

			while (num != 0) {
				val digit = num % 10 // 6 -> 8 -> 7
				reversed = reversed * 10 + digit
				// 0 = 0 * 10 + 6 -> 6
				// 6 = 6 * 10 + 8 -> 68
				// 68 = 68 * 10 + 7 -> 687
				num /= 10
			}

			println("Reversed Number: $reversed")
		}
	}
}

class PatternPrinting {
	companion object {

		fun square(row: Int, col: Int) {
			for(r in 0 until row) {
				for(c in 0 until col) {
					print(" * ")
				}
				print("\n")
			}
		}

		fun hollowSquare(row: Int, col: Int) {
			for(r in 0 until row) {
				for(c in 0 until col) {
					if(r == 0 || r == row - 1)
						print("* ")
					else if(c == 0 || c == col - 1)
						print("* ")
					else
						print("  ")
				}
				print("\n")
			}
		}

		fun halfPyramid(row: Int) {
			for(r in 1..row) {
				for(c in 1..r) {
					print("* ")
				}
				print("\n")
			}
		}

		fun invertedHalfPyramid(row: Int) {
			for(r in 0 until row) {
				for(c in 0 until row - r) {
					print("* ")
				}
				print("\n")
			}
		}

		fun numericHalfPyramid(row: Int) {
			for(r in 0 until row) {
				for(c in 0 until r + 1) {
					print("${c + 1} ")
				}
				print("\n")
			}
		}

		fun invertedNumericalHalfPyramid(row: Int) {
			for(r in 0 until row) {
				for(c in 0 until row - r) {
					print("${c + 1} ")
				}
				print("\n")
			}
		}

		fun fullPyramid(n: Int) {
			for(row in 1..n) {
				for(space in 1..n - row) {
					print(" ")
				}
				for(star in n - (row - 1)..n) {
					print("* ")
				}
				print("\n")
			}
		}

		fun invertedFullPyramid(row: Int) {
			for(r in 1..row) {
				for(space in 0 until r - 1) {
					print(" ")
				}
				for(star in r..row) {
					print("* ")
				}
				print("\n")
			}
		}

		fun numericFullPyramid(row: Int) {
			for(r in 1..row) { // 2
				for(space in 1..row - r) { // 1 -> 4
					print(" ")
				}
				for(star in 1..row - (row - r)) { // 5 -> 6
					print("$star ")
				}
				print("\n")
			}
		}

		fun numericHollowPyramid(row: Int) {
			for(r in 1..row) {

				for(space in 1..row - r) {
					print(" ")
				}

				for(col in 1..row - (row - r)) {
					if(col == 1 || col == row - (row - r) || r == row)
						print("$col ")
					else
						print("  ")
				}

				print("\n")
			}
		}

		fun numericFullPyramid2(n: Int) {
			for(row in 0 until n) {

				for(space in 0 until n - row - 1) {
					print("_")
				}

				var num = row
				for(star in (n - row) + 1..n) {
					print("$num ")
					num += 1
				}

				num -= 1
				for(rev in 1 until row) {
					num -= 1
					print("$num ")
				}
				print("\n")
			}
		}

		fun numericFullPyramid3(n: Int) {
			for(row in 0 until n) {

				for(space in 0 until n - row - 1) {
					print("_")
				}

				for(col in 0 until row + 1) {
					print("${row + col + 1}")
				}

				var start = 2 * row
				for(col2 in 0 until row) {
					print(start)
					start--
				}
				print("\n")
			}
		}

		fun numericFullPyramid4(n: Int) {
			for(row in 1..n) {
				for(space in 1..n - row) {
					print("_")
				}

				var start1 = row
				for(num1 in n - row + 1..n) {
					print("${start1++}")
				}
				--start1

				for(num2 in 1 until row) {
					print("${--start1}")
				}
				print("\n")
			}
		}

		fun numericFullPyramid5(n: Int) {
			for(row in 0 until n) {
				for(space in 0 until n - (row + 1)) {
					print(" ")
				}

				var start1 = row + 1
				for(num1 in n - (row + 1) + 1..n) {
					print("${start1++}")
				}
				--start1

				for(num2 in 0 until row) {
					print("${--start1}")
				}
				print("\n")
			}
		}

		fun numericFullPyramid6(n: Int) {
			for(row in 0 until n) {
				for(space in 0 until n - (row + 1)) {
					print(" ")
				}

				var start1 = row + 1
				for(col in 0 until row + 1) {
					print("${start1++}")
				}
				--start1

				for(col2 in 0 until row) {
					print("${--start1}")
				}

				print("\n")
			}
		}

		fun numericHollowPyramid2(n: Int) {
			for(row in 0 until n){
				for(space in 0 until n-(row+1)){
					print(" ")
				}

				for(col in 1..row+1){
					if(col == 1 || col == row+1 || row == n-1){
						print(if(col == row+1) "$col" else "${col}-")
					}else{
						print("--")
					}
				}
				print("\n")
			}
		}

		fun invertedFullPyramid2(n : Int){
			for(row in 0 until n){
				for(space in 0 until row){
					print(" ")
				}
				for(star in 0 until n-row){
					print("* ")
				}
				print("\n")
			}
		}
	}
}
