package complex

/**
 * Created by Adrian on 03/04/15.
 */
trait Polar {
  def radius: Double
  def azimuth: Angle

  def *(c: Complex) : Complex =
    Complex(radius * c.radius, azimuth + c.azimuth)

  def inverse() : Complex =
    Complex(1/radius, azimuth.*(-1))
}
