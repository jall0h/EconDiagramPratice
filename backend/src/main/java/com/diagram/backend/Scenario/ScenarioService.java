package com.diagram.backend.Scenario;

import org.springframework.stereotype.Service;

@Service
public class ScenarioService {

    public Scenario getNewScenario() {
        return new Scenario(1l,"short desc", "macro");
    }

}
