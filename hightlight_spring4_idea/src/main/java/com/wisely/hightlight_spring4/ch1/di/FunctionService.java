package com.wisely.hightlight_spring4.ch1.di;


import org.springframework.stereotype.Service;

/**
 * Created by RFB on 2016/5/3.
 */

@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello "+word+" !";
    }
}
