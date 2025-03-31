// java wrapper for vtkXMLHyperTreeGridWriter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkXMLHyperTreeGridWriter extends vtkXMLWriter
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

  private native long GetInput_4();
  public vtkHyperTreeGrid GetInput()
  {
    long temp = GetInput_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetDefaultFileExtension_5();
  public String GetDefaultFileExtension()
  {
    return new String(GetDefaultFileExtension_5(), StandardCharsets.UTF_8);
  }

  private native void SetDataSetMajorVersion_6(int id0);
  public void SetDataSetMajorVersion(int id0)
  {
    SetDataSetMajorVersion_6(id0);
  }

  private native void SetDataSetMinorVersion_7(int id0);
  public void SetDataSetMinorVersion(int id0)
  {
    SetDataSetMinorVersion_7(id0);
  }

  public vtkXMLHyperTreeGridWriter() { super(); }

  public vtkXMLHyperTreeGridWriter(long id) { super(id); }
  public native long   VTKInit();

}
