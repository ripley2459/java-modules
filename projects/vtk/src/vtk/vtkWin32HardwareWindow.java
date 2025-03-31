// java wrapper for vtkWin32HardwareWindow object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkWin32HardwareWindow extends vtkHardwareWindow
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

  private native void Create_4();
  public void Create()
  {
    Create_4();
  }

  private native void Destroy_5();
  public void Destroy()
  {
    Destroy_5();
  }

  private native void SetSize_6(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_6(id0,id1);
  }

  private native void SetPosition_7(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_7(id0,id1);
  }

  private native void SetPosition_8(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_8(id0);
  }

  private native void SetSize_9(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_9(id0);
  }

  public vtkWin32HardwareWindow() { super(); }

  public vtkWin32HardwareWindow(long id) { super(id); }
  public native long   VTKInit();

}
