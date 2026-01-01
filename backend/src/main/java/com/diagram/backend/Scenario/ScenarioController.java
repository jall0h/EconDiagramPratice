package com.diagram.backend.Scenario;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScenarioController {
    private ScenarioService scenarioService;

    public ScenarioController(ScenarioService scenarioService) {
        this.scenarioService = scenarioService;
    }
    @GetMapping("/scenario")
    public ResponseEntity<Scenario> getScenario() {
        return ResponseEntity.ok().body(scenarioService.getNewScenario());
    }
}
