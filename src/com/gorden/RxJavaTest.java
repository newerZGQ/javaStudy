package com.gorden;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

@SuppressWarnings("ALL")
public class RxJavaTest implements Test{
    @Override
    public void doTest() {
        Observable.just("66").subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
        Flowable.just("77").subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Throwable {

            }
        });
        Flowable.create(new FlowableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull FlowableEmitter<Integer> emitter) throws Throwable {

            }
        }, BackpressureStrategy.MISSING).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Throwable {

            }
        });
    }
}
