package org.jfcmc.sprstahere.chap09.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {
    private int count;

    public void increment() {
	count++;
    }

    public int getCount() {
	return count;
    }
}
