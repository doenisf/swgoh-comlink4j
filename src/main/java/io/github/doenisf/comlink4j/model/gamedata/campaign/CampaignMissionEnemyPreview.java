package io.github.doenisf.comlink4j.model.gamedata.campaign;

import io.github.doenisf.comlink4j.model.gamedata.enums.*;
import io.github.doenisf.comlink4j.model.gamedata.item.BucketItem;
import lombok.Getter;

@Getter
public class CampaignMissionEnemyPreview {
    private BucketItem baseEnemyItem;
    private Integer enemyLevel;
    private UnitTier enemyTier;
    private ThreatLevel threatLevel;
    private String thumbnailName;
    private String prefabName;
    private Boolean displayedEnemy;
    private UnitClass unitClass;
    private ForceAlignment enemyForceAlignment;
    private RelicTier enemyRelicTier;
    private Integer zetaCount;
    private Boolean isGalacticLegend;
    private Boolean isUltimateUnlocked;
    private Integer omicronCount;
}
