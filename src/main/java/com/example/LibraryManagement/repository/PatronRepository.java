package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Long> {}
