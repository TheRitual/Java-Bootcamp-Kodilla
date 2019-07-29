package com.kodilla.stream.book;

import java.util.Objects;

public final class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String signature;

    Book(final String title, final String author, final int publicationYear, final String signature) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", signature='" + signature + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSignature() {
        return signature;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
