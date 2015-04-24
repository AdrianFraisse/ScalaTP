package src.complex

import java.lang.Math._

/**
 * Created by Adrian on 03/04/15.
 */
object Conversion {

  def real(radius: Double, azimuth: Angle) =
    radius * cos(azimuth.angle)

  def imag(radius: Double, azimuth: Angle): Double =
    radius * sin(azimuth.angle)

  def radius(real: Double, imag: Double): Double =
    sqrt(real * real + imag * imag)

  def azimuth(real: Double, imag: Double): Angle =
    new Angle(atan2(imag, real))

}
