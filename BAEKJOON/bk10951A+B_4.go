package main

import (
	"bufio"
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func main() {
	defer writer.Flush()
	for {
		var A, B int
		val, _ := fmt.Fscanln(reader, &A, &B)
		if val != 2 {
			break
		}
		fmt.Fprintln(writer, A + B)
	}
}