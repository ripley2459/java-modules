// java wrapper for vtkWin32OpenGLDXRenderWindow object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkWin32OpenGLDXRenderWindow extends vtkWin32OpenGLRenderWindow
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void Lock_5();
  public void Lock()
  {
    Lock_5();
  }

  private native void Unlock_6();
  public void Unlock()
  {
    Unlock_6();
  }

  private native void RegisterSharedTexture_7(int id0);
  public void RegisterSharedTexture(int id0)
  {
    RegisterSharedTexture_7(id0);
  }

  private native void UnregisterSharedTexture_8();
  public void UnregisterSharedTexture()
  {
    UnregisterSharedTexture_8();
  }

  private native void SetSize_9(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_9(id0,id1);
  }

  private native void SetMultiSamples_10(int id0);
  public void SetMultiSamples(int id0)
  {
    SetMultiSamples_10(id0);
  }

  public vtkWin32OpenGLDXRenderWindow() { super(); }

  public vtkWin32OpenGLDXRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
