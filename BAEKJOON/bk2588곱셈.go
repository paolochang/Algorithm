package main

import "fmt"

func main() {
	var a, b int
	var q, w, e int
	fmt.Scanf("%d", &a)
	fmt.Scanf("%d", &b)
	q = b % 10
	w = (b / 10) % 10
	e = (b / 100) % 10
	fmt.Println(a*q)
	fmt.Println(a*w)
	fmt.Println(a*e)
	fmt.Println(a*b)
}