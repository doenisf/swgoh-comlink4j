package io.github.doenisf.comlink4j.model.gamedata.definition;

import io.github.doenisf.comlink4j.model.gamedata.misc.category.EntryCategoryAllowed;
import io.github.doenisf.comlink4j.model.gamedata.enums.UnitGuideActivityType;
import io.github.doenisf.comlink4j.model.gamedata.misc.CampaignElementIdentifier;
import lombok.Getter;

@Getter
public class UnitGuideDefinition {
    private String unitBaseId;
    private UnitGuideActivityType type;
    private String activityId;
    private String descriptionKey;
    private String recommendationRequirementId;
    private String overrideTexture;
    private String titleKey;
    private String subtitleKey;
    private String additionalActivationRequirementId;
    private Boolean displayEnabled;
    private String actionLinkImage;
    private String actionLink;
    private Boolean inPreview;
    private Integer hiddenUnitCost;
    private String previewArtImage;
    private String upcomingEventKey;
    private Boolean featured;
    private CampaignElementIdentifier campaignElementIdentifier;
    private EntryCategoryAllowed characterRecommendedEntryCategory;
    private EntryCategoryAllowed shipRecommendedEntryCategory;
    private Boolean galacticLegend;
    private String bannerImage;
    private String bannerImageSubtextKey;
    private String unitStagePrefab;
}
