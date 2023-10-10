# Python program for implementation of Bubble Sort
#hello python
def bubbleSort(arr):
	n = len(arr)
	# optimize code, so if the array is already sorted, it doesn't need
	swapped = False
	# Traverse through all array elements
	for j in range(n-1):
		# range(n) also work but outer loop will repeat one time more than needed.
		for i in range(0, n-j-1):

			# traverse the array from 0 to n-i-1 Swap if the element found is greater than the next element
			if arr[i] > arr[i + 1]:
				swapped = True
				arr[i], arr[i + 1] = arr[i + 1], arr[i]
		
		if not swapped:
			# if we haven't needed to make a single swap, we can just exit the main loop.
			return

# Driver code to test above
arr = [60, 30, 20, 10, 22, 11, 90]

bubbleSort(arr)

print("Sorted array is:")
for i in range(len(arr)):
	print("% d" % arr[i], end=" ")
