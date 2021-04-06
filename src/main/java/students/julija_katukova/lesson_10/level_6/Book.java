package students.julija_katukova.lesson_10.level_6;

import java.util.Objects;

class Book {
    private final String title;
    private final String author;
    private boolean markAsRead;
    private boolean markAsUnread;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isMarkAsRead() {
        return markAsRead;
    }

    public void setMarkAsRead(boolean markAsRead) {
        this.markAsRead = markAsRead;
    }

    public boolean isMarkAsUnread() {
        return markAsUnread;
    }

    public void setMarkAsUnread(boolean markAsUnread) {
        this.markAsUnread = markAsUnread;
    }

    @Override
    public String toString() {
        return title + " [" + author + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}