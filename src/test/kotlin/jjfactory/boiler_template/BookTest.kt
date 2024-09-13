package jjfactory.boiler_template

import com.navercorp.fixturemonkey.FixtureMonkey
import com.navercorp.fixturemonkey.kotlin.KotlinPlugin
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookTest {

    @Test
    fun `fixtureMonkey로 Book 생성하면 필드들이 null이 아니다`() {
        val fixtureMonkey = FixtureMonkey.builder()
            .plugin(KotlinPlugin())
            .build()

        val book = fixtureMonkey.giveMeOne(Book::class.java)
        assertThat(book.author).isNotNull()
    }
}