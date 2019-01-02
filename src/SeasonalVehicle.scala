 class SeasonalVehicle (hubraum:Int, kennzeichen:String, val startmonat:Int, val endmonat:Int, steuerF:(Int, Int)=> Int) extends Vehicle(hubraum, kennzeichen ){
  require (hubraum > 0 && kennzeichen != "" || kennzeichen !=null  )


  def this(hubraum:Int, kennzeichen:String, startmonat:Int,endmonat:Int)={
    this(hubraum, kennzeichen, startmonat, endmonat, (x,y)=> x/100*2)
  }


  override def getKfzSteuer(): Int={
    if(startmonat < endmonat)
      steuerF(hubraum, endmonat-startmonat)
    else
      steuerF(hubraum, startmonat-endmonat)

  }
}