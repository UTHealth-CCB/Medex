
/* First created by JCasGen Thu Jun 06 15:41:26 CDT 2013 */
package org.apache.UIMA.NER;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jun 07 16:25:07 CDT 2013
 * @generated */
public class Problem_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Problem_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Problem_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Problem(addr, Problem_Type.this);
  			   Problem_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Problem(addr, Problem_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Problem.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.UIMA.NER.Problem");
 
  /** @generated */
  final Feature casFeat_Start;
  /** @generated */
  final int     casFeatCode_Start;
  /** @generated */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "org.apache.UIMA.NER.Problem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Start);
  }
  /** @generated */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "org.apache.UIMA.NER.Problem");
    ll_cas.ll_setIntValue(addr, casFeatCode_Start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End;
  /** @generated */
  final int     casFeatCode_End;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "org.apache.UIMA.NER.Problem");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "org.apache.UIMA.NER.Problem");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Text;
  /** @generated */
  final int     casFeatCode_Text;
  /** @generated */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.UIMA.NER.Problem");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Text);
  }
  /** @generated */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_Text == null)
      jcas.throwFeatMissing("Text", "org.apache.UIMA.NER.Problem");
    ll_cas.ll_setStringValue(addr, casFeatCode_Text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Problem_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Start = jcas.getRequiredFeatureDE(casType, "Start", "uima.cas.Integer", featOkTst);
    casFeatCode_Start  = (null == casFeat_Start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Start).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

 
    casFeat_Text = jcas.getRequiredFeatureDE(casType, "Text", "uima.cas.String", featOkTst);
    casFeatCode_Text  = (null == casFeat_Text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Text).getCode();

  }
}



    