// java wrapper for vtkHyperTreeGridOutlineFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHyperTreeGridOutlineFilter extends vtkHyperTreeGridAlgorithm
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

  private native void SetGenerateFaces_4(int id0);
  public void SetGenerateFaces(int id0)
  {
    SetGenerateFaces_4(id0);
  }

  private native void GenerateFacesOn_5();
  public void GenerateFacesOn()
  {
    GenerateFacesOn_5();
  }

  private native void GenerateFacesOff_6();
  public void GenerateFacesOff()
  {
    GenerateFacesOff_6();
  }

  private native int GetGenerateFaces_7();
  public int GetGenerateFaces()
  {
    return GetGenerateFaces_7();
  }

  public vtkHyperTreeGridOutlineFilter() { super(); }

  public vtkHyperTreeGridOutlineFilter(long id) { super(id); }
  public native long   VTKInit();

}
