package com.buutcamp.sringdemo.main;

import com.buutcamp.sringdemo.beans.SearchAlgorithm;
import com.buutcamp.sringdemo.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {


    public RunApp() {
        int[] numbersToSearch = {1, 2, 4, 7, 13, 26, 48, 57, 96, 128, 146, 167};

        ApplicationContext appCtx = new
                AnnotationConfigApplicationContext(AppConfig.class);
        SearchAlgorithm searchImpl =
                appCtx.getBean("BinarySearch",SearchAlgorithm.class);

        if (searchImpl.find(4, numbersToSearch)){
            System.out.println("The number is found");
        } else {
            System.out.println("The number is not in the list");
        }

        ((AnnotationConfigApplicationContext) appCtx).close();
    }

}
