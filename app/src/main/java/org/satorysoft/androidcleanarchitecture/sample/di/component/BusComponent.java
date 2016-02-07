package org.satorysoft.androidcleanarchitecture.sample.di.component;

import org.satorysoft.androidcleanarchitecture.sample.di.module.BusModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by viacheslavokolitiy on 07.02.2016.
 */
@Component(modules = {BusModule.class})
@Singleton
public interface BusComponent {
}
