// java wrapper for vtkEdgeLayout object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkEdgeLayout extends vtkGraphAlgorithm
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

  private native void SetLayoutStrategy_4(vtkEdgeLayoutStrategy id0);
  public void SetLayoutStrategy(vtkEdgeLayoutStrategy id0)
  {
    SetLayoutStrategy_4(id0);
  }

  private native long GetLayoutStrategy_5();
  public vtkEdgeLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_5();

    if (temp == 0) return null;
    return (vtkEdgeLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_6();
  public long GetMTime()
  {
    return GetMTime_6();
  }

  public vtkEdgeLayout() { super(); }

  public vtkEdgeLayout(long id) { super(id); }
  public native long   VTKInit();

}
