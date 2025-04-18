// java wrapper for vtkTypeUInt8Array object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkTypeUInt8Array extends vtkUnsignedCharArray
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

  private native long FastDownCast_4(vtkAbstractArray id0);
  public vtkTypeUInt8Array FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_4(id0);

    if (temp == 0) return null;
    return (vtkTypeUInt8Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTypeUInt8Array() { super(); }

  public vtkTypeUInt8Array(long id) { super(id); }
  public native long   VTKInit();

}
