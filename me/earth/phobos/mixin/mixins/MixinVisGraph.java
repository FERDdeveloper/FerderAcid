/*    */ package me.earth.phobos.mixin.mixins;
/*    */ 
/*    */ import me.earth.phobos.features.modules.render.XRay;
/*    */ import net.minecraft.client.renderer.chunk.VisGraph;
/*    */ import net.minecraft.util.math.BlockPos;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({VisGraph.class})
/*    */ public class MixinVisGraph {
/*    */   @Inject(method = {"setOpaqueCube"}, at = {@At("HEAD")}, cancellable = true)
/*    */   public void setOpaqueCubeHook(BlockPos pos, CallbackInfo info) {
/*    */     try {
/* 16 */       if (XRay.getInstance().isOn()) {
/* 17 */         info.cancel();
/*    */       }
/*    */     }
/* 20 */     catch (Exception exception) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\42060\Downloads\Acid_4\Acid-cul-repo-1.0.1-release.jar!\me\earth\phobos\mixin\mixins\MixinVisGraph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */