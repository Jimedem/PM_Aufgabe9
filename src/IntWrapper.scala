class IntWrapper (val i:Int) {
    def +(v:Vehicle)= v+i
}

object IntWrapper{
  implicit def intToIntWrapper(i:Int): IntWrapper=new IntWrapper(i)
}
