// java wrapper for vtkProgressBarWidget object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkProgressBarWidget extends vtkBorderWidget
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

  private native void SetRepresentation_4(vtkProgressBarRepresentation id0);
  public void SetRepresentation(vtkProgressBarRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void CreateDefaultRepresentation_5();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_5();
  }

  public vtkProgressBarWidget() { super(); }

  public vtkProgressBarWidget(long id) { super(id); }
  public native long   VTKInit();

}
