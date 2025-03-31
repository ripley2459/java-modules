// java wrapper for vtkOpenGLShaderProperty object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOpenGLShaderProperty extends vtkShaderProperty
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

  private native void DeepCopy_4(vtkOpenGLShaderProperty id0);
  public void DeepCopy(vtkOpenGLShaderProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native void AddVertexShaderReplacement_5(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddVertexShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddVertexShaderReplacement_5(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddFragmentShaderReplacement_6(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddFragmentShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddFragmentShaderReplacement_6(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native void AddGeometryShaderReplacement_7(byte[] id0, int len0,boolean id1,byte[] id2, int len2,boolean id3);
  public void AddGeometryShaderReplacement(String id0,boolean id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddGeometryShaderReplacement_7(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3);
  }

  private native int GetNumberOfShaderReplacements_8();
  public int GetNumberOfShaderReplacements()
  {
    return GetNumberOfShaderReplacements_8();
  }

  private native byte[] GetNthShaderReplacementTypeAsString_9(long id0);
  public String GetNthShaderReplacementTypeAsString(long id0)
  {
    return new String(GetNthShaderReplacementTypeAsString_9(id0), StandardCharsets.UTF_8);
  }

  private native void ClearVertexShaderReplacement_10(byte[] id0, int len0,boolean id1);
  public void ClearVertexShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearVertexShaderReplacement_10(bytes0, bytes0.length,id1);
  }

  private native void ClearFragmentShaderReplacement_11(byte[] id0, int len0,boolean id1);
  public void ClearFragmentShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearFragmentShaderReplacement_11(bytes0, bytes0.length,id1);
  }

  private native void ClearGeometryShaderReplacement_12(byte[] id0, int len0,boolean id1);
  public void ClearGeometryShaderReplacement(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearGeometryShaderReplacement_12(bytes0, bytes0.length,id1);
  }

  private native void ClearAllVertexShaderReplacements_13();
  public void ClearAllVertexShaderReplacements()
  {
    ClearAllVertexShaderReplacements_13();
  }

  private native void ClearAllFragmentShaderReplacements_14();
  public void ClearAllFragmentShaderReplacements()
  {
    ClearAllFragmentShaderReplacements_14();
  }

  private native void ClearAllGeometryShaderReplacements_15();
  public void ClearAllGeometryShaderReplacements()
  {
    ClearAllGeometryShaderReplacements_15();
  }

  private native void ClearAllShaderReplacements_16();
  public void ClearAllShaderReplacements()
  {
    ClearAllShaderReplacements_16();
  }

  private native void AddShaderReplacement_17(int id0,byte[] id1, int len1,boolean id2,byte[] id3, int len3,boolean id4);
  public void AddShaderReplacement(int id0,String id1,boolean id2,String id3,boolean id4)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    AddShaderReplacement_17(id0,bytes1, bytes1.length,id2,bytes3, bytes3.length,id4);
  }

  private native void ClearShaderReplacement_18(int id0,byte[] id1, int len1,boolean id2);
  public void ClearShaderReplacement(int id0,String id1,boolean id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    ClearShaderReplacement_18(id0,bytes1, bytes1.length,id2);
  }

  private native void ClearAllShaderReplacements_19(int id0);
  public void ClearAllShaderReplacements(int id0)
  {
    ClearAllShaderReplacements_19(id0);
  }

  public vtkOpenGLShaderProperty() { super(); }

  public vtkOpenGLShaderProperty(long id) { super(id); }
  public native long   VTKInit();

}
