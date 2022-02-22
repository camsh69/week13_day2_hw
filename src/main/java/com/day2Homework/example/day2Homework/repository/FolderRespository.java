package com.day2Homework.example.day2Homework.repository;

import com.day2Homework.example.day2Homework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRespository extends JpaRepository<Folder, Long> {
}
