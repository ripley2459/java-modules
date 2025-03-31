// java wrapper for vtkHyperTreeGridDepthLimiter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHyperTreeGridDepthLimiter extends vtkHyperTreeGridAlgorithm
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

  private native void SetJustCreateNewMask_4(boolean id0);
  public void SetJustCreateNewMask(boolean id0)
  {
    SetJustCreateNewMask_4(id0);
  }

  private native boolean GetJustCreateNewMask_5();
  public boolean GetJustCreateNewMask()
  {
    return GetJustCreateNewMask_5();
  }

  private native void SetDepth_6(int id0);
  public void SetDepth(int id0)
  {
    SetDepth_6(id0);
  }

  private native int GetDepth_7();
  public int GetDepth()
  {
    return GetDepth_7();
  }

  public vtkHyperTreeGridDepthLimiter() { super(); }

  public vtkHyperTreeGridDepthLimiter(long id) { super(id); }
  public native long   VTKInit();

}
