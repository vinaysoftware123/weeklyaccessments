package main

import (
	"fmt"
)

func sum(arr []int) int {
	result := 0
	for _, i := range arr {
		result += i
	}
	return result
}
func main() {
	arr := []int{2, 4, 6, 8, 34, 5, 7, 3, 5, 67, 4}
	res := sum(arr)
	fmt.Println("Average of given array is: ", res/len(arr))
}
