// java wrapper for vtkObserverMediator object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkObserverMediator extends vtkObject
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

  private native void SetInteractor_4(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_4(id0);
  }

  private native long GetInteractor_5();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_5();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RequestCursorShape_6(vtkInteractorObserver id0,int id1);
  public int RequestCursorShape(vtkInteractorObserver id0,int id1)
  {
    return RequestCursorShape_6(id0,id1);
  }

  private native void RemoveAllCursorShapeRequests_7(vtkInteractorObserver id0);
  public void RemoveAllCursorShapeRequests(vtkInteractorObserver id0)
  {
    RemoveAllCursorShapeRequests_7(id0);
  }

  public vtkObserverMediator() { super(); }

  public vtkObserverMediator(long id) { super(id); }
  public native long   VTKInit();

}
