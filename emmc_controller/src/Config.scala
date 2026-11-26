package emmc_controller

import spinal.core._
import spinal.core.sim._

object Config {
  def spinal = SpinalConfig(
    targetDirectory = sys.props.getOrElse(
      "spinalTargetDir",
      "emmc_controller/gen"
    ),
    defaultConfigForClockDomains = ClockDomainConfig(
      resetActiveLevel = HIGH
    ),
    onlyStdLogicVectorAtTopLevelIo = false
  )

  def sim = SimConfig.withGhdl.withConfig(spinal).withFstWave
}
