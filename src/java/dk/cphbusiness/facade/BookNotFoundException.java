/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.facade;

/**
 *
 * @author sofus
 */
public class BookNotFoundException extends Exception {

    public BookNotFoundException(String no_book_with_that_ISBN) {
    }
    
}
