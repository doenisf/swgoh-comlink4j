package io.github.doenisf.comlink4j.model.gamedata.dialog;

import lombok.Getter;

import java.util.List;

@Getter
public class CharacterDialog {
    private String characterPrefab;
    private List<String> animations;
    private String audioKey;
    private String layout;
    private Boolean useHologramEffect;
}
