// java wrapper for vtkExtractSelectionBase object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkExtractSelectionBase extends vtkDataObjectAlgorithm
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

  private native void SetSelectionConnection_4(vtkAlgorithmOutput id0);
  public void SetSelectionConnection(vtkAlgorithmOutput id0)
  {
    SetSelectionConnection_4(id0);
  }

  private native void SetPreserveTopology_5(int id0);
  public void SetPreserveTopology(int id0)
  {
    SetPreserveTopology_5(id0);
  }

  private native int GetPreserveTopology_6();
  public int GetPreserveTopology()
  {
    return GetPreserveTopology_6();
  }

  private native void PreserveTopologyOn_7();
  public void PreserveTopologyOn()
  {
    PreserveTopologyOn_7();
  }

  private native void PreserveTopologyOff_8();
  public void PreserveTopologyOff()
  {
    PreserveTopologyOff_8();
  }

  public vtkExtractSelectionBase() { super(); }

  public vtkExtractSelectionBase(long id) { super(id); }

}
