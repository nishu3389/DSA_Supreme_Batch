package com.avinash.clean.util

fun main() {
	PatternPrinting.square(6,6)
}

class Functions {
	companion object {

		fun areaOfCircle(radius: Int): Double {
			return (radius * radius) * Math.PI
		}

		fun evenOrOdd(number: Int): String {
			return if(number % 2 == 0) "Even" else "Odd"
		}

		fun factorial(num: Int): Int {
			var fact = 1
			for(num in 1..num) {
				fact *= num
			}
			return fact
		}

		fun primeOrNot(num: Int): Boolean {
			for(i in 2..(num / 2)) {
				if(num % i == 0) {
					return false
					break
				}
			}
			return true
		}

		fun primeFromOneToN(n: Int) {
			var builder = StringBuilder()
			for(num in 2..n) {
				var prime = true
				if(num / 2 >= 2) {
					for(i in 2..num / 2) {
						if(num % i == 0) {
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

		fun printAllDigitsInAnIntegerWithoutLoop(num: Int) {
			var finalNum = num

			while(finalNum > 0) {
				var lastDigit = finalNum % 10 // get last digit
				println("$lastDigit")
				finalNum /= 10 // remove last digit
			}

		}

		fun printAllDigitsInAnIntegerWithLoop(num: Int) {
			for(num in num.toString().toCharArray()) {
				println(num)
			}
		}

		fun oneToNumWithoutLoop(num: Int) {
			if(num > 1)
				oneToNumWithoutLoop(num - 1)
			println("$num")
		}

		fun digitsToNumber() {
			println("Enter a digit")
			var digit1 = readLine()

			println("Enter a digit")
			var digit2 = readLine()

			println("Enter a digit")
			var digit3 = readLine()

			println((digit1 + digit2 + digit3).toInt())
		}

		fun reverseAnInteger(num: Int) {
			var str = ""
			var finalNum = num
			while(finalNum > 0) {
				var lastDigit = finalNum % 10
				str += lastDigit
				finalNum /= 10
			}

			println("${str.toInt()}")
		}

		// 786
		fun reverseAnIntegerWithoutString() {
			var num = 786
			var reversed = 0

			while(num != 0) {
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
			for(row in 0 until n) {
				for(space in 0 until n - (row + 1)) {
					print(" ")
				}

				for(col in 1..row + 1) {
					if(col == 1 || col == row + 1 || row == n - 1) {
						print(if(col == row + 1) "$col" else "${col}-")
					} else {
						print("--")
					}
				}
				print("\n")
			}
		}

		fun invertedFullPyramid2(n: Int) {
			for(row in 0 until n) {
				for(space in 0 until row) {
					print(" ")
				}
				for(star in 0 until n - row) {
					print("* ")
				}
				print("\n")
			}
		}

		fun solidDiamond(n: Int) {
			for(row in 0 until n) {
				for(col in 0 until n - row - 1) {
					print(" ")
				}
				for(star1 in 0 until row + 1) {
					print("* ")
				}
				println("")
			}

			for(row in 0 until n) {
				for(col in 0 until row) {
					print(" ")
				}
				for(star1 in 0 until n - row) {
					print("* ")
				}
				println("")
			}
		}

		fun hollowDiamond(n: Int) {
			for(row in 0 until n) {
				for(col in 0 until n - row - 1) {
					print(" ")
				}
				for(star1 in 0 until row + 1) {
					print(if(star1 == 0 || star1 == (row + 1) - 1) "* " else "  ")
				}
				println("")
			}

			for(row in 0 until n) {
				for(col in 0 until row) {
					print(" ")
				}
				for(star1 in 0 until n - row) {
					print(if(star1 == 0 || star1 == (n - row) - 1) "* " else "  ")
				}
				println("")
			}
		}

		fun flippedSolidDiamond(n: Int) {
			for(row in 0 until n) {
				for(star1 in 0 until n - row) {
					print("* ")
				}
				for(space in 0 until 2 * row) {
					print("  ")
				}
				for(star2 in 0 until n - row) {
					print("* ")
				}
				print("\n")
			}

			for(row in 0 until n) {
				for(star1 in 0 until row + 1) {
					print("* ")
				}
				for(space in 0 until (n - (row + 1)) * 2) {
					print("  ")
				}
				for(star1 in 0 until row + 1) {
					print("* ")
				}
				print("\n")
			}

		}

		fun fancyPattern2(n: Int) {

			for(row in 0 until n) {
				for(num in 0 until row + 1) {
					print(if(num != (row + 1) - 1) "${row + 1}*" else "${row + 1}")
				}
				print("\n")
			}

			for(row in 0 until n) {
				for(num in 0 until n - row) {
					print(if(num != n - row - 1) "${n - row}*" else "${n - row}")
				}
				print("\n")
			}

		}

		fun alphabetPalindromePyramid(n: Int) {
			for(row in 0 until n) {
				var start1 = 0
				var ascii = 0
				for(col in 0 until row + 1) {
					ascii = col + 65
					print("${ascii.toChar()} ")
					++start1
				}
				--start1

				for(col2 in 0 until start1) {
					print("${(--ascii).toChar()} ")
				}
				print("\n")
			}
		}

		fun numericHollowHalfPyramid(n: Int) {
			for(row in 0 until n) {
				for(col in 0 until row + 1) {
					if(row > 1 && row < n - 1 && col != 0 && col < (row + 1) - 1)
						print("  ")
					else
						print("${col + 1} ")
				}
				print("\n")
			}
		}

		fun numericHollowInvertedHalfPyramid(n: Int) {
			for(row in 0 until n) {
				for(col in 0 until n - row) {
					if(row > 0 && row < n - 1 && col > 0 && col < (n - row) - 1)
						print("  ")
					else if(col == (n - row) - 1)
						print("$n ")
					else if(col == 0)
						print("${row + 1} ")
					else
						print("${col + 1} ")
				}
				print("\n")
			}
		}

		fun numericPalindromeEquilateralPyramid(n: Int) {
			for(row in 0 until n) {
				for(space in 0 until n - row - 1) {
					print("  ")
				}

				var start = 0
				for(num in 0 until row + 1) {
					print("${num + 1} ")
					start = num + 1
				}

				for(num2 in 0 until row) {
					print("${--start} ")
				}

				print("\n")
			}
		}

		fun fancyPattern1(n: Int) {
			for(row in 0 until n) {
				for(col in 0 until (n + 3) - row) {
					print("*")
				}

				for(num in 0 until row + 1) {
					if(num < (row + 1) - 1)
						print("${row + 1}*")
					else
						print("${row + 1}")
				}

				for(col2 in 0 until (n + 3) - row) {
					print("*")
				}

				print("\n")
			}
		}

		fun solidHalfPyramid(n: Int) {
			for(row in 0 until n) {
				for(star in 0 until row + 1) {
					print("* ")
				}
				print("\n")
			}

			for(row in 0 until n) {
				for(star in 0 until n - row - 1) {
					print("* ")
				}
				print("\n")
			}

		}

		fun fancyPattern3(n: Int) {

			for(row in 0 until n) {
				print("* ")

				var start = 0
				for(col in 0 until row) {
					print("${col + 1} ")
					start = col + 1
				}

				for(col1 in start downTo 1) {
					if(col1 != start)
						print("${--start} ")
				}
				if(row != 0)
					print("*")

				print("\n")
			}

			for(row in 0 until n) {
				if(row != n - 1)
					print("* ")

				var start = 0
				for(col in 0 until (n - row - 1) - 1) {
					print("${col + 1} ")
					start = col + 1
				}

				for(col1 in start downTo 1) {
					if(col1 != start)
						print("${--start} ")
				}

				if(row != n - 1 && row != n - 2)
					print("*")

				print("\n")
			}

		}

		fun fancyPattern3Again(n: Int) {

			for(row in 0 until n) {

				var start = 0
				for(col in 0 until row + 1) {
					if(col == 0) print("* ")
					else {
						print("$col ")
						start = col
					}
				}

				for(rev in 0 until start - 1) {
					if(start > 1)
						print("${--start} ")
				}


				if(row != 0)
					print("*")

				print("\n")
			}

			for(row in 0 until n - 1) {
				var start = 0
				for(col in 0 until n - row - 1) {
					if(col == 0) print("* ")
					else {
						print("$col ")
						start = col
					}
				}

				for(rev in 0 until start - 1) {
					if(start > 1)
						print("${--start} ")
				}

				if(row < (n - 1) - 1)
					print("*")

				print("\n")
			}

		}

		fun fancyPattern4(n: Int) {
			var num = 0

			for(row in 0 until n) {
				for(col in 0 until row + 1) {
					print(if(col < (row + 1) - 1) "${++num}*" else "${++num}")
				}
				print("\n")
			}

			var last = 0
			for(row in 0 until n) {
				for(col in num - (n - row - 1)..num) {
					if(last == 0)
						last = col - 1
					print(if(col != num) "$col*" else "$col")
				}
				num = last
				last = 0
				print("\n")
			}
		}

		fun floydTrianglePattern(n: Int) {
			var start = 0
			for(row in 0 until n) {
				for(col in 0 until row + 1) {
					print("${++start} ")
				}
				print("\n")
			}
		}

		fun pascalsTriangle(n: Int) {
			for(row in 0 until n) {
				var prev = 0
				for(col in 0 until row + 1) {
					if(col == 0 || col == row + 1) {
						prev = 1
						print("$prev")
					} else {

						print("${col + prev}") // (1+1) ->
					}
				}
			}
		}

		fun butterflyPattern(n: Int) {
			for(row in 0 until n) {
				for(col in 0 until row + 1) {
					print("* ")
				}
				for(col in 0 until (n - row - 1) * 2) {
					print("  ")
				}
				for(col in 0 until row + 1) {
					print("* ")
				}
				print("\n")
			}
			for(row in 0 until n) {
				for(col in 0 until n - row) {
					print("* ")
				}
				for(col in 0 until (row) * 2) {
					print("  ")
				}
				for(col in 0 until n - row) {
					print("* ")
				}
				print("\n")
			}
		}

		fun hollowPyramid(n: Int) {
			for(i in 0 until n) {
				for(col in 0 until n * 2 - 1) {
					if(col < n - i - 1)
						print("  ")
					else if(col >= (n - i - 1) && col < (n - i - 1) + (i * 2 + 1))
						print("* ")
					else
						print("  ")
				}
				print("\n")
			}
		}

	}
}
