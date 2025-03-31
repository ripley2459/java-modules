// java wrapper for vtkWin32OpenGLRenderWindow object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkWin32OpenGLRenderWindow extends vtkOpenGLRenderWindow
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

  private native void Frame_4();
  public void Frame()
  {
    Frame_4();
  }

  private native void WindowInitialize_5();
  public void WindowInitialize()
  {
    WindowInitialize_5();
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native void Finalize_7();
  public void Finalize()
  {
    Finalize_7();
  }

  private native void SetFullScreen_8(int id0);
  public void SetFullScreen(int id0)
  {
    SetFullScreen_8(id0);
  }

  private native void WindowRemap_9();
  public void WindowRemap()
  {
    WindowRemap_9();
  }

  private native void SetShowWindow_10(boolean id0);
  public void SetShowWindow(boolean id0)
  {
    SetShowWindow_10(id0);
  }

  private native void PrefFullScreen_11();
  public void PrefFullScreen()
  {
    PrefFullScreen_11();
  }

  private native void SetSize_12(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_12(id0,id1);
  }

  private native void SetSize_13(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_13(id0);
  }

  private native int[] GetSize_14();
  public int[] GetSize()
  {
    return GetSize_14();
  }

  private native void SetPosition_15(int id0,int id1);
  public void SetPosition(int id0,int id1)
  {
    SetPosition_15(id0,id1);
  }

  private native void SetPosition_16(int id0[]);
  public void SetPosition(int id0[])
  {
    SetPosition_16(id0);
  }

  private native int[] GetScreenSize_17();
  public int[] GetScreenSize()
  {
    return GetScreenSize_17();
  }

  private native int[] GetPosition_18();
  public int[] GetPosition()
  {
    return GetPosition_18();
  }

  private native void SetWindowName_19(byte[] id0, int len0);
  public void SetWindowName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowName_19(bytes0, bytes0.length);
  }

  private native void SetIcon_20(vtkImageData id0);
  public void SetIcon(vtkImageData id0)
  {
    SetIcon_20(id0);
  }

  private native void SetWindowInfo_21(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_21(bytes0, bytes0.length);
  }

  private native void SetNextWindowInfo_22(byte[] id0, int len0);
  public void SetNextWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNextWindowInfo_22(bytes0, bytes0.length);
  }

  private native void SetParentInfo_23(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_23(bytes0, bytes0.length);
  }

  private native boolean InitializeFromCurrentContext_24();
  public boolean InitializeFromCurrentContext()
  {
    return InitializeFromCurrentContext_24();
  }

  private native boolean GetPlatformSupportsRenderWindowSharing_25();
  public boolean GetPlatformSupportsRenderWindowSharing()
  {
    return GetPlatformSupportsRenderWindowSharing_25();
  }

  private native void SetStereoCapableWindow_26(int id0);
  public void SetStereoCapableWindow(int id0)
  {
    SetStereoCapableWindow_26(id0);
  }

  private native void MakeCurrent_27();
  public void MakeCurrent()
  {
    MakeCurrent_27();
  }

  private native void ReleaseCurrent_28();
  public void ReleaseCurrent()
  {
    ReleaseCurrent_28();
  }

  private native boolean IsCurrent_29();
  public boolean IsCurrent()
  {
    return IsCurrent_29();
  }

  private native byte[] ReportCapabilities_30();
  public String ReportCapabilities()
  {
    return new String(ReportCapabilities_30(), StandardCharsets.UTF_8);
  }

  private native int IsDirect_31();
  public int IsDirect()
  {
    return IsDirect_31();
  }

  private native int GetEventPending_32();
  public int GetEventPending()
  {
    return GetEventPending_32();
  }

  private native void Clean_33();
  public void Clean()
  {
    Clean_33();
  }

  private native void HideCursor_34();
  public void HideCursor()
  {
    HideCursor_34();
  }

  private native void ShowCursor_35();
  public void ShowCursor()
  {
    ShowCursor_35();
  }

  private native void SetCursorPosition_36(int id0,int id1);
  public void SetCursorPosition(int id0,int id1)
  {
    SetCursorPosition_36(id0,id1);
  }

  private native void SetCurrentCursor_37(int id0);
  public void SetCurrentCursor(int id0)
  {
    SetCurrentCursor_37(id0);
  }

  private native boolean DetectDPI_38();
  public boolean DetectDPI()
  {
    return DetectDPI_38();
  }

  private native void PushContext_39();
  public void PushContext()
  {
    PushContext_39();
  }

  private native void PopContext_40();
  public void PopContext()
  {
    PopContext_40();
  }

  private native boolean SetSwapControl_41(int id0);
  public boolean SetSwapControl(int id0)
  {
    return SetSwapControl_41(id0);
  }

  public vtkWin32OpenGLRenderWindow() { super(); }

  public vtkWin32OpenGLRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
