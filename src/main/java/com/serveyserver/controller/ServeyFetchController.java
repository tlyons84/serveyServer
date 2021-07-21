package com.serveyserver.controller;

import com.serveyserver.servey.QuestionObj;
import com.serveyserver.servey.ServeyObj;

import java.util.ArrayList;

public class ServeyFetchController {
    public QuestionObj getAQuestion(){
        QuestionObj question  = new QuestionObj();

        return question;
    }

    public ArrayList <QuestionObj> fetcQuestions (){
        ArrayList<QuestionObj> questionObjs = new ArrayList<>();

        return questionObjs;
    }

    public ServeyObj fetchServey(){
        ServeyObj  serveyObj = new ServeyObj();

        return serveyObj;
    }

    public  ArrayList<ServeyObj> fetchServeys(){
        ArrayList<ServeyObj> serveyObjs = new ArrayList<>();
        return serveyObjs;

    }
}
