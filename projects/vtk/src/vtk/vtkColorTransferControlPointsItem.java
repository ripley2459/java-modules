// java wrapper for vtkColorTransferControlPointsItem object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkColorTransferControlPointsItem extends vtkControlPointsItem
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

  private native void SetColorTransferFunction_4(vtkColorTransferFunction id0);
  public void SetColorTransferFunction(vtkColorTransferFunction id0)
  {
    SetColorTransferFunction_4(id0);
  }

  private native long GetColorTransferFunction_5();
  public vtkColorTransferFunction GetColorTransferFunction()
  {
    long temp = GetColorTransferFunction_5();

    if (temp == 0) return null;
    return (vtkColorTransferFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPoints_6();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_6();
  }

  private native void SetColorFill_7(boolean id0);
  public void SetColorFill(boolean id0)
  {
    SetColorFill_7(id0);
  }

  private native boolean GetColorFill_8();
  public boolean GetColorFill()
  {
    return GetColorFill_8();
  }

  private native long RemovePoint_9(long id0);
  public long RemovePoint(long id0)
  {
    return RemovePoint_9(id0);
  }

  public vtkColorTransferControlPointsItem() { super(); }

  public vtkColorTransferControlPointsItem(long id) { super(id); }
  public native long   VTKInit();

}
