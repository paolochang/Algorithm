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
	var N, X int
	fmt.Fscanln(reader, &N, &X)
	var sequence = make([]int, N)
	for i := range sequence {
		fmt.Fscanf(reader, "%d ", &sequence[i])
		if sequence[i] < X {
			fmt.Fprintf(writer, "%d ", sequence[i])
		}
	}
	fmt.Fprint(writer, "\n")
}