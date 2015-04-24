package complex

/**
 * Created by Adrian on 10/04/15.
 */
class PolComplex(val radius: Double, val azimuth: Angle) {

  def *(p: PolComplex) = new PolComplex(radius * p.radius, azimuth + p.azimuth)

  override def equals(o: Any) = {
    def equals_(p: PolComplex) =
      Comparison.isEqual(radius, p.radius) && Comparison.isEqual(azimuth.angle, p.azimuth.angle)
    if (o.isInstanceOf[PolComplex]) equals_(o.asInstanceOf[PolComplex])
    else if (o.isInstanceOf[CarComplex]) equals_(o.asInstanceOf[CarComplex])
    else false;
  }

}

object PolComplex {
  implicit def pol2Car(pol: PolComplex): CarComplex =
    new CarComplex(Conversion.real(pol.radius, pol.azimuth),
      Conversion.imag(pol.radius, pol.azimuth))
}
