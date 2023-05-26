package org.jfcmc.sprstahere.chap02;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public void setName(String name) {
        this.name = name;
    }
}
