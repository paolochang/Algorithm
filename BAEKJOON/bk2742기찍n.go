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
	for i := a; i > 0; i-- {
        fmt.Fprintln(writer, i)
	}
}