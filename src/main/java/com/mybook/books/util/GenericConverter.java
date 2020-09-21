package com.mybook.books.util;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.mybook.books.entity.BookEntity;
import com.mybook.books.model.Book;

public interface GenericConverter<D extends Book, E extends BookEntity> {

    E createFrom(D dto);

    D createFrom(E entity);

    E updateEntity(E entity, D dto);

    default List<D> createFromEntities(final Collection<E> entities) {
        return entities.stream()
                .map(this::createFrom)
                .collect(Collectors.toList());
    }

    default List<E> createFromDtos(final Collection<D> dtos) {
        return dtos.stream()
                .map(this::createFrom)
                .collect(Collectors.toList());
    }

}