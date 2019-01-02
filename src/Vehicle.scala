class Vehicle (val hubraum: Int, val kennzeichen: String) {
  require(hubraum >0 && kennzeichen !=null &&kennzeichen!="")

  def getKfzSteuer() : Int ={
    hubraum/100*5
  }

  override def  toString():String={
    "Das Auto mit dem Kennzeichen "+ kennzeichen + " besitzt "+ hubraum+ " ccm"
  }



}