// java wrapper for vtkWin32RenderWindowInteractor object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkWin32RenderWindowInteractor extends vtkRenderWindowInteractor
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

  private native void Enable_5();
  public void Enable()
  {
    Enable_5();
  }

  private native void Disable_6();
  public void Disable()
  {
    Disable_6();
  }

  private native void ProcessEvents_7();
  public void ProcessEvents()
  {
    ProcessEvents_7();
  }

  private native void SetInstallMessageProc_8(int id0);
  public void SetInstallMessageProc(int id0)
  {
    SetInstallMessageProc_8(id0);
  }

  private native int GetInstallMessageProc_9();
  public int GetInstallMessageProc()
  {
    return GetInstallMessageProc_9();
  }

  private native void InstallMessageProcOn_10();
  public void InstallMessageProcOn()
  {
    InstallMessageProcOn_10();
  }

  private native void InstallMessageProcOff_11();
  public void InstallMessageProcOff()
  {
    InstallMessageProcOff_11();
  }

  private native void TerminateApp_12();
  public void TerminateApp()
  {
    TerminateApp_12();
  }

  private native void SetClassExitMethod_13( Object id0, byte[] id1, int len1);
  public void SetClassExitMethod( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetClassExitMethod_13(id0, bytes1, bytes1.length);
  }

  private native void ExitCallback_14();
  public void ExitCallback()
  {
    ExitCallback_14();
  }

  public vtkWin32RenderWindowInteractor() { super(); }

  public vtkWin32RenderWindowInteractor(long id) { super(id); }
  public native long   VTKInit();

}
