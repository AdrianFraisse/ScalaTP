package complex

/**
 * Created by Adrian on 03/04/15.
 */
trait Complex extends Cartesian with Polar {}

object Complex {
  def apply(real: Double, imag: Double) = new CarComplex(real, imag)
  def apply(radius: Double, azimuth: Angle) = new PolComplex(radius, azimuth)
}
