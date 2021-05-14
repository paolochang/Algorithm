package main

import "fmt"

func main() {
	var a, b int
	fmt.Scanf("%d", &a)
	for i := 1; i <= a; i++ {
		b += i
	}
	fmt.Println(b)
}