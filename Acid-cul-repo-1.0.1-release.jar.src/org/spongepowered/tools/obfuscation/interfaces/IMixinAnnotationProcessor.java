/*    */ package org.spongepowered.tools.obfuscation.interfaces;
/*    */ 
/*    */ import javax.annotation.processing.Messager;
/*    */ import javax.annotation.processing.ProcessingEnvironment;
/*    */ import org.spongepowered.asm.util.ITokenProvider;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface IMixinAnnotationProcessor
/*    */   extends Messager, IOptionProvider
/*    */ {
/*    */   CompilerEnvironment getCompilerEnvironment();
/*    */   
/*    */   ProcessingEnvironment getProcessingEnvironment();
/*    */   
/*    */   IObfuscationManager getObfuscationManager();
/*    */   
/*    */   ITokenProvider getTokenProvider();
/*    */   
/*    */   ITypeHandleProvider getTypeProvider();
/*    */   
/*    */   IJavadocProvider getJavadocProvider();
/*    */   
/*    */   public enum CompilerEnvironment
/*    */   {
/* 46 */     JAVAC,
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     JDT;
/*    */   }
/*    */ }


/* Location:              C:\Users\42060\Downloads\Acid_4\Acid-cul-repo-1.0.1-release.jar!\org\spongepowered\tools\obfuscation\interfaces\IMixinAnnotationProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */