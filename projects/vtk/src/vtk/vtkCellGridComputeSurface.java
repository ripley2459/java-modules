// java wrapper for vtkCellGridComputeSurface object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCellGridComputeSurface extends vtkCellGridAlgorithm
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

  private native void SetPreserveRenderableCells_4(boolean id0);
  public void SetPreserveRenderableCells(boolean id0)
  {
    SetPreserveRenderableCells_4(id0);
  }

  private native boolean GetPreserveRenderableCells_5();
  public boolean GetPreserveRenderableCells()
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

  public vtkCellGridComputeSurface() { super(); }

  public vtkCellGridComputeSurface(long id) { super(id); }
  public native long   VTKInit();

}
