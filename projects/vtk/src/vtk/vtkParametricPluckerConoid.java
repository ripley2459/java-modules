// java wrapper for vtkParametricPluckerConoid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkParametricPluckerConoid extends vtkParametricFunction
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

  private native int GetN_4();
  public int GetN()
  {
    return GetN_4();
  }

  private native void SetN_5(int id0);
  public void SetN(int id0)
  {
    SetN_5(id0);
  }

  private native int GetDimension_6();
  public int GetDimension()
  {
    return GetDimension_6();
  }

  private native void Evaluate_7(double id0[],double id1[],double id2[]);
  public void Evaluate(double id0[],double id1[],double id2[])
  {
    Evaluate_7(id0,id1,id2);
  }

  private native double EvaluateScalar_8(double id0[],double id1[],double id2[]);
  public double EvaluateScalar(double id0[],double id1[],double id2[])
  {
    return EvaluateScalar_8(id0,id1,id2);
  }

  public vtkParametricPluckerConoid() { super(); }

  public vtkParametricPluckerConoid(long id) { super(id); }
  public native long   VTKInit();

}
