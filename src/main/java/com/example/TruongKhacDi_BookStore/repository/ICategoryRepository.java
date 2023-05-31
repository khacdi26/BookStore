package com.example.TruongKhacDi_BookStore.repository;

import com.example.TruongKhacDi_BookStore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}