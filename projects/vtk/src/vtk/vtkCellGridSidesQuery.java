// java wrapper for vtkCellGridSidesQuery object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCellGridSidesQuery extends vtkCellGridQuery
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

  private native void SetPreserveRenderableCells_4(int id0);
  public void SetPreserveRenderableCells(int id0)
  {
    SetPreserveRenderableCells_4(id0);
  }

  private native int GetPreserveRenderableCells_5();
  public int GetPreserveRenderableCells()
  {
    return GetPreserveRenderableCells_5();
  }

  private native void PreserveRenderableCellsOn_6();
  public void PreserveRenderableCellsOn()
  {
    PreserveRenderableCellsOn_6();
  }

  private native void PreserveRenderableCellsOff_7();
  public void PreserveRenderableCellsOff()
  {
    PreserveRenderableCellsOff_7();
  }

  private native void Initialize_8();
  public void Initialize()
  {
    Initialize_8();
  }

  private native void StartPass_9();
  public void StartPass()
  {
    StartPass_9();
  }

  private native boolean IsAnotherPassRequired_10();
  public boolean IsAnotherPassRequired()
  {
    return IsAnotherPassRequired_10();
  }

  private native void Finalize_11();
  public void Finalize()
  {
    Finalize_11();
  }

  public vtkCellGridSidesQuery() { super(); }

  public vtkCellGridSidesQuery(long id) { super(id); }
  public native long   VTKInit();

}
