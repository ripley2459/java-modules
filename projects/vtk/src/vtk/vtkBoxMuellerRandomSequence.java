// java wrapper for vtkBoxMuellerRandomSequence object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkBoxMuellerRandomSequence extends vtkGaussianRandomSequence
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

  private native void Initialize_4(int id0);
  public void Initialize(int id0)
  {
    Initialize_4(id0);
  }

  private native double GetValue_5();
  public double GetValue()
  {
    return GetValue_5();
  }

  private native void Next_6();
  public void Next()
  {
    Next_6();
  }

  private native long GetUniformSequence_7();
  public vtkRandomSequence GetUniformSequence()
  {
    long temp = GetUniformSequence_7();

    if (temp == 0) return null;
    return (vtkRandomSequence)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUniformSequence_8(vtkRandomSequence id0);
  public void SetUniformSequence(vtkRandomSequence id0)
  {
    SetUniformSequence_8(id0);
  }

  public vtkBoxMuellerRandomSequence() { super(); }

  public vtkBoxMuellerRandomSequence(long id) { super(id); }
  public native long   VTKInit();

}
