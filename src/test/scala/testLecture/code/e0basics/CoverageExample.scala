package testLecture.code.e0basics

import org.scalatest.funsuite.AnyFunSuite
import testLecture.code.ProgramToCover

// sbt
// > coverage
// > testOnly *ConditionCoverageExample
// > coverageReport

class ConditionCoverageExample extends AnyFunSuite:
  test("Cover all the conditions") {
    ProgramToCover.methodToCover(false, true, false, true, true)
    ProgramToCover.methodToCover(true, false, true, false, false)
  }

class DecisionCoverageExample extends AnyFunSuite:
  test("Cover all the decision branches") {
    ProgramToCover.methodToCover(true, true, false, false, true)
    ProgramToCover.methodToCover(false, false, true, false, false)
  }
