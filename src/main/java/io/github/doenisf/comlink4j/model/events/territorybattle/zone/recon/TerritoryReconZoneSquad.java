package io.github.doenisf.comlink4j.model.events.territorybattle.zone.recon;

import lombok.Getter;

import java.util.List;

@Getter
public class TerritoryReconZoneSquad {
    private String id;
    private List<TerritoryReconZoneUnit> unit;
}