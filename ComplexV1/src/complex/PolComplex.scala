package complex

/**
 * Created by Adrian on 10/04/15.
 */
class PolComplex(val radius: Double, val azimuth: Angle) extends AbsComplex {

  def this(real: Double, imag: Double) =
    this(Conversion.radius(real, imag), Conversion.azimuth(real, imag))

  def create(real: Double, imag: Double): Complex =
    new PolComplex(real, imag)

  def create(radius: Double, azimuth: Angle): Complex =
    new PolComplex(radius, azimuth)

  def real: Double = Conversion.real(radius, azimuth)

  def imag: Double = Conversion.imag(radius, azimuth)

}
