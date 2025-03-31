// java wrapper for vtkCone object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCone extends vtkImplicitFunction
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

  private native double EvaluateFunction_4(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_4(id0);
  }

  private native void EvaluateGradient_5(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_5(id0,id1);
  }

  private native void SetAngle_6(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_6(id0);
  }

  private native double GetAngleMinValue_7();
  public double GetAngleMinValue()
  {
    return GetAngleMinValue_7();
  }

  private native double GetAngleMaxValue_8();
  public double GetAngleMaxValue()
  {
    return GetAngleMaxValue_8();
  }

  private native double GetAngle_9();
  public double GetAngle()
  {
    return GetAngle_9();
  }

  private native void EvaluateFunction_10(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_10(id0,id1);
  }

  private native double EvaluateFunction_11(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_11(id0,id1,id2);
  }

  public vtkCone() { super(); }

  public vtkCone(long id) { super(id); }
  public native long   VTKInit();

}
