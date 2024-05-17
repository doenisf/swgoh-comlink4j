package de.sf.commlink4j.model.events.raid;

import lombok.Getter;

import java.util.List;

@Getter
public class BattleUnitState {
    private String unitId;
    private String healthPercent;
    private List<BattleUnitAbilityState> abilityState;
    private Boolean progressItem;
    private Long currentHealth;
    private String shieldPercent;
    private String turnPercent;
    private Long maxHealth;
    private Boolean hasFled;
    private Long maxShield;
    private Boolean isCommander;
    private Boolean isDeployed;
    private Long currentShield;
    private Boolean overkillItem;
    private Long overkillDamage;
    private Long battleContextMaxShield;
    private Boolean isUnscathed;
}
