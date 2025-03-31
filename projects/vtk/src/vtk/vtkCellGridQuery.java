// java wrapper for vtkCellGridQuery object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCellGridQuery extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void StartPass_5();
  public void StartPass()
  {
    StartPass_5();
  }

  private native int GetPass_6();
  public int GetPass()
  {
    return GetPass_6();
  }

  private native boolean IsAnotherPassRequired_7();
  public boolean IsAnotherPassRequired()
  {
    return IsAnotherPassRequired_7();
  }

  private native void Finalize_8();
  public void Finalize()
  {
    Finalize_8();
  }

  public vtkCellGridQuery() { super(); }

  public vtkCellGridQuery(long id) { super(id); }

}
