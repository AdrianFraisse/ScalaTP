package complex

/**
 * Created by Adrian on 03/04/15.
 */
class CarComplex(val real: Double, val imag: Double) {

  def ++(c: CarComplex) = new CarComplex(real + c.real, imag + c.imag)

  override def equals(o: Any) = {
    def equals_(c: CarComplex) =
      Comparison.isEqual(real, c.real) && Comparison.isEqual(imag, c.imag)
    if (o.isInstanceOf[CarComplex]) equals_(o.asInstanceOf[CarComplex])
    else if (o.isInstanceOf[PolComplex]) equals_(o.asInstanceOf[PolComplex])
    else false;

  }
}

object CarComplex {
  implicit def car2pol(c: CarComplex) =
    new PolComplex(Conversion.radius(c.real, c.imag),
      Conversion.azimuth(c.real, c.imag))
}

