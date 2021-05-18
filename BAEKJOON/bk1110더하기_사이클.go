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
	var N, res int
	count := 0
	fmt.Fscan(reader, &N)
	res = N
	for {
		x, y := getXY(res)
		res = getNum(x, y)
		count++
		// fmt.Fprintln(writer, res)
		if res == N {
			fmt.Fprintln(writer, count)
			break
		}
	}
}

func getNum(x int, y int) int {
	// fmt.Println("getNum")
	z := (x + y) % 10
	num := y * 10 + z
	return num
}

func getXY(num int) (int, int) {
	// fmt.Println("getXY")
	x := num / 10 % 10
	y := num % 10
	return x, y
}