// java wrapper for vtkPropItem object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkPropItem extends vtkAbstractContextItem
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void ReleaseGraphicsResources_5();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_5();
  }

  private native void SetPropObject_6(vtkProp id0);
  public void SetPropObject(vtkProp id0)
  {
    SetPropObject_6(id0);
  }

  private native long GetPropObject_7();
  public vtkProp GetPropObject()
  {
    long temp = GetPropObject_7();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPropItem() { super(); }

  public vtkPropItem(long id) { super(id); }
  public native long   VTKInit();

}
