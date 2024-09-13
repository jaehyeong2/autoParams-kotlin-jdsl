package jjfactory.boiler_template.domain

class User(
    var email: String,
    var name: String,
    var phone: String
) {
    var age: Int = 20

    fun modifyEmail(email: String){
        this.email = email
    }

    fun modify(email: String?, name: String?, age: Int?){
        email?.let { this.email = email }
        name?.let { this.name = name }
        age?.let { this.age = age }
    }

}