package com.github.alien11689.osgi.mapstructblueprint;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    Person toDomain(PersonDto personDto);
}
