fun main() {
    var emp1 = Employee(1,"John Smith",1,10.0,"11/04/99",PositionTitle.ADMINISTRATION.sVer,true)
    emp1.calPay(45.0)
    var emp2 = Employee(2,"Jane Smith",2,10.0,"11/04/99",PositionTitle.SALES.sVer,false)
    emp2.calPay(50.0)
    var emp3 = Employee(3,"Jonny Smith",3,10.0,"11/04/99",PositionTitle.SECRETARIAL.sVer,false)
    emp3.calPay(35.0)
}
