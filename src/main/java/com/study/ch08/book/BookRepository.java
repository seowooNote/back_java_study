package com.study.ch08.book;

public class BookRepository {
    final Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }

    int getEmptyIndex() {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getEmptyIndex()] = book;
    }

    Book[] getBookDatas() {
        int bookCount = 0;
        for(int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                bookCount++;
            }
        }

        int j = 0;
        Book[] newBooks = new Book[bookCount];
        for(int i = 0; i < newBooks.length; i++) {
            if(books[i] != null) {
                newBooks[j] = books[i];
                j++;
            }
        }

        return newBooks;
    }


}
