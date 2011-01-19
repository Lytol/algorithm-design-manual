package com.swig505.adm

object StringExtended {

  implicit def stringToStringExtended(string: String) = {
    new StringExtended(string)
  }
}

class StringExtended(private val string: String) {

  def findString(substring: String): Int = {
    var i = 0
    while (i < (string.length-substring.length)) {
      var j = 0
      while (j < substring.length && string(i+j) == substring(j))
        j+=1
      if (j == substring.length)
        return i
      i+=1
    }
    return -1
  }
}

