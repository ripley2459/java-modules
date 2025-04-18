// java wrapper for vtkCompositeTransferFunctionItem object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCompositeTransferFunctionItem extends vtkColorTransferFunctionItem
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

  private native void SetOpacityFunction_4(vtkPiecewiseFunction id0);
  public void SetOpacityFunction(vtkPiecewiseFunction id0)
  {
    SetOpacityFunction_4(id0);
  }

  private native long GetOpacityFunction_5();
  public vtkPiecewiseFunction GetOpacityFunction()
  {
    long temp = GetOpacityFunction_5();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCompositeTransferFunctionItem() { super(); }

  public vtkCompositeTransferFunctionItem(long id) { super(id); }
  public native long   VTKInit();

}
