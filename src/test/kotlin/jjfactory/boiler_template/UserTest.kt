package jjfactory.boiler_template

import autoparams.AutoSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest

class UserTest {

    @ParameterizedTest
    @AutoSource
    fun `@autoSource 이용 시 매개변수로 설정한 파라미터에 랜덤값 들어감`(newEmail: String) {
        val user = User(email = "wogud2@naver.com", name = "lee", phone = "01012331233")

        user.modifyEmail(newEmail)
        assertThat(user.email).isEqualTo(newEmail)
    }

    @ParameterizedTest
    @AutoSource
    fun `@autoSource 이용 시 매개변수로 설정한 파라미터에 랜덤값 들어감2`(newEmail: String, newName: String, newAge: Int) {
        val user = User(email = "wogud2@naver.com", name = "lee", phone = "01012331233")

        user.modify(newEmail, newName, newAge)

        println("newEmail = ${newEmail}")
        println("newName = ${newName}")
        println("newAge = ${newAge}")

        assertThat(user.email).isEqualTo(newEmail)
        assertThat(user.name).isEqualTo(newName)
        assertThat(user.age).isEqualTo(newAge)
    }

}

