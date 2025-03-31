// java wrapper for vtkPointGaussianMapper object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkPointGaussianMapper extends vtkPolyDataMapper
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

  private native void SetScaleFunction_4(vtkPiecewiseFunction id0);
  public void SetScaleFunction(vtkPiecewiseFunction id0)
  {
    SetScaleFunction_4(id0);
  }

  private native long GetScaleFunction_5();
  public vtkPiecewiseFunction GetScaleFunction()
  {
    long temp = GetScaleFunction_5();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaleTableSize_6(int id0);
  public void SetScaleTableSize(int id0)
  {
    SetScaleTableSize_6(id0);
  }

  private native int GetScaleTableSize_7();
  public int GetScaleTableSize()
  {
    return GetScaleTableSize_7();
  }

  private native void SetScaleArray_8(byte[] id0, int len0);
  public void SetScaleArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScaleArray_8(bytes0, bytes0.length);
  }

  private native byte[] GetScaleArray_9();
  public String GetScaleArray()
  {
    return new String(GetScaleArray_9(), StandardCharsets.UTF_8);
  }

  private native void SetScaleArrayComponent_10(int id0);
  public void SetScaleArrayComponent(int id0)
  {
    SetScaleArrayComponent_10(id0);
  }

  private native int GetScaleArrayComponent_11();
  public int GetScaleArrayComponent()
  {
    return GetScaleArrayComponent_11();
  }

  private native void SetScaleFactor_12(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_12(id0);
  }

  private native double GetScaleFactor_13();
  public double GetScaleFactor()
  {
    return GetScaleFactor_13();
  }

  private native void SetEmissive_14(int id0);
  public void SetEmissive(int id0)
  {
    SetEmissive_14(id0);
  }

  private native int GetEmissive_15();
  public int GetEmissive()
  {
    return GetEmissive_15();
  }

  private native void EmissiveOn_16();
  public void EmissiveOn()
  {
    EmissiveOn_16();
  }

  private native void EmissiveOff_17();
  public void EmissiveOff()
  {
    EmissiveOff_17();
  }

  private native void SetScalarOpacityFunction_18(vtkPiecewiseFunction id0);
  public void SetScalarOpacityFunction(vtkPiecewiseFunction id0)
  {
    SetScalarOpacityFunction_18(id0);
  }

  private native long GetScalarOpacityFunction_19();
  public vtkPiecewiseFunction GetScalarOpacityFunction()
  {
    long temp = GetScalarOpacityFunction_19();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOpacityTableSize_20(int id0);
  public void SetOpacityTableSize(int id0)
  {
    SetOpacityTableSize_20(id0);
  }

  private native int GetOpacityTableSize_21();
  public int GetOpacityTableSize()
  {
    return GetOpacityTableSize_21();
  }

  private native void SetOpacityArray_22(byte[] id0, int len0);
  public void SetOpacityArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOpacityArray_22(bytes0, bytes0.length);
  }

  private native byte[] GetOpacityArray_23();
  public String GetOpacityArray()
  {
    return new String(GetOpacityArray_23(), StandardCharsets.UTF_8);
  }

  private native void SetOpacityArrayComponent_24(int id0);
  public void SetOpacityArrayComponent(int id0)
  {
    SetOpacityArrayComponent_24(id0);
  }

  private native int GetOpacityArrayComponent_25();
  public int GetOpacityArrayComponent()
  {
    return GetOpacityArrayComponent_25();
  }

  private native void SetSplatShaderCode_26(byte[] id0, int len0);
  public void SetSplatShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSplatShaderCode_26(bytes0, bytes0.length);
  }

  private native byte[] GetSplatShaderCode_27();
  public String GetSplatShaderCode()
  {
    return new String(GetSplatShaderCode_27(), StandardCharsets.UTF_8);
  }

  private native void SetTriangleScale_28(float id0);
  public void SetTriangleScale(float id0)
  {
    SetTriangleScale_28(id0);
  }

  private native float GetTriangleScale_29();
  public float GetTriangleScale()
  {
    return GetTriangleScale_29();
  }

  private native boolean GetSupportsSelection_30();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_30();
  }

  public vtkPointGaussianMapper() { super(); }

  public vtkPointGaussianMapper(long id) { super(id); }
  public native long   VTKInit();

}
