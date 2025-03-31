// java wrapper for vtkPlaneCollection object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkPlaneCollection extends vtkCollection
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

  private native void AddItem_4(vtkPlane id0);
  public void AddItem(vtkPlane id0)
  {
    AddItem_4(id0);
  }

  private native long GetNextItem_5();
  public vtkPlane GetNextItem()
  {
    long temp = GetNextItem_5();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetItem_6(int id0);
  public vtkPlane GetItem(int id0)
  {
    long temp = GetItem_6(id0);

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPlaneCollection() { super(); }

  public vtkPlaneCollection(long id) { super(id); }
  public native long   VTKInit();

}
