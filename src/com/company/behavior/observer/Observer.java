package com.company.behavior.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
