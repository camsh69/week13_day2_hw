package com.day2Homework.example.day2Homework;

import com.day2Homework.example.day2Homework.models.Folder;
import com.day2Homework.example.day2Homework.models.User;
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

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserAndFolder(){
		User user = new User("Joe Bloggs");
		userRepository.save(user);

		Folder folder1 = new Folder("Documents", user);
		folderRespository.save(folder1);
	}

}
