package com.revature.courses.service;

import com.revature.courses.dao.TeacherDAO;
import com.revature.courses.dao.TeacherDAOImpl;
import com.revature.courses.models.Teacher;

public class TeacherService {
    TeacherDAO td = new TeacherDAOImpl();

    public void login(String username, String password){

        //Call DB and find info

        Teacher teach = td.getByUsername(username);
        //Check returned password against entered password.
        if(teach.getPassword().equals(password)) {
            System.out.println("congrats, you've logged in!");
        } else{
            System.out.println("Invalid credentials");
        }

    }

}
