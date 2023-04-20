package com.epam.mjc.io;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        String[] data = new String[4];
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(file))){
            String line = null;
            int i = 0;
            while((line=br.readLine())!=null) {
                data[i] = line.split(": ")[1];
                i++;
            }
        } catch (FileNotFoundException e){

        } catch (IOException e){

        }
        profile.setName(data[0]);
        profile.setAge(Integer.parseInt(data[1]));
        profile.setEmail(data[2]);
        profile.setPhone(Long.parseLong(data[3]));
        return profile;
    }
}
