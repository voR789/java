class Practice {
    /*fun main() {
        val morningNotification = 51
        val eveningNotification = 135

        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)
    }


    fun printNotificationSummary(numberOfMessages: Int) {
        println(
            if(numberOfMessages >= 100)
        	    "Your phone is blowing up! You have 99+ notifications."
            else
        	    "You have $numberOfMessages notifications."
        )
    }*/

    /*fun main() {
        val child = 5
        val adult = 28
        val senior = 87

        val isMonday = true

        println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
        println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
        println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    }

    fun ticketPrice(age: Int, isMonday: Boolean): Int {
        when(age){
            in 0..12 -> return 15
            in 13..60 -> if(isMonday) return 25 else return 30
            in 61..100 -> return 20
        }
        return -1
    }*/

    /*fun main() {
        printFinalTemperature(27.0,"Celcius", "Fahrenheit", {(9.0/5.0)*it+32})
        printFinalTemperature(350.0,"Kelvin", "Celcius", {it-273.15})
        printFinalTemperature(10.0,"Fahrenheit", "Kelvin", {(5.0/9.0)*(it-32)+273.15})
    }


    fun printFinalTemperature(
        initialMeasurement: Double,
        initialUnit: String,
        finalUnit: String,
        conversionFormula: (Double) -> Double
    ) {
        val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
    }*/

    /*class Song(val inputTitle: String, val inputArtist: String, val inputYearPublished: Int, val inputPlayCount: Int){
        private val popular: Boolean = inputPlayCount >= 1000

        fun description(){
            println("$inputTitle, performed by $inputArtist, was released in $inputYearPublished")
        }
    }

    fun main(){
        val song1 = Song("Devil in A New Dress", "Kanye West", 2010, 3000000)
        song1.description()
    }*/

    /*fun main() {
        val amanda = Person("Amanda", 33, "play tennis", null)
        val atiqah = Person("Atiqah", 28, "climb", amanda)
        val jeremy = Person("Jerermy",56,null,atiqah)

        amanda.showProfile()
        atiqah.showProfile()
        jeremy.showProfile()
    }


    class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
        fun showProfile() {
            println("Name: $name")
            println("Age: $age")
            if(hobby != null)
                print("Likes to $hobby. ")
            else
                print("Has no hobby. ")
            if(referrer != null){
                print("Has a referrer named ${referrer.name}")
                if(referrer.hobby != null)
                    println(", who likes to ${referrer.hobby}\n")
                else
                      println(".\n")
            }
            else
                println("Doesn't have a referrer\n")
        }
    }*/

    /*open class Phone(var isScreenLightOn: Boolean = false){
        open fun switchOn() {
            isScreenLightOn = true
            println("Phone is on.")
        }

        open fun switchOff() {
            isScreenLightOn = false
            println("Phone is off.")
        }

        fun checkPhoneScreenLight() {
            val phoneScreenLight = if (isScreenLightOn) "on" else "off"
            println("The phone screen's light is $phoneScreenLight.")
        }
    }

    class FoldablePhone(var isFolded: Boolean = true): Phone(){
        override fun switchOn(){
            if(!isFolded){
                super.isScreenLightOn = true
                println("Phone is on.")
            }

            else
                println("Phone screen is folded, phone cannot be switched on.")
        }

        override fun switchOff(){
               super.switchOff()
        }

           fun foldOpen(){
            isFolded = false
            println("Phone is open.")
        }

        fun foldClosed(){
            isFolded = true
            println("Phone is closed.")
        }
    }

    fun main(){
        val foldPhone = FoldablePhone()
        foldPhone.switchOn()
        foldPhone.switchOff()
        foldPhone.foldOpen()
        foldPhone.switchOn()
    }*/

    /*fun main() {
        val winningBid = Bid(5000, "Private Collector")

        println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
        println("Item B is sold at ${auctionPrice(null, 3000)}.")
    }

    class Bid(val amount: Int, val bidder: String)

    fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
       return bid?.amount ?: minimumPrice
    }*/


}