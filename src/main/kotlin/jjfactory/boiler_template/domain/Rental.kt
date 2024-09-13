package jjfactory.boiler_template.domain

import java.time.LocalDate

class Rental(
    val userId: Long,
    val isbn: String,
    var status: Status = Status.NORMAL,
    val startDate: LocalDate = LocalDate.now(),
    val dueDate: LocalDate = LocalDate.now().plusDays(3),
    var returnDate: LocalDate? = null,
    var cancelDate: LocalDate? = null,
) {
    enum class Status {
        NORMAL, RETURNED, CANCELED
    }

    fun returnBook(){
        if (status == Status.NORMAL) {
            status = Status.RETURNED
            returnDate = LocalDate.now()
        }
    }

    fun cancel(){
        if (status == Status.NORMAL) {
            status = Status.CANCELED
            cancelDate = LocalDate.now()
        }
    }

    fun isReturned(): Boolean {
        return status == Status.RETURNED
    }

    fun isCanceled(): Boolean {
        return status == Status.CANCELED
    }

}