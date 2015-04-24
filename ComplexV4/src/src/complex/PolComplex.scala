package src.complex

/**
 * Created by Adrian on 10/04/15.
 */
class PolComplex(val radius: Double, val azimuth: Angle) extends Complex {

  def real: Double = Conversion.real(radius, azimuth)

  def imag: Double = Conversion.imag(radius, azimuth)

  override def toString = "(" + radius + "e^ i" + azimuth + ")"

  override def equals(o: Any) =
    if (!o.isInstanceOf[Complex]) false
    else {
      val e = o.asInstanceOf[Complex]
      Comparison.isEqual(radius, e.radius) && azimuth.equals(e.azimuth)
    }
}
