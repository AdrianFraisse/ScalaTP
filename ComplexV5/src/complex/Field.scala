package complex

/**
 * Created by Adrian on 24/04/15.
 *
 * Trait d'un corps
 */
trait Field[T] {

  def +(e: T): T
  def *(e: T): T

  val zero: T
  val un: T

  def ^(i: Int): T = {
    require(i >= 0)
    if (i == 0) un
    else this * (this ^ (i - 1))
  }

}
