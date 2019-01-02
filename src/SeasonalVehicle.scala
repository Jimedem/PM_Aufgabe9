class SeasonalVehicle (private val hubraum:Int, private val kennzeichen:String,private val startmonat:Int,private val endmonat:Int) extends Vehicle(hubraum, kennzeichen){
  require (hubraum > 0 && kennzeichen != "" || kennzeichen !=null  )

  override def getKfzSteuer(): Int = hubraum/100*2




}