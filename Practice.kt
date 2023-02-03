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

		fun fullPyramid(row: Int) {
			for(r in 1..row) { // 1
				for(space in 1..row - r) { // 1 -> 4
					print(" ")
				}
				for(star in row - (r - 1)..row) { // 4 -> 5
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
			for(r in 1..row) { // 2
				for(space in 1..row - r) { // 1 -> 4
					print(" ")
				}
				for(star in 1..row - (row - r)) { // 5 -> 6
					if(star == 1 || star == row - (row - r) || r == row)
						print("$star ")
					else
						print("  ")
				}
				print("\n")
			}
		}
	}
}

