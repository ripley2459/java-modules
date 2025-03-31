// java wrapper for vtkOrientationWidget object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOrientationWidget extends vtkAbstractWidget
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

  private native void CreateDefaultRepresentation_4();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_4();
  }

  private native void SetRepresentation_5(vtkOrientationRepresentation id0);
  public void SetRepresentation(vtkOrientationRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  public vtkOrientationWidget() { super(); }

  public vtkOrientationWidget(long id) { super(id); }
  public native long   VTKInit();

}
