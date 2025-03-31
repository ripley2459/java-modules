// java wrapper for vtkGenericClip object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGenericClip extends vtkUnstructuredGridAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetValue_4(double id0);
  public void SetValue(double id0)
  {
    SetValue_4(id0);
  }

  private native double GetValue_5();
  public double GetValue()
  {
    return GetValue_5();
  }

  private native void SetInsideOut_6(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_6(id0);
  }

  private native int GetInsideOut_7();
  public int GetInsideOut()
  {
    return GetInsideOut_7();
  }

  private native void InsideOutOn_8();
  public void InsideOutOn()
  {
    InsideOutOn_8();
  }

  private native void InsideOutOff_9();
  public void InsideOutOff()
  {
    InsideOutOff_9();
  }

  private native void SetClipFunction_10(vtkImplicitFunction id0);
  public void SetClipFunction(vtkImplicitFunction id0)
  {
    SetClipFunction_10(id0);
  }

  private native long GetClipFunction_11();
  public vtkImplicitFunction GetClipFunction()
  {
    long temp = GetClipFunction_11();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateClipScalars_12(int id0);
  public void SetGenerateClipScalars(int id0)
  {
    SetGenerateClipScalars_12(id0);
  }

  private native int GetGenerateClipScalars_13();
  public int GetGenerateClipScalars()
  {
    return GetGenerateClipScalars_13();
  }

  private native void GenerateClipScalarsOn_14();
  public void GenerateClipScalarsOn()
  {
    GenerateClipScalarsOn_14();
  }

  private native void GenerateClipScalarsOff_15();
  public void GenerateClipScalarsOff()
  {
    GenerateClipScalarsOff_15();
  }

  private native void SetGenerateClippedOutput_16(int id0);
  public void SetGenerateClippedOutput(int id0)
  {
    SetGenerateClippedOutput_16(id0);
  }

  private native int GetGenerateClippedOutput_17();
  public int GetGenerateClippedOutput()
  {
    return GetGenerateClippedOutput_17();
  }

  private native void GenerateClippedOutputOn_18();
  public void GenerateClippedOutputOn()
  {
    GenerateClippedOutputOn_18();
  }

  private native void GenerateClippedOutputOff_19();
  public void GenerateClippedOutputOff()
  {
    GenerateClippedOutputOff_19();
  }

  private native void SetMergeTolerance_20(double id0);
  public void SetMergeTolerance(double id0)
  {
    SetMergeTolerance_20(id0);
  }

  private native double GetMergeToleranceMinValue_21();
  public double GetMergeToleranceMinValue()
  {
    return GetMergeToleranceMinValue_21();
  }

  private native double GetMergeToleranceMaxValue_22();
  public double GetMergeToleranceMaxValue()
  {
    return GetMergeToleranceMaxValue_22();
  }

  private native double GetMergeTolerance_23();
  public double GetMergeTolerance()
  {
    return GetMergeTolerance_23();
  }

  private native long GetClippedOutput_24();
  public vtkUnstructuredGrid GetClippedOutput()
  {
    long temp = GetClippedOutput_24();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfOutputs_25();
  public int GetNumberOfOutputs()
  {
    return GetNumberOfOutputs_25();
  }

  private native void SetLocator_26(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_26(id0);
  }

  private native long GetLocator_27();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_27();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_28();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_28();
  }

  private native long GetMTime_29();
  public long GetMTime()
  {
    return GetMTime_29();
  }

  private native byte[] GetInputScalarsSelection_30();
  public String GetInputScalarsSelection()
  {
    return new String(GetInputScalarsSelection_30(), StandardCharsets.UTF_8);
  }

  private native void SelectInputScalars_31(byte[] id0, int len0);
  public void SelectInputScalars(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectInputScalars_31(bytes0, bytes0.length);
  }

  public vtkGenericClip() { super(); }

  public vtkGenericClip(long id) { super(id); }
  public native long   VTKInit();

}
