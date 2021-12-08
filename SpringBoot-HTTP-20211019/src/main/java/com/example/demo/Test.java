package com.example.demo;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.example.demo.entity.Article;

public class Test {
    public static void main(String[] args) {
        try {
            Reader reader = new Reader();
            List<Article> result = reader.getList("Gossiping");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
