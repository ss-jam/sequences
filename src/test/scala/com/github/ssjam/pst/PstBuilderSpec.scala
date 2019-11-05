package com.github.ssjam.pst

class PstBuilderSpec extends UnitSpec {
  "A Pst Builder" when {

    "initializing" should {
      "takes a sequence set S, " +
        "a tree depth L, " +
        "an alphabet A, " +
        "a probability threshold p, " +
        "a parent-child difference prediction d, " +
        "a smoothing parameter k, " +
        "and an appearance constant c" in {
        fail("not yet implemented")
      }
      "accept one or more sequences for S" in {
        fail("not yet implemented")
      }
      "accept a positive percentage or value between 0 and 1 inclusive for p" in {
        fail("not yet implemented")
      }
      "create a new Pst T with a root node and first level nodes" in {
        fail("not yet implemented")
      }
    }

    "extending T" should {
      "select a node x from T and a symbol s from A determine if " +
        "P(s|x) >= (1 + c)k and " +
        "P(s|x)/P(s|G(x)) >= d or " +
        "P(s|x)/P(s|G(x)) <= 1/d, where G(x) is the parent node" in {
        fail("not yet implemented")
      }
    }
  }
}
