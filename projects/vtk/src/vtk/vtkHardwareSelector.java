// java wrapper for vtkHardwareSelector object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHardwareSelector extends vtkObject
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetArea_6(int id0,int id1,int id2,int id3);
  public void SetArea(int id0,int id1,int id2,int id3)
  {
    SetArea_6(id0,id1,id2,id3);
  }

  private native void SetFieldAssociation_7(int id0);
  public void SetFieldAssociation(int id0)
  {
    SetFieldAssociation_7(id0);
  }

  private native int GetFieldAssociation_8();
  public int GetFieldAssociation()
  {
    return GetFieldAssociation_8();
  }

  private native void SetUseProcessIdFromData_9(boolean id0);
  public void SetUseProcessIdFromData(boolean id0)
  {
    SetUseProcessIdFromData_9(id0);
  }

  private native boolean GetUseProcessIdFromData_10();
  public boolean GetUseProcessIdFromData()
  {
    return GetUseProcessIdFromData_10();
  }

  private native long Select_11();
  public vtkSelection Select()
  {
    long temp = Select_11();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean CaptureBuffers_12();
  public boolean CaptureBuffers()
  {
    return CaptureBuffers_12();
  }

  private native void ClearBuffers_13();
  public void ClearBuffers()
  {
    ClearBuffers_13();
  }

  private native void RenderCompositeIndex_14(int id0);
  public void RenderCompositeIndex(int id0)
  {
    RenderCompositeIndex_14(id0);
  }

  private native void UpdateMaximumCellId_15(long id0);
  public void UpdateMaximumCellId(long id0)
  {
    UpdateMaximumCellId_15(id0);
  }

  private native void UpdateMaximumPointId_16(long id0);
  public void UpdateMaximumPointId(long id0)
  {
    UpdateMaximumPointId_16(id0);
  }

  private native void RenderProcessId_17(int id0);
  public void RenderProcessId(int id0)
  {
    RenderProcessId_17(id0);
  }

  private native boolean GetActorPassOnly_18();
  public boolean GetActorPassOnly()
  {
    return GetActorPassOnly_18();
  }

  private native void SetActorPassOnly_19(boolean id0);
  public void SetActorPassOnly(boolean id0)
  {
    SetActorPassOnly_19(id0);
  }

  private native boolean GetCaptureZValues_20();
  public boolean GetCaptureZValues()
  {
    return GetCaptureZValues_20();
  }

  private native void SetCaptureZValues_21(boolean id0);
  public void SetCaptureZValues(boolean id0)
  {
    SetCaptureZValues_21(id0);
  }

  private native void BeginRenderProp_22();
  public void BeginRenderProp()
  {
    BeginRenderProp_22();
  }

  private native void EndRenderProp_23();
  public void EndRenderProp()
  {
    EndRenderProp_23();
  }

  private native void SetProcessID_24(int id0);
  public void SetProcessID(int id0)
  {
    SetProcessID_24(id0);
  }

  private native int GetProcessID_25();
  public int GetProcessID()
  {
    return GetProcessID_25();
  }

  private native float[] GetPropColorValue_26();
  public float[] GetPropColorValue()
  {
    return GetPropColorValue_26();
  }

  private native void SetPropColorValue_27(float id0,float id1,float id2);
  public void SetPropColorValue(float id0,float id1,float id2)
  {
    SetPropColorValue_27(id0,id1,id2);
  }

  private native void SetPropColorValue_28(float id0[]);
  public void SetPropColorValue(float id0[])
  {
    SetPropColorValue_28(id0);
  }

  private native void SetPropColorValue_29(long id0);
  public void SetPropColorValue(long id0)
  {
    SetPropColorValue_29(id0);
  }

  private native int GetCurrentPass_30();
  public int GetCurrentPass()
  {
    return GetCurrentPass_30();
  }

  private native long GenerateSelection_31();
  public vtkSelection GenerateSelection()
  {
    long temp = GenerateSelection_31();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GenerateSelection_32(int id0,int id1,int id2,int id3);
  public vtkSelection GenerateSelection(int id0,int id1,int id2,int id3)
  {
    long temp = GenerateSelection_32(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropFromID_33(int id0);
  public vtkProp GetPropFromID(int id0)
  {
    long temp = GetPropFromID_33(id0);

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] PassTypeToString_34(int id0);
  public String PassTypeToString(int id0)
  {
    return new String(PassTypeToString_34(id0), StandardCharsets.UTF_8);
  }

  private native void Convert_35(long id0,float id1[]);
  public void Convert(long id0,float id1[])
  {
    Convert_35(id0,id1);
  }

  private native void SavePixelBuffer_36(int id0);
  public void SavePixelBuffer(int id0)
  {
    SavePixelBuffer_36(id0);
  }

  private native boolean HasHighCellIds_37();
  public boolean HasHighCellIds()
  {
    return HasHighCellIds_37();
  }

  private native boolean HasHighPointIds_38();
  public boolean HasHighPointIds()
  {
    return HasHighPointIds_38();
  }

  public vtkHardwareSelector() { super(); }

  public vtkHardwareSelector(long id) { super(id); }
  public native long   VTKInit();

}
