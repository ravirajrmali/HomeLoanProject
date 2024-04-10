package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DocumentUpload;

@Repository
public interface DocumentUploadRepository extends CrudRepository<DocumentUpload, Integer> {

}
