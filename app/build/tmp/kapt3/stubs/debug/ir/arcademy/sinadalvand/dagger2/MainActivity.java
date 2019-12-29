package ir.arcademy.sinadalvand.dagger2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001e"}, d2 = {"Lir/arcademy/sinadalvand/dagger2/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "autoSafePref", "Lir/arcademy/sinadalvand/dagger2/SafePref;", "getAutoSafePref", "()Lir/arcademy/sinadalvand/dagger2/SafePref;", "setAutoSafePref", "(Lir/arcademy/sinadalvand/dagger2/SafePref;)V", "autoSafePref2", "getAutoSafePref2", "setAutoSafePref2", "zcript", "Lir/arcademy/sinadalvand/dagger2/Zcript;", "getZcript", "()Lir/arcademy/sinadalvand/dagger2/Zcript;", "setZcript", "(Lir/arcademy/sinadalvand/dagger2/Zcript;)V", "zsecures", "", "", "Lir/arcademy/sinadalvand/dagger2/Zsecure;", "getZsecures", "()Ljava/util/Map;", "setZsecures", "(Ljava/util/Map;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "safepref1")
    @javax.inject.Inject()
    public ir.arcademy.sinadalvand.dagger2.SafePref autoSafePref;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "safepref1")
    @javax.inject.Inject()
    public ir.arcademy.sinadalvand.dagger2.SafePref autoSafePref2;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "Zcript1")
    @javax.inject.Inject()
    public ir.arcademy.sinadalvand.dagger2.Zcript zcript;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public java.util.Map<java.lang.String, ir.arcademy.sinadalvand.dagger2.Zsecure> zsecures;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ir.arcademy.sinadalvand.dagger2.SafePref getAutoSafePref() {
        return null;
    }
    
    public final void setAutoSafePref(@org.jetbrains.annotations.NotNull()
    ir.arcademy.sinadalvand.dagger2.SafePref p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.arcademy.sinadalvand.dagger2.SafePref getAutoSafePref2() {
        return null;
    }
    
    public final void setAutoSafePref2(@org.jetbrains.annotations.NotNull()
    ir.arcademy.sinadalvand.dagger2.SafePref p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ir.arcademy.sinadalvand.dagger2.Zcript getZcript() {
        return null;
    }
    
    public final void setZcript(@org.jetbrains.annotations.NotNull()
    ir.arcademy.sinadalvand.dagger2.Zcript p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ir.arcademy.sinadalvand.dagger2.Zsecure> getZsecures() {
        return null;
    }
    
    public final void setZsecures(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ir.arcademy.sinadalvand.dagger2.Zsecure> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MainActivity() {
        super();
    }
}