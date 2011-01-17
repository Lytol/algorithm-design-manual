package com.swig505.adm {

    object Sort {

        def swap(a:Array[Int], idx1: Int, idx2: Int): Unit = {
            var temp = a(idx1)
            a(idx1) = a(idx2)
            a(idx2) = temp
        }

        // Selection sort works by finding the smallest element in the list
        // and moving it into the first position. Then finding the second smallest
        // element and moving it into second position, etc.
        //
        // O(n^2) since for each of the n elements, it must check teh other n-1 elements
        //
        def selectionSort(list: Array[Int]): Unit = {
            if (list.length > 1) {
                var currentIndex = 0
                while (currentIndex < list.length) {
                    var minIndex = currentIndex
                    var j = currentIndex
                    while (j < list.length) {
                        if (list(j) < list(minIndex))
                            minIndex = j
                        j+=1
                    }
                    swap(list,currentIndex,minIndex)
                    currentIndex+=1
                }
            }
        }

        // Insertion sort works by starting at the first element and moving forward, always keeping
        // a sorted list for the visited elements.
        //
        // O(n^2) since it visits each element, and iterates through all visited elements for each element
        //
        def insertionSort(list: Array[Int]): Unit = {
            var currentIndex = 1
            while (currentIndex < list.length) {
                var j = currentIndex
                while ((j > 0) && list(j) < list(j-1)) {
                    swap(list,j,j-1)
                    j-=1
                }
                currentIndex+=1
            }
        }
    }

}

