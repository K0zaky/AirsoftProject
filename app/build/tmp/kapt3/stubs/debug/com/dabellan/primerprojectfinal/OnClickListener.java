package com.dabellan.primerprojectfinal;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/dabellan/primerprojectfinal/OnClickListener;", "", "onClickMarca", "", "marca", "Lcom/dabellan/primerprojectfinal/Marca;", "onClickReplica", "replica", "Lcom/dabellan/primerprojectfinal/Replica;", "app_debug"})
public abstract interface OnClickListener {
    
    public abstract void onClickMarca(@org.jetbrains.annotations.NotNull
    com.dabellan.primerprojectfinal.Marca marca);
    
    public abstract void onClickReplica(@org.jetbrains.annotations.NotNull
    com.dabellan.primerprojectfinal.Replica replica);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void onClickMarca(@org.jetbrains.annotations.NotNull
        com.dabellan.primerprojectfinal.OnClickListener $this, @org.jetbrains.annotations.NotNull
        com.dabellan.primerprojectfinal.Marca marca) {
        }
        
        public static void onClickReplica(@org.jetbrains.annotations.NotNull
        com.dabellan.primerprojectfinal.OnClickListener $this, @org.jetbrains.annotations.NotNull
        com.dabellan.primerprojectfinal.Replica replica) {
        }
    }
}