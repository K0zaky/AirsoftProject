package com.dabellan.primerprojectfinal;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/dabellan/primerprojectfinal/ReplicaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dabellan/primerprojectfinal/ReplicaAdapter$ViewHolder;", "replicas", "", "Lcom/dabellan/primerprojectfinal/Replica;", "listener", "Lcom/dabellan/primerprojectfinal/OnClickListener;", "(Ljava/util/List;Lcom/dabellan/primerprojectfinal/OnClickListener;)V", "context", "Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ReplicaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dabellan.primerprojectfinal.ReplicaAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.dabellan.primerprojectfinal.Replica> replicas = null;
    @org.jetbrains.annotations.NotNull
    private final com.dabellan.primerprojectfinal.OnClickListener listener = null;
    private android.content.Context context;
    
    public ReplicaAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.dabellan.primerprojectfinal.Replica> replicas, @org.jetbrains.annotations.NotNull
    com.dabellan.primerprojectfinal.OnClickListener listener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.dabellan.primerprojectfinal.ReplicaAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dabellan.primerprojectfinal.ReplicaAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/dabellan/primerprojectfinal/ReplicaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/dabellan/primerprojectfinal/ReplicaAdapter;Landroid/view/View;)V", "binding", "Lcom/dabellan/primerprojectfinal/databinding/ItemGunsBinding;", "getBinding", "()Lcom/dabellan/primerprojectfinal/databinding/ItemGunsBinding;", "setListener", "", "replica", "Lcom/dabellan/primerprojectfinal/Replica;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.dabellan.primerprojectfinal.databinding.ItemGunsBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dabellan.primerprojectfinal.databinding.ItemGunsBinding getBinding() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.NotNull
        com.dabellan.primerprojectfinal.Replica replica) {
        }
    }
}