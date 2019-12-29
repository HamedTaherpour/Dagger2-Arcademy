package ir.arcademy.sinadalvand.dagger2.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\n"}, d2 = {"Lir/arcademy/sinadalvand/dagger2/di/module/SafePrefModule;", "", "()V", "getSafePref1", "Lir/arcademy/sinadalvand/dagger2/SafePref;", "context", "Landroid/content/Context;", "zcript", "Lir/arcademy/sinadalvand/dagger2/Zcript;", "getSafepref2", "app_debug"})
@dagger.Module()
public final class SafePrefModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "safepref1")
    @ir.arcademy.sinadalvand.dagger2.di.scope.ActivityScope()
    public final ir.arcademy.sinadalvand.dagger2.SafePref getSafePref1(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Zcript1")
    ir.arcademy.sinadalvand.dagger2.Zcript zcript) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "safepref2")
    public final ir.arcademy.sinadalvand.dagger2.SafePref getSafepref2(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Zcript2")
    ir.arcademy.sinadalvand.dagger2.Zcript zcript) {
        return null;
    }
    
    public SafePrefModule() {
        super();
    }
}