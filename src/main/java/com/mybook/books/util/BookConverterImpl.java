package com.mybook.books.util;

import org.springframework.stereotype.Component;

import com.mybook.books.entity.BookEntity;
import com.mybook.books.model.Book;

@Component
public class BookConverterImpl implements BookConverter {

    @Override
    public BookEntity createFrom(Book dto) {
    	BookEntity entity = new BookEntity();
        updateEntity(entity, dto);
        return entity;
    }

    @Override
    public Book createFrom(BookEntity entity) {
    	Book dto = new Book();
        if (entity != null) {
            dto.setIsbn(entity.getIsbn()); 
            dto.setTitle(entity.getTitle());
            dto.setPublishYear(entity.getPublishYear());
            //TODO dto.setAuthor(entity.getAuthor());
        }
        return dto;
    }

    @Override
    public BookEntity updateEntity(BookEntity entity, Book dto) {
        if (entity != null && dto != null) {
            //TODO
        	entity.setIsbn(dto.getIsbn());
        	entity.setTitle(dto.getTitle());
           
        }
        return entity;
    }

}