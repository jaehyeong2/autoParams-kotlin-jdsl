package jjfactory.boiler_template.domain

class Book(
    var isbn: String,
    var title: String,
    var description: String,
    var author: String,
    var publisher: String,
    var year: Int,
    var rentalCnt: Int = 0
) {

    fun increaseRentalCount(){
        rentalCnt++
    }
}