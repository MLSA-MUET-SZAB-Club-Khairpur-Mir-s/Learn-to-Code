// This is code for Binary  Search in Kotlin ..

package main.algorithms.searching

fun main(args: Array<String>) {
    val array = readLine()!!.trim().split(" ").map { it -> it.toInt() }.toIntArray()  // to read an array (from user input)
    val elementToSearch = readLine()!!.trim().toInt()   // to read the element to be searched (from user input)
    val index = binarySearchIterative(input, elementToSearch)
    if(index >= 0 ) {
        println(index) // to print position at last
    } else {
        println("Index not found")
    }
}

fun binarySearchIterative(array: IntArray, elementToSearch: Int) : Int{
    var start = 0
    var end = array.size - 1
    var mid:Int
    while(start <= end) {
        mid = start + ((end - start) / 2)
        when {
            elementToSearch > array[mid]   -> start = mid+1    // element is greater than middle element of array, so it will be in right half of array
            elementToSearch == array[mid] -> return mid // found the element
            elementToSearch < array[mid]  -> end = mid-1   // element is less than middle element of array, so it will be in left half of the array.
        }
    }
    return -1
}
Footer
