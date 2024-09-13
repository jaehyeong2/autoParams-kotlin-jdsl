package jjfactory.boiler_template

import com.navercorp.fixturemonkey.FixtureMonkey
import com.navercorp.fixturemonkey.kotlin.KotlinPlugin
import com.navercorp.fixturemonkey.kotlin.setExp
import jjfactory.boiler_template.domain.Book
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

    @Test
    fun `giveMeBuilder와 set으로 특정필드 specific하게 설정가능`() {
        val fixtureMonkey = FixtureMonkey.builder()
            .plugin(KotlinPlugin())
            .build()

        val book = fixtureMonkey.giveMeBuilder(Book::class.java)
            .setExp(Book::author, "kim")
            .sample()

        assertThat(book.author).isEqualTo("kim")
    }

    @Test
    fun `book n개 생성`() {
        val fixtureMonkey = FixtureMonkey.builder()
            .plugin(KotlinPlugin())
            .build()

        val books = fixtureMonkey.giveMe(Book::class.java, 5)

        assertThat(books.size).isEqualTo(5)
    }

}