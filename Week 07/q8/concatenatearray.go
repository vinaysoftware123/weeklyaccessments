package main

import "fmt"

func main() {
	arr1 := []int{3, 5, 76, 3, 6, 3, 5, 6, 3}

	arr2 := []int{2, 3, 65, 7, 4, 3, 6, 3, 56, 3}

	arr3 := append(arr1, arr2...)

	fmt.Printf("length=%d\n", len(arr3))

	fmt.Printf("value=%v\n", arr3)

}
