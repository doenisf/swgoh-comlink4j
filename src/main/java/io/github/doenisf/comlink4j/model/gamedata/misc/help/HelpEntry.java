package io.github.doenisf.comlink4j.model.gamedata.misc.help;

import io.github.doenisf.comlink4j.model.gamedata.enums.HelpType;
import lombok.Getter;

import java.util.List;

@Getter
public class HelpEntry {
    private HelpType id;
    private List<HelpTile> tile;
}
