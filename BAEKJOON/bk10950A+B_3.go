package main

import "fmt"

func main() {
	var T, A, B int
	fmt.Scanf("%d", &T)
	var slice = make([]int, T)
	for i := 0; i < T; i++ {
		fmt.Scanf("%d %d", &A, &B)
		slice[i] = A + B
	}
	for i := 0; i < T; i++ {
		fmt.Println(slice[i])
	}
}