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
	var T, A, B int
	fmt.Fscan(reader, &T)
	for i := 1; i <= T; i++ {
        fmt.Fscan(reader, &A, &B)
        fmt.Fprintf(writer, "Case #%d: %d + %d = %d\n", i, A, B, A+B)
	}
}