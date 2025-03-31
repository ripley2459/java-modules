// java wrapper for vtkImplicitFunctionToImageStencil object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkImplicitFunctionToImageStencil extends vtkImageStencilSource
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

  private native void SetInput_4(vtkImplicitFunction id0);
  public void SetInput(vtkImplicitFunction id0)
  {
    SetInput_4(id0);
  }

  private native long GetInput_5();
  public vtkImplicitFunction GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetThreshold_6(double id0);
  public void SetThreshold(double id0)
  {
    SetThreshold_6(id0);
  }

  private native double GetThreshold_7();
  public double GetThreshold()
  {
    return GetThreshold_7();
  }

  private native long GetMTime_8();
  public long GetMTime()
  {
    return GetMTime_8();
  }

  public vtkImplicitFunctionToImageStencil() { super(); }

  public vtkImplicitFunctionToImageStencil(long id) { super(id); }
  public native long   VTKInit();

}
