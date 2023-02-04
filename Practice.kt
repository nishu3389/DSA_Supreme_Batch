package com.avinash.clean.util

fun main() {
	PatternPrinting.square(6,6)
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

		}

	}
}
