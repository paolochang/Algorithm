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
        fmt.Fprintf(writer, "%v\n",star)
		star += "*"
	}
}