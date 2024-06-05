package io.github.doenisf.comlink4j.model.gamedata.environment;

import lombok.Getter;

import java.util.List;

@Getter
public class EnvironmentCollection {
    private String id;
    private List<Environment> battleEnvironment;
}
