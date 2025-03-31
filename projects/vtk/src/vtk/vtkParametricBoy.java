// java wrapper for vtkParametricBoy object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkParametricBoy extends vtkParametricFunction
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

  private native int GetDimension_4();
  public int GetDimension()
  {
    return GetDimension_4();
  }

  private native void SetZScale_5(double id0);
  public void SetZScale(double id0)
  {
    SetZScale_5(id0);
  }

  private native double GetZScale_6();
  public double GetZScale()
  {
    return GetZScale_6();
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

  public vtkParametricBoy() { super(); }

  public vtkParametricBoy(long id) { super(id); }
  public native long   VTKInit();

}
