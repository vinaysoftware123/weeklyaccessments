package main

import "fmt"

func main() {
	var large1 int = 0
	var large2 int = 0
	var arr [10]int

	arr[0] = 3
	arr[1] = 5
	arr[2] = 7
	arr[3] = 3
	arr[4] = 6
	arr[5] = 3
	arr[6] = 5
	arr[7] = 6
	arr[8] = 3
	arr[9] = 6
	large1 = arr[0]
	for i := 1; i <= 4; i++ {
		if large1 < arr[i] {
			large2 = large1
			large1 = arr[i]
		} else if large2 < arr[i] {
			large2 = arr[i]
		}
	}
	fmt.Println("Second largest element is: ", large2)
}
