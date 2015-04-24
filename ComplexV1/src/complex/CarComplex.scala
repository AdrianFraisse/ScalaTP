package complex

/**
 * Created by Adrian on 03/04/15.
 */
class CarComplex(val real: Double, val imag: Double) extends AbsComplex {

  def this(radius: Double, azimuth: Angle) =
    this(Conversion.real(radius, azimuth),
        Conversion.imag(radius, azimuth))

  def create(real: Double, imag: Double) =
    new CarComplex(real, imag)

  def create(radius: Double, azimuth: Angle) =
    new CarComplex(radius, azimuth)

  def radius: Double = Conversion.radius(real, imag)

  def azimuth: Angle = Conversion.azimuth(real, imag)
}
