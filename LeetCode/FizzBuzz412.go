package LeetCode

// Example 1:
// Input: n = 3
// Output: ["1","2","Fizz"]
// Example 2:
// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
// Example 3:
// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

import (
	"strconv"
)

func FizzBuzz(n int) []string {
	array := make([]string, n)
    for i := 0; i < n; i++ {
        if (i+1) % 3 == 0 && (i+1) % 5 == 0 {
            array[i] = "FizzBuzz"
        } else if (i+1) % 3 == 0 {
            array[i] = "Fizz"
        } else if (i+1) % 5 == 0 {
            array[i] = "Buzz"
        } else {
            array[i] = strconv.Itoa((i+1))
        }
    }
    return array
}