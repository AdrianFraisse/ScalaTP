package complex

/**
 * Created by Adrian on 03/04/15.
 */
class Angle(radians: Double) {
  val theta = radians - 2 * Math.PI * Math.floor(radians / (2 * Math.PI))

  def angle: Double = return this.theta

  def +(a: Angle): Angle = return new Angle(a.angle + this.angle)

  def *(k: Double): Angle = return new Angle(k * this.angle)

}
