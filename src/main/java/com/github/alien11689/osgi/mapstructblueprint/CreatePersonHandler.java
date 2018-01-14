package com.github.alien11689.osgi.mapstructblueprint;

import lombok.AllArgsConstructor;

import javax.inject.Singleton;

@Singleton
@AllArgsConstructor
public class CreatePersonHandler {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    // ...
}
