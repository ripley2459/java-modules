// java wrapper for vtkOpenGLCompositePolyDataMapperDelegator object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOpenGLCompositePolyDataMapperDelegator extends vtkCompositePolyDataMapperDelegator
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

  private native void ShallowCopy_4(vtkCompositePolyDataMapper id0);
  public void ShallowCopy(vtkCompositePolyDataMapper id0)
  {
    ShallowCopy_4(id0);
  }

  private native void ClearUnmarkedBatchElements_5();
  public void ClearUnmarkedBatchElements()
  {
    ClearUnmarkedBatchElements_5();
  }

  private native void UnmarkBatchElements_6();
  public void UnmarkBatchElements()
  {
    UnmarkBatchElements_6();
  }

  public vtkOpenGLCompositePolyDataMapperDelegator() { super(); }

  public vtkOpenGLCompositePolyDataMapperDelegator(long id) { super(id); }
  public native long   VTKInit();

}
