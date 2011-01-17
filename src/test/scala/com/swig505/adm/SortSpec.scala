package com.swig505.adm

import org.specs._
import org.specs.matcher.Matcher


class SortSpec extends Specification {

    def haveSameElements(a1: Array[Int]) = new Matcher[Array[Int]] {
        def apply(a2: => Array[Int]) = {
          (a1.sameElements(a2), a1 + " has same elements as " + a2, a1 + " does not have same elements as " + a2)
        }
    }

    "selectionSort" should {
        "handle an empty array" >> {
            var array = Array[Int]()
            Sort.selectionSort(array)
            array must haveSameElements(Array[Int]())
        }
        "sort a single element array" >> {
            var array = Array(1)
            Sort.selectionSort(array)
            array must haveSameElements(Array(1))
        }
        "sort a multiple element array" >> {
            var array = Array(7,3,4,2,5,9)
            Sort.selectionSort(array)
            array must haveSameElements(Array(2,3,4,5,7,9))
        }
    }

}

