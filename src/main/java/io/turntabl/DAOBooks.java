package io.turntabl;

import java.sql.SQLException;

public interface DAOBooks {
    public void addBook(Books book) throws SQLException, ClassNotFoundException;
    public Books getBookByTitle (String title);
    public void deleteBook (String title);
    public void updateBook (Books book);
}
