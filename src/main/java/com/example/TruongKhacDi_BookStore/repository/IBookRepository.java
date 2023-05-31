package com.example.TruongKhacDi_BookStore.repository;

import com.example.TruongKhacDi_BookStore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
