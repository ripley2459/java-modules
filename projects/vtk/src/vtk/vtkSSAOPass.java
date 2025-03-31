// java wrapper for vtkSSAOPass object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkSSAOPass extends vtkImageProcessingPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native boolean PreReplaceShaderValues_5(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PreReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PreReplaceShaderValues_5(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  private native boolean PostReplaceShaderValues_6(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkAbstractMapper id3,vtkProp id4);
  public boolean PostReplaceShaderValues(String id0,String id1,String id2,vtkAbstractMapper id3,vtkProp id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return PostReplaceShaderValues_6(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3,id4);
  }

  private native boolean SetShaderParameters_7(vtkShaderProgram id0,vtkAbstractMapper id1,vtkProp id2,vtkOpenGLVertexArrayObject id3);
  public boolean SetShaderParameters(vtkShaderProgram id0,vtkAbstractMapper id1,vtkProp id2,vtkOpenGLVertexArrayObject id3)
  {
    return SetShaderParameters_7(id0,id1,id2,id3);
  }

  private native double GetRadius_8();
  public double GetRadius()
  {
    return GetRadius_8();
  }

  private native void SetRadius_9(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_9(id0);
  }

  private native int GetKernelSize_10();
  public int GetKernelSize()
  {
    return GetKernelSize_10();
  }

  private native void SetKernelSize_11(int id0);
  public void SetKernelSize(int id0)
  {
    SetKernelSize_11(id0);
  }

  private native int GetKernelSizeMinValue_12();
  public int GetKernelSizeMinValue()
  {
    return GetKernelSizeMinValue_12();
  }

  private native int GetKernelSizeMaxValue_13();
  public int GetKernelSizeMaxValue()
  {
    return GetKernelSizeMaxValue_13();
  }

  private native double GetBias_14();
  public double GetBias()
  {
    return GetBias_14();
  }

  private native void SetBias_15(double id0);
  public void SetBias(double id0)
  {
    SetBias_15(id0);
  }

  private native boolean GetBlur_16();
  public boolean GetBlur()
  {
    return GetBlur_16();
  }

  private native void SetBlur_17(boolean id0);
  public void SetBlur(boolean id0)
  {
    SetBlur_17(id0);
  }

  private native void BlurOn_18();
  public void BlurOn()
  {
    BlurOn_18();
  }

  private native void BlurOff_19();
  public void BlurOff()
  {
    BlurOff_19();
  }

  public vtkSSAOPass() { super(); }

  public vtkSSAOPass(long id) { super(id); }
  public native long   VTKInit();

}
