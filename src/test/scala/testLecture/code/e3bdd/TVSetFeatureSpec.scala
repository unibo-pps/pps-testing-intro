package testLecture.code.e3bdd

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec

class TVSet:
  private var on: Boolean = false
  def isOn: Boolean = on
  def pressPowerButton(): Unit =
    on = !on

class TVSetSpec extends AnyFeatureSpec with GivenWhenThen:
  info("As a TV set owner")
  info("I want to be able to turn the TV on and off")
  info("So I can watch TV when I want")
  info("And save energy when I'm not watching TV")

  Feature("TV power button") {
    Scenario("User presses power button when TV is off") {
      Given("a TV set that is switched off")
      val tv = new TVSet
      assert(!tv.isOn)

      When("the power button is pressed")
      tv.pressPowerButton()

      Then("the TV should switch on")
      assert(tv.isOn)
    }
  }

  Scenario("User presses power button when TV is on") { pending }
end TVSetSpec
