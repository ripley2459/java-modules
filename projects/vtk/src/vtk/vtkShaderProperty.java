// java wrapper for vtkShaderProperty object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkShaderProperty extends vtkObject
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

  private native void DeepCopy_4(vtkShaderProperty id0);
  public void DeepCopy(vtkShaderProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native long GetShaderMTime_5();
  public long GetShaderMTime()
  {
    return GetShaderMTime_5();
  }

  private native boolean HasVertexShaderCode_6();
  public boolean HasVertexShaderCode()
  {
    return HasVertexShaderCode_6();
  }

  private native boolean HasFragmentShaderCode_7();
  public boolean HasFragmentShaderCode()
  {
    return HasFragmentShaderCode_7();
  }

  private native boolean HasGeometryShaderCode_8();
  public boolean HasGeometryShaderCode()
  {
    return HasGeometryShaderCode_8();
  }

  private native void SetVertexShaderCode_9(byte[] id0, int len0);
  public void SetVertexShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexShaderCode_9(bytes0, bytes0.length);
  }

  private native byte[] GetVertexShaderCode_10();
  public String GetVertexShaderCode()
  {
    return new String(GetVertexShaderCode_10(), StandardCharsets.UTF_8);
  }

  private native void SetFragmentShaderCode_11(byte[] id0, int len0);
  public void SetFragmentShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFragmentShaderCode_11(bytes0, bytes0.length);
  }

  private native byte[] GetFragmentShaderCode_12();
  public String GetFragmentShaderCode()
  {
    return new String(GetFragmentShaderCode_12(), StandardCharsets.UTF_8);
  }

  private native void SetGeometryShaderCode_13(byte[] id0, int len0);
  public void SetGeometryShaderCode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGeometryShaderCode_13(bytes0, bytes0.length);
  }

  private native byte[] GetGeometryShaderCode_14();
  public String GetGeometryShaderCode()
  {
    return new String(GetGeometryShaderCode_14(), StandardCharsets.UTF_8);
  }

  private native long GetFragmentCustomUniforms_15();
  public vtkUniforms GetFragmentCustomUniforms()
  {
    long temp = GetFragmentCustomUniforms_15();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexCustomUniforms_16();
  public vtkUniforms GetVertexCustomUniforms()
  {
    long temp = GetVertexCustomUniforms_16();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGeometryCustomUniforms_17();
  public vtkUniforms GetGeometryCustomUniforms()
  {
    long temp = GetGeometryCustomUniforms_17();

    if (temp == 0) return null;
    return (vtkUniforms)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddVertexShaderReplacement_18(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddVertexShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddVertexShaderReplacement_18(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddFragmentShaderReplacement_19(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddFragmentShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddFragmentShaderReplacement_19(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddGeometryShaderReplacement_20(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddGeometryShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddGeometryShaderReplacement_20(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native int GetNumberOfShaderReplacements_21();
  public int GetNumberOfShaderReplacements()
  {
    return GetNumberOfShaderReplacements_21();
  }

  private native byte[] GetNthShaderReplacementTypeAsString_22(long id0);
  public String GetNthShaderReplacementTypeAsString(long id0)
  {
    return new String(GetNthShaderReplacementTypeAsString_22(id0), StandardCharsets.UTF_8);
  }

  private native void ClearVertexShaderReplacement_23(byte[] id0, int len0,boolean id1);
  public void ClearVertexShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearVertexShaderReplacement_23(bytes0, bytes0.length,id1);
  }

  private native void ClearFragmentShaderReplacement_24(byte[] id0, int len0,boolean id1);
  public void ClearFragmentShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearFragmentShaderReplacement_24(bytes0, bytes0.length,id1);
  }

  private native void ClearGeometryShaderReplacement_25(byte[] id0, int len0,boolean id1);
  public void ClearGeometryShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearGeometryShaderReplacement_25(bytes0, bytes0.length,id1);
  }

  private native void ClearAllVertexShaderReplacements_26();
  public void ClearAllVertexShaderReplacements()
  {
    ClearAllVertexShaderReplacements_26();
  }

  private native void ClearAllFragmentShaderReplacements_27();
  public void ClearAllFragmentShaderReplacements()
  {
    ClearAllFragmentShaderReplacements_27();
  }

  private native void ClearAllGeometryShaderReplacements_28();
  public void ClearAllGeometryShaderReplacements()
  {
    ClearAllGeometryShaderReplacements_28();
  }

  private native void ClearAllShaderReplacements_29();
  public void ClearAllShaderReplacements()
  {
    ClearAllShaderReplacements_29();
  }

  public vtkShaderProperty() { super(); }

  public vtkShaderProperty(long id) { super(id); }
  public native long   VTKInit();

}
