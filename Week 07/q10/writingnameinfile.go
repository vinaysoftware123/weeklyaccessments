package main

import (
	"fmt"
	"os"
)

func main() {
	f, err := os.Create("test.txt")
	if err != nil {
		fmt.Println(err)
		return
	}
	l, err := f.WriteString("Vinay Reddy sabbbella")
	if err != nil {
		fmt.Println(err)
		f.Close()
		return
	}
	fmt.Println(l, "Name Written Successfully")
	err = f.Close()
	if err != nil {
		fmt.Println(err)
		return
	}
}
