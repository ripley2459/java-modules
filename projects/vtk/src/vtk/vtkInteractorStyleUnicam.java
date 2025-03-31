// java wrapper for vtkInteractorStyleUnicam object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkInteractorStyleUnicam extends vtkInteractorStyle
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

  private native void SetWorldUpVector_4(double id0[]);
  public void SetWorldUpVector(double id0[])
  {
    SetWorldUpVector_4(id0);
  }

  private native void SetWorldUpVector_5(double id0,double id1,double id2);
  public void SetWorldUpVector(double id0,double id1,double id2)
  {
    SetWorldUpVector_5(id0,id1,id2);
  }

  private native double[] GetWorldUpVector_6();
  public double[] GetWorldUpVector()
  {
    return GetWorldUpVector_6();
  }

  private native void OnMouseMove_7();
  public void OnMouseMove()
  {
    OnMouseMove_7();
  }

  private native void OnLeftButtonDown_8();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_8();
  }

  private native void OnLeftButtonUp_9();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_9();
  }

  private native void OnLeftButtonMove_10();
  public void OnLeftButtonMove()
  {
    OnLeftButtonMove_10();
  }

  private native void OnTimer_11();
  public void OnTimer()
  {
    OnTimer_11();
  }

  public vtkInteractorStyleUnicam() { super(); }

  public vtkInteractorStyleUnicam(long id) { super(id); }
  public native long   VTKInit();

}
