// java wrapper for vtkCameraHandleSource object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCameraHandleSource extends vtkHandleSource
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

  private native void SetCamera_4(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_4(id0);
  }

  private native void SetPosition_5(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_5(id0,id1,id2);
  }

  private native void SetDirection_6(double id0,double id1,double id2);
  public void SetDirection(double id0,double id1,double id2)
  {
    SetDirection_6(id0,id1,id2);
  }

  private native void SetPosition_7(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_7(id0);
  }

  private native void GetPosition_8(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_8(id0);
  }

  private native void SetDirection_9(double id0[]);
  public void SetDirection(double id0[])
  {
    SetDirection_9(id0);
  }

  private native void GetDirection_10(double id0[]);
  public void GetDirection(double id0[])
  {
    GetDirection_10(id0);
  }

  public vtkCameraHandleSource() { super(); }

  public vtkCameraHandleSource(long id) { super(id); }
  public native long   VTKInit();

}
