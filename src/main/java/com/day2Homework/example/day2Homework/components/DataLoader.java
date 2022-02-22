package com.day2Homework.example.day2Homework.components;

import com.day2Homework.example.day2Homework.models.File;
import com.day2Homework.example.day2Homework.models.Folder;
import com.day2Homework.example.day2Homework.models.User;
import com.day2Homework.example.day2Homework.repository.FileRepository;
import com.day2Homework.example.day2Homework.repository.FolderRespository;
import com.day2Homework.example.day2Homework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRespository folderRespository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }


    @Override
    public void run(ApplicationArguments args)  {
        User user = new User("Joe Bloggs");
        userRepository.save(user);

        Folder folder1 = new Folder("Documents",user);
        folderRespository.save(folder1);

        Folder folder2 = new Folder("Pictures", user);
        folderRespository.save(folder2);

        File file1 = new File("CV", "pdf", 3, folder1);
        fileRepository.save(file1);

        File file2 = new File("Cover Letter", "doc", 4, folder1);

        File file3 = new File("Holiday Snap", "jpeg", 6, folder2);
        fileRepository.save(file3);

        File file4 = new File("Party Snap", "jpeg", 5, folder2);
        fileRepository.save(file4);




    }
}
