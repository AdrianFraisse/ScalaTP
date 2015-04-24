package src.complex

/**
 * Created by Adrian on 03/04/15.
 */
class CarComplex(val real: Double, val imag: Double) extends Complex {

  def radius: Double = Conversion.radius(real, imag)

  def azimuth: Angle = Conversion.azimuth(real, imag)

  override def toString = real + "i" + imag

  override def equals(o: Any) =
    if (!o.isInstanceOf[Complex]) false
    else {
      val e = o.asInstanceOf[Complex]
      Comparison.isEqual(real, e.real) && Comparison.isEqual(imag, e.imag)
    }
}
