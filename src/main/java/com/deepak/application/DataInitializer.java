package com.deepak.application;

import com.deepak.app.dao.Lanaguage;
import com.deepak.app.repository.ILanguageRepository;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class DataInitializer {

    private final Logger logger = LoggerFactory.getLogger((DataInitializer.class));

    @Autowired
    ILanguageRepository languageRepository;

    public void initData(){

        try{
            Lanaguage lanaguage = new Lanaguage();
            lanaguage.setName("Java");
            languageRepository.save(lanaguage);

            

        }
        catch (Exception ex){
            logger.error("exception in databa" ,ex);
        }



    }
}
