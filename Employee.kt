import java.text.DecimalFormat

class Employee(
    var empNum: Int,
    var empName: String,
    var empShift: Int,
    var payRate: Double,
    var startDate: String,
    var position: String,
    var salary:Boolean
) {
    val twoDigits = DecimalFormat("$####.00")
    var payMod = 1.00
    init {

        if(empShift == 2){payMod = 1.05}
        if (empShift == 3){payMod = 1.10}

    }

    fun calPay(hoursWorked:Double) {
        var pay = 0.00
        if (hoursWorked <= 40) {
            pay = (hoursWorked * payRate) * payMod
        } else {
            var ot = hoursWorked - 40
            pay = (((hoursWorked - ot) * payRate) + (ot * payRate) * 1.5) * payMod
        }
        println("The employee $empName of the position $position with the pay rate of $payRate earned ${twoDigits.format(pay)}")
    }}



