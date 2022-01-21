package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {

	reader := bufio.NewReader(os.Stdin)

	fmt.Print("Enter the Starting  Character = ")
	voch, _ := reader.ReadByte()

	if voch == 'a' || voch == 'e' || voch == 'i' || voch == 'o' || voch == 'u' ||
		voch == 'A' || voch == 'E' || voch == 'I' || voch == 'O' || voch == 'U' {
		fmt.Printf("%c is a VOWEL Character\n", voch)
	} else {
		fmt.Printf("%c is a CONSONANT\n", voch)
	}
}
