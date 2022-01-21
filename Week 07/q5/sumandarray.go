package main

import "fmt"

func main() {

	array := [...]int{2, 4, 6, 8, 34, 5, 7, 3, 5, 67, 4}
	sum := 0
	for i := 0; i < len(array); i++ {
		sum = sum + array[i]
	}
	fmt.Println("Sum of the given array is", sum)

}
