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
	var N int
	var star string = "*"
	fmt.Fscan(reader, &N)
	for i := 1; i <= N; i++ {
		for j := N-i; j > 0; j-- {
			fmt.Fprintf(writer, " ")
		}
		fmt.Fprintf(writer, "%v", star)
		star += "*"
		fmt.Fprintf(writer, "\n")
	}
}