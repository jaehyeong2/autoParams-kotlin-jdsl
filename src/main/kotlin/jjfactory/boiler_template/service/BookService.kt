package jjfactory.boiler_template.service

import jjfactory.boiler_template.domain.Book

class BookService {
    fun getBook(isbn: String): Book {
        return Book(
            isbn = isbn,
            title = "title",
            description = "dummy",
            author = "kim",
            publisher = "test publisher",
            year = 2020
        )
    }
}