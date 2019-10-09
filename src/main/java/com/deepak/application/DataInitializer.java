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
            Lanaguage language = new Lanaguage();
            language.setName("Java");
            languageRepository.save(language);

            language = new Lanaguage();
            language.setName("JavaScript");
            languageRepository.save(language);

            language = new Lanaguage();
            language.setName("C++");
            languageRepository.save(language);

            language = new Lanaguage();
            language.setName("Groovy");
            languageRepository.save(language);

            language = new Lanaguage();
            language.setName("Python");
            languageRepository.save(language);

            language = new Lanaguage();
            language.setName("Swift");
            languageRepository.save(language);



        }
        catch (Exception ex){
            logger.error("exception in databa" ,ex);
        }



    }
}
