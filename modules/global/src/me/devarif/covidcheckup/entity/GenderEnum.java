package me.devarif.covidcheckup.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum GenderEnum implements EnumClass<Integer> {

    MALE(10),
    FEMALE(20),
    OTHER(30);

    private Integer id;

    GenderEnum(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static GenderEnum fromId(Integer id) {
        for (GenderEnum at : GenderEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}