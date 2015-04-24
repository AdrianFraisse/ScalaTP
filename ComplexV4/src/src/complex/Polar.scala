package src.complex

/**
 * Created by Adrian on 03/04/15.
 */
trait Polar {
  def radius: Double
  def azimuth: Angle
  val un = Polar.un;

  def *(c: Complex) : Complex =
    Complex(radius * c.radius, azimuth + c.azimuth)

  def inverse() : Complex =
    Complex(1/radius, azimuth.*(-1))
}

object Polar {
  val un = Complex(1, new Angle(0))
}
