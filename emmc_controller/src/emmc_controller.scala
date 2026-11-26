
package emmc_controller // Defines the package to which this controller belongs

import spinal.core._ // Imports the SpinalHDL hardware design library

// Defines the eMMC controller as a hardware component
case class emmc_controller() extends Component {

  // Defines the input and output interface of the controller
  val io = new Bundle {

    val clk   = in Bool()  // Clock input for synchronous hardware operation
    val reset = in Bool()  // Reset input to initialize the controller
    val start = in Bool()  // Input signal to request the controller to start

    val busy  = out Bool() // Output indicating that the controller is busy
    val done  = out Bool() // Output indicating that an operation is complete
  }

  // Temporary default assignments for the initial controller skeleton
  io.busy := False // Currently, the busy output is always LOW
  io.done := False // Currently, the done output is always LOW
}

// Application used to generate VHDL from the SpinalHDL component
object genvhdl extends App {

  // Uses the SpinalHDL configuration to generate VHDL
  Config.spinal.generateVhdl(emmc_controller())
}

