// java wrapper for vtkWindow object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkWindow extends vtkObject
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

  private native void SetWindowInfo_4(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_4(bytes0, bytes0.length);
  }

  private native void SetParentInfo_5(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_5(bytes0, bytes0.length);
  }

  private native int[] GetPosition_6();
  public int[] GetPosition()
  {
    return GetPosition_6();
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

  private native int[] GetSize_9();
  public int[] GetSize()
  {
    return GetSize_9();
  }

  private native void SetSize_10(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_10(id0,id1);
  }

  private native void SetSize_11(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_11(id0);
  }

  private native int[] GetActualSize_12();
  public int[] GetActualSize()
  {
    return GetActualSize_12();
  }

  private native int[] GetScreenSize_13();
  public int[] GetScreenSize()
  {
    return GetScreenSize_13();
  }

  private native int GetMapped_14();
  public int GetMapped()
  {
    return GetMapped_14();
  }

  private native boolean GetShowWindow_15();
  public boolean GetShowWindow()
  {
    return GetShowWindow_15();
  }

  private native void SetShowWindow_16(boolean id0);
  public void SetShowWindow(boolean id0)
  {
    SetShowWindow_16(id0);
  }

  private native void ShowWindowOn_17();
  public void ShowWindowOn()
  {
    ShowWindowOn_17();
  }

  private native void ShowWindowOff_18();
  public void ShowWindowOff()
  {
    ShowWindowOff_18();
  }

  private native void SetUseOffScreenBuffers_19(boolean id0);
  public void SetUseOffScreenBuffers(boolean id0)
  {
    SetUseOffScreenBuffers_19(id0);
  }

  private native boolean GetUseOffScreenBuffers_20();
  public boolean GetUseOffScreenBuffers()
  {
    return GetUseOffScreenBuffers_20();
  }

  private native void UseOffScreenBuffersOn_21();
  public void UseOffScreenBuffersOn()
  {
    UseOffScreenBuffersOn_21();
  }

  private native void UseOffScreenBuffersOff_22();
  public void UseOffScreenBuffersOff()
  {
    UseOffScreenBuffersOff_22();
  }

  private native void SetErase_23(int id0);
  public void SetErase(int id0)
  {
    SetErase_23(id0);
  }

  private native int GetErase_24();
  public int GetErase()
  {
    return GetErase_24();
  }

  private native void EraseOn_25();
  public void EraseOn()
  {
    EraseOn_25();
  }

  private native void EraseOff_26();
  public void EraseOff()
  {
    EraseOff_26();
  }

  private native void SetDoubleBuffer_27(int id0);
  public void SetDoubleBuffer(int id0)
  {
    SetDoubleBuffer_27(id0);
  }

  private native int GetDoubleBuffer_28();
  public int GetDoubleBuffer()
  {
    return GetDoubleBuffer_28();
  }

  private native void DoubleBufferOn_29();
  public void DoubleBufferOn()
  {
    DoubleBufferOn_29();
  }

  private native void DoubleBufferOff_30();
  public void DoubleBufferOff()
  {
    DoubleBufferOff_30();
  }

  private native byte[] GetWindowName_31();
  public String GetWindowName()
  {
    return new String(GetWindowName_31(), StandardCharsets.UTF_8);
  }

  private native void SetWindowName_32(byte[] id0, int len0);
  public void SetWindowName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowName_32(bytes0, bytes0.length);
  }

  private native void Render_33();
  public void Render()
  {
    Render_33();
  }

  private native void ReleaseGraphicsResources_34(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_34(id0);
  }

  private native int GetPixelData_35(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6);
  public int GetPixelData(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6)
  {
    return GetPixelData_35(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int GetDPI_36();
  public int GetDPI()
  {
    return GetDPI_36();
  }

  private native void SetDPI_37(int id0);
  public void SetDPI(int id0)
  {
    SetDPI_37(id0);
  }

  private native int GetDPIMinValue_38();
  public int GetDPIMinValue()
  {
    return GetDPIMinValue_38();
  }

  private native int GetDPIMaxValue_39();
  public int GetDPIMaxValue()
  {
    return GetDPIMaxValue_39();
  }

  private native boolean DetectDPI_40();
  public boolean DetectDPI()
  {
    return DetectDPI_40();
  }

  private native void SetOffScreenRendering_41(int id0);
  public void SetOffScreenRendering(int id0)
  {
    SetOffScreenRendering_41(id0);
  }

  private native void OffScreenRenderingOn_42();
  public void OffScreenRenderingOn()
  {
    OffScreenRenderingOn_42();
  }

  private native void OffScreenRenderingOff_43();
  public void OffScreenRenderingOff()
  {
    OffScreenRenderingOff_43();
  }

  private native int GetOffScreenRendering_44();
  public int GetOffScreenRendering()
  {
    return GetOffScreenRendering_44();
  }

  private native void MakeCurrent_45();
  public void MakeCurrent()
  {
    MakeCurrent_45();
  }

  private native void ReleaseCurrent_46();
  public void ReleaseCurrent()
  {
    ReleaseCurrent_46();
  }

  private native void SetTileScale_47(int id0,int id1);
  public void SetTileScale(int id0,int id1)
  {
    SetTileScale_47(id0,id1);
  }

  private native void SetTileScale_48(int id0[]);
  public void SetTileScale(int id0[])
  {
    SetTileScale_48(id0);
  }

  private native int[] GetTileScale_49();
  public int[] GetTileScale()
  {
    return GetTileScale_49();
  }

  private native void SetTileScale_50(int id0);
  public void SetTileScale(int id0)
  {
    SetTileScale_50(id0);
  }

  private native void SetTileViewport_51(double id0,double id1,double id2,double id3);
  public void SetTileViewport(double id0,double id1,double id2,double id3)
  {
    SetTileViewport_51(id0,id1,id2,id3);
  }

  private native void SetTileViewport_52(double id0[]);
  public void SetTileViewport(double id0[])
  {
    SetTileViewport_52(id0);
  }

  private native double[] GetTileViewport_53();
  public double[] GetTileViewport()
  {
    return GetTileViewport_53();
  }

  public vtkWindow() { super(); }

  public vtkWindow(long id) { super(id); }

}
