package com.gromyk.thesis.persistence.mappers;


import com.gromyk.thesis.persistence.db.Sex;

public class SexMapper {
    public static entities.Sex dbToDomain(Sex sex) {
        if (sex == Sex.Female) {
            return entities.Sex.Female;
        } else if (sex == Sex.Male) {
            return entities.Sex.Male;
        } else
            return entities.Sex.Male;
    }

    public static Sex domainToDB(entities.Sex sex) {
        if (sex == entities.Sex.Female) {
            return Sex.Female;
        } else if (sex == entities.Sex.Male) {
            return Sex.Male;
        } else
            return Sex.Male;
    }
}
