// java wrapper for vtkCellGridResponderBase object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCellGridResponderBase extends vtkObject
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

  private native boolean EvaluateQuery_4(vtkCellGridQuery id0,vtkCellMetadata id1,vtkCellGridResponders id2);
  public boolean EvaluateQuery(vtkCellGridQuery id0,vtkCellMetadata id1,vtkCellGridResponders id2)
  {
    return EvaluateQuery_4(id0,id1,id2);
  }

  public vtkCellGridResponderBase() { super(); }

  public vtkCellGridResponderBase(long id) { super(id); }

}
