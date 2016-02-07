package org.satorysoft.androidcleanarchitecture.sample;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Created by viacheslavokolitiy on 07.02.2016.
 */
public class RxBus {
    private final Subject<Object, Object> BUS = new SerializedSubject<>(PublishSubject.create());

    public <T> void send(T event){
        BUS.onNext(event);
    }

    public Observable<Object> toObserverable() {
        return BUS;
    }

    public boolean hasObservers(){
        return BUS.hasObservers();
    }
}
