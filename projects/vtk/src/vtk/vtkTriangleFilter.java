// java wrapper for vtkTriangleFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkTriangleFilter extends vtkPolyDataAlgorithm
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

  private native void PassVertsOn_4();
  public void PassVertsOn()
  {
    PassVertsOn_4();
  }

  private native void PassVertsOff_5();
  public void PassVertsOff()
  {
    PassVertsOff_5();
  }

  private native void SetPassVerts_6(int id0);
  public void SetPassVerts(int id0)
  {
    SetPassVerts_6(id0);
  }

  private native int GetPassVerts_7();
  public int GetPassVerts()
  {
    return GetPassVerts_7();
  }

  private native void PassLinesOn_8();
  public void PassLinesOn()
  {
    PassLinesOn_8();
  }

  private native void PassLinesOff_9();
  public void PassLinesOff()
  {
    PassLinesOff_9();
  }

  private native void SetPassLines_10(int id0);
  public void SetPassLines(int id0)
  {
    SetPassLines_10(id0);
  }

  private native int GetPassLines_11();
  public int GetPassLines()
  {
    return GetPassLines_11();
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetTolerance_13();
  public double GetTolerance()
  {
    return GetTolerance_13();
  }

  public vtkTriangleFilter() { super(); }

  public vtkTriangleFilter(long id) { super(id); }
  public native long   VTKInit();

}
