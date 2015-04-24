package complex

/**
 * Created by Adrian on 03/04/15.
 */
trait Complex extends CartesianPolar with Field[Complex] {}

object Complex {

  // Il faut préciser qu'on retourne un Complex sinon on rend visibles les classes privées
  def apply(real: Double, imag: Double): Complex = new CarComplex(real, imag)
  def apply(radius: Double, azimuth: Angle): Complex = new PolComplex(radius, azimuth)

  private class CarComplex(val real: Double, val imag: Double) extends Complex {

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

  private class PolComplex(val radius: Double, val azimuth: Angle) extends Complex {

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
}
