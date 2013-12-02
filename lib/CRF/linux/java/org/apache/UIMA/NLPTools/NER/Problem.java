

/* First created by JCasGen Thu Jun 06 15:20:49 CDT 2013 */
package org.apache.UIMA.NLPTools.NER;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Jun 10 10:21:25 CDT 2013
 * XML source: C:/medex/MedEx_UIMA/desc/NERAnnotatorDescriptor.xml
 * @generated */
public class Problem extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Problem.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Problem() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Problem(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Problem(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Problem(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: Start

  /** getter for Start - gets 
   * @generated */
  public int getStart() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "org.apache.UIMA.NLPTools.NER.Problem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Problem_Type)jcasType).casFeatCode_Start);}
    
  /** setter for Start - sets  
   * @generated */
  public void setStart(int v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "org.apache.UIMA.NLPTools.NER.Problem");
    jcasType.ll_cas.ll_setIntValue(addr, ((Problem_Type)jcasType).casFeatCode_Start, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated */
  public int getEnd() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "org.apache.UIMA.NLPTools.NER.Problem");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Problem_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated */
  public void setEnd(int v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "org.apache.UIMA.NLPTools.NER.Problem");
    jcasType.ll_cas.ll_setIntValue(addr, ((Problem_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: Text

  /** getter for Text - gets 
   * @generated */
  public String getText() {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.UIMA.NLPTools.NER.Problem");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Problem_Type)jcasType).casFeatCode_Text);}
    
  /** setter for Text - sets  
   * @generated */
  public void setText(String v) {
    if (Problem_Type.featOkTst && ((Problem_Type)jcasType).casFeat_Text == null)
      jcasType.jcas.throwFeatMissing("Text", "org.apache.UIMA.NLPTools.NER.Problem");
    jcasType.ll_cas.ll_setStringValue(addr, ((Problem_Type)jcasType).casFeatCode_Text, v);}    
  }

    