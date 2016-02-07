package org.satorysoft.androidcleanarchitecture.sample.di.module;

import org.satorysoft.androidcleanarchitecture.sample.RxBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by viacheslavokolitiy on 07.02.2016.
 */
@Module
public class BusModule {

    @Provides
    @Singleton
    public RxBus provideBus(){
        return new RxBus();
    }
}
