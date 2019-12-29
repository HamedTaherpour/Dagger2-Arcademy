package ir.arcademy.sinadalvand.dagger2.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lir/arcademy/sinadalvand/dagger2/di/module/ZcriptModule;", "", "()V", "getZcript1", "Lir/arcademy/sinadalvand/dagger2/Zcript;", "zsecure", "Lir/arcademy/sinadalvand/dagger2/Zsecure;", "getZcript2", "app_debug"})
@dagger.Module()
public final class ZcriptModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "Zcript1")
    @javax.inject.Singleton()
    public final ir.arcademy.sinadalvand.dagger2.Zcript getZcript1(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Zsecure1")
    ir.arcademy.sinadalvand.dagger2.Zsecure zsecure) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "Zcript2")
    public final ir.arcademy.sinadalvand.dagger2.Zcript getZcript2(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Zsecure2")
    ir.arcademy.sinadalvand.dagger2.Zsecure zsecure) {
        return null;
    }
    
    public ZcriptModule() {
        super();
    }
}