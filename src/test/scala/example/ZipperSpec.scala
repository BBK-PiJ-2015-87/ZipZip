package org.testlibs

import org.scalatest._

class ZipperSpec extends FlatSpec with Matchers {
  "Zipper" should "zip objects" in {
    val zipper = new Zipper()

    zipper.zip(2) shouldEqual(1)
  }
}
