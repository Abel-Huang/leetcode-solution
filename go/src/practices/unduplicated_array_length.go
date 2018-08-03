package main

import "fmt"

func removeDuplicates(nums []int) int {
	if nums == nil {
		return 0
	}
	len := len(nums)
	if len <= 1{
		return len
	}
	size := len
	for i := 0; i < size; i++ {
		duplicate := 0
		for j := i + 1; j < size;  j++{
			if nums[i] == nums[j] {
				duplicate ++
			}else {
				break
			}
		}
		for k := i + 1 + duplicate; k < size; k++ {
			nums[k - duplicate] = nums[k]
		}
		size -= duplicate
	}
	return size
}
func main() {
	nums1 := []int{1, 2, 3, 4, 5, 5}
	fmt.Println(removeDuplicates(nums1))
	nums2 := []int{1,2, 2, 2, 2, 2}
	fmt.Println(removeDuplicates(nums2))
	nums3 := []int{1, 2, 2, 3, 3, 4, 5}
	fmt.Println(removeDuplicates(nums3))
}

