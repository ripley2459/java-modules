// java wrapper for vtkGAMBITReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGAMBITReader extends vtkUnstructuredGridAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfCells_6();
  public int GetNumberOfCells()
  {
    return GetNumberOfCells_6();
  }

  private native int GetNumberOfNodes_7();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_7();
  }

  private native int GetNumberOfNodeFields_8();
  public int GetNumberOfNodeFields()
  {
    return GetNumberOfNodeFields_8();
  }

  private native int GetNumberOfCellFields_9();
  public int GetNumberOfCellFields()
  {
    return GetNumberOfCellFields_9();
  }

  public vtkGAMBITReader() { super(); }

  public vtkGAMBITReader(long id) { super(id); }
  public native long   VTKInit();

}
