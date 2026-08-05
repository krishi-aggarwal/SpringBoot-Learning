package com.app.demo.springbootlearning;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class BeanLifecycle {

    public BeanLifecycle(){
        System.out.println("Constructor Called");
    }

    @PostConstruct
    public void BeanInit(){
        System.out.println("Bean Initialized");
    }

    public void BeanWork(){
        System.out.println("Bean did Work!");
    }

    @PreDestroy
    public void BeanDestroy(){
        System.out.println("Bean Destroyed!");
    }
}
