package com.mybook.books.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mybook.books.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{

}
