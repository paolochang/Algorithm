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
	
	var a int
	fmt.Fscan(reader, &a)
	for i := 1; i <= a; i++ {
        fmt.Fprintln(writer, i)
	}
}