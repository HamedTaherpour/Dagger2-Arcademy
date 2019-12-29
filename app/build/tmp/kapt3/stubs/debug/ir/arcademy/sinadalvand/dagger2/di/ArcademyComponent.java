package ir.arcademy.sinadalvand.dagger2.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lir/arcademy/sinadalvand/dagger2/di/ArcademyComponent;", "Ldagger/android/AndroidInjector;", "Lir/arcademy/sinadalvand/dagger2/ArcademyApplication;", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, ir.arcademy.sinadalvand.dagger2.di.module.ZcriptModule.class, ir.arcademy.sinadalvand.dagger2.di.module.ZsecureModule.class, ir.arcademy.sinadalvand.dagger2.di.module.TempModule1.class, ir.arcademy.sinadalvand.dagger2.di.module.TempModule2.class, ir.arcademy.sinadalvand.dagger2.di.module.ActivityModule.class})
@javax.inject.Singleton()
public abstract interface ArcademyComponent extends dagger.android.AndroidInjector<ir.arcademy.sinadalvand.dagger2.ArcademyApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lir/arcademy/sinadalvand/dagger2/di/ArcademyComponent$Factory;", "", "create", "Lir/arcademy/sinadalvand/dagger2/di/ArcademyComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ir.arcademy.sinadalvand.dagger2.di.ArcademyComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}