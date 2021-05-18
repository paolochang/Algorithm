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
		fmt.Fscan(reader, &A, &B)
		if A == 0 && B == 0 {
			break
		}
		fmt.Fprintln(writer, A + B)
	}
}