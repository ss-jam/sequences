package ssjam

import org.scalatest.WordSpec

class ReaderSpec extends WordSpec {
  "A Reader" when {

    "initializing" should {
      "open a BAM file" in {
        false
      }
    }

    "reading a sequence" should {
      "read a chunk of configured size" in {
        false
      }
      "add meta data to the sequence" in {
        false
      }
      "send the chunk to a processor" in {
        false
      }
      "simulate a configured delay" in {
        false
      }
    }

    "closing a BAM file" should {
      "notify processors stream is closed" in {
        false
      }
    }
  }
}
