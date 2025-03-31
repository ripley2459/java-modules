// java wrapper for vtkViewUpdater object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkViewUpdater extends vtkObject
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

  private native void AddView_4(vtkView id0);
  public void AddView(vtkView id0)
  {
    AddView_4(id0);
  }

  private native void RemoveView_5(vtkView id0);
  public void RemoveView(vtkView id0)
  {
    RemoveView_5(id0);
  }

  private native void AddAnnotationLink_6(vtkAnnotationLink id0);
  public void AddAnnotationLink(vtkAnnotationLink id0)
  {
    AddAnnotationLink_6(id0);
  }

  public vtkViewUpdater() { super(); }

  public vtkViewUpdater(long id) { super(id); }
  public native long   VTKInit();

}
