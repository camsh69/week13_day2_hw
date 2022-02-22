package com.day2Homework.example.day2Homework;

import com.day2Homework.example.day2Homework.models.File;
import com.day2Homework.example.day2Homework.models.Folder;
import com.day2Homework.example.day2Homework.models.User;
import com.day2Homework.example.day2Homework.repository.FileRepository;
import com.day2Homework.example.day2Homework.repository.FolderRespository;
import com.day2Homework.example.day2Homework.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day2HomeworkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRespository folderRespository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserAndFolderAndFile(){
		User user = new User("Joe Smith");
		userRepository.save(user);

		Folder folder1 = new Folder("Documents", user);
		folderRespository.save(folder1);

		File file1 = new File("CV", "pdf", 5, folder1);
		fileRepository.save(file1);
	}

}
