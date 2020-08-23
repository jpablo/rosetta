package rosetta.logic

object PropositionalCalculus {

  enum Prop {
    case Sym(s: String)
    case And(x: Prop, y: Prop)
    case Or(x: Prop, y: Prop)
    case Implies(x: Prop, y: Prop)
    case Not(x: Prop)
    case object TrueP
    case object FalseP
  }

  import Prop._

  def (x: Prop) <-> (y: Prop): Prop =
    And(Implies(x, y), Implies(y, x))

}


