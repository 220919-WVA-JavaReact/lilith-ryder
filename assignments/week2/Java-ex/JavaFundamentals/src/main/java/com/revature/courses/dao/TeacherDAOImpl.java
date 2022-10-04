package com.revature.courses.dao;

import com.revature.courses.models.Teacher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TeacherDAOImpl implements TeacherDAO{

    @Override
            public Teacher getByUsername(String username) {
    String line = "";
    String splitBy = ",";

    try{
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/teachers.csv"));

        while ((line = br.readLine()) != null)
        {
            String[] info = line.split(splitBy);

            if (info[3].equals(username)){
                //int id = Integer.parseInt(info[0]);
                return new Teacher(info[1], info[2], info[3], info[4]);
            }

        }
    } catch (IOException e){
        e.printStackTrace();
    }

        return null;
    }
}
