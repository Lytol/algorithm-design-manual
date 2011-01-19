package com.swig505.adm


import org.specs._
import org.specs.matcher.Matcher
import com.swig505.adm.StringExtended.stringToStringExtended


class StringSpec extends Specification {

  "findString" should {
    "return -1 for no match" >> {
      var index:Int = "my name is brian".findString("nope")
      index must_== -1
    }
    "return index for match" >> {
      var index:Int = "my name is brian".findString("name")
      index must_== 3
    }
    "return first index for multiple matches" >> {
      var index:Int = "my name is brian and his name is john".findString("name")
      index must_== 3
    }
  }

}
