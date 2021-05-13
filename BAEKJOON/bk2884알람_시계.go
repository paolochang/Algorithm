package main

import "fmt"

func main() {
	var a, b int
	fmt.Scanf("%d %d", &a, &b)
	if b >= 45 {
		fmt.Println(a, b-45)
	} else {
		if a == 0 {
			fmt.Println(23, 60 + (b - 45))
		} else {
			fmt.Println(a - 1, 60 + (b - 45))
		}
	}
}