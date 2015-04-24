package complex

/**
 * Created by Adrian on 03/04/15.
 */
abstract class AbsComplex extends Complex {

  def +(c: Complex): Complex =
    create(real + c.real, imag + c.imag)

  def *(c: Complex): Complex =
    create(radius * c.radius, azimuth + c.azimuth)

  override def toString = "(" + real + ", " + imag + ")"

  override def equals(o: Any) =
    if (!o.isInstanceOf[Complex]) false
    else {
      val e = o.asInstanceOf[Complex]
      Comparison.isEqual(real, e.real) && Comparison.isEqual(imag, e.imag)
    }

}
