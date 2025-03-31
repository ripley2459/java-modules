// java wrapper for vtkShaderProgram object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkShaderProgram extends vtkObject
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

  private native long GetVertexShader_4();
  public vtkShader GetVertexShader()
  {
    long temp = GetVertexShader_4();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVertexShader_5(vtkShader id0);
  public void SetVertexShader(vtkShader id0)
  {
    SetVertexShader_5(id0);
  }

  private native long GetFragmentShader_6();
  public vtkShader GetFragmentShader()
  {
    long temp = GetFragmentShader_6();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFragmentShader_7(vtkShader id0);
  public void SetFragmentShader(vtkShader id0)
  {
    SetFragmentShader_7(id0);
  }

  private native long GetGeometryShader_8();
  public vtkShader GetGeometryShader()
  {
    long temp = GetGeometryShader_8();

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeometryShader_9(vtkShader id0);
  public void SetGeometryShader(vtkShader id0)
  {
    SetGeometryShader_9(id0);
  }

  private native long GetTransformFeedback_10();
  public vtkTransformFeedback GetTransformFeedback()
  {
    long temp = GetTransformFeedback_10();

    if (temp == 0) return null;
    return (vtkTransformFeedback)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransformFeedback_11(vtkTransformFeedback id0);
  public void SetTransformFeedback(vtkTransformFeedback id0)
  {
    SetTransformFeedback_11(id0);
  }

  private native boolean GetCompiled_12();
  public boolean GetCompiled()
  {
    return GetCompiled_12();
  }

  private native void SetCompiled_13(boolean id0);
  public void SetCompiled(boolean id0)
  {
    SetCompiled_13(id0);
  }

  private native void CompiledOn_14();
  public void CompiledOn()
  {
    CompiledOn_14();
  }

  private native void CompiledOff_15();
  public void CompiledOff()
  {
    CompiledOff_15();
  }

  private native byte[] GetMD5Hash_16();
  public String GetMD5Hash()
  {
    return new String(GetMD5Hash_16(), StandardCharsets.UTF_8);
  }

  private native void SetMD5Hash_17(byte[] id0, int len0);
  public void SetMD5Hash(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMD5Hash_17(bytes0, bytes0.length);
  }

  private native boolean isBound_18();
  public boolean isBound()
  {
    return isBound_18();
  }

  private native void ReleaseGraphicsResources_19(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_19(id0);
  }

  private native int GetHandle_20();
  public int GetHandle()
  {
    return GetHandle_20();
  }

  private native byte[] GetError_21();
  public String GetError()
  {
    return new String(GetError_21(), StandardCharsets.UTF_8);
  }

  private native boolean EnableAttributeArray_22(byte[] id0, int len0);
  public boolean EnableAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return EnableAttributeArray_22(bytes0, bytes0.length);
  }

  private native boolean DisableAttributeArray_23(byte[] id0, int len0);
  public boolean DisableAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return DisableAttributeArray_23(bytes0, bytes0.length);
  }

  private native boolean SetUniformi_24(byte[] id0, int len0,int id1);
  public boolean SetUniformi(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformi_24(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniformf_25(byte[] id0, int len0,float id1);
  public boolean SetUniformf(String id0,float id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformf_25(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform2i_26(byte[] id0, int len0,int id1[]);
  public boolean SetUniform2i(String id0,int id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform2i_26(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform2f_27(byte[] id0, int len0,float id1[]);
  public boolean SetUniform2f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform2f_27(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform3f_28(byte[] id0, int len0,float id1[]);
  public boolean SetUniform3f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform3f_28(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform3f_29(byte[] id0, int len0,double id1[]);
  public boolean SetUniform3f(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform3f_29(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniform4f_30(byte[] id0, int len0,float id1[]);
  public boolean SetUniform4f(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniform4f_30(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniformMatrix_31(byte[] id0, int len0,vtkMatrix3x3 id1);
  public boolean SetUniformMatrix(String id0,vtkMatrix3x3 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformMatrix_31(bytes0, bytes0.length,id1);
  }

  private native boolean SetUniformMatrix_32(byte[] id0, int len0,vtkMatrix4x4 id1);
  public boolean SetUniformMatrix(String id0,vtkMatrix4x4 id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetUniformMatrix_32(bytes0, bytes0.length,id1);
  }

  private native void SetNumberOfOutputs_33(int id0);
  public void SetNumberOfOutputs(int id0)
  {
    SetNumberOfOutputs_33(id0);
  }

  private native boolean Substitute_34(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,boolean id3);
  public boolean Substitute(String id0,String id1,String id2,boolean id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return Substitute_34(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3);
  }

  private native boolean Substitute_35(vtkShader id0,byte[] id1, int len1,byte[] id2, int len2,boolean id3);
  public boolean Substitute(vtkShader id0,String id1,String id2,boolean id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return Substitute_35(id0,bytes1, bytes1.length,bytes2, bytes2.length,id3);
  }

  private native boolean IsUniformUsed_36(byte[] id0, int len0);
  public boolean IsUniformUsed(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsUniformUsed_36(bytes0, bytes0.length);
  }

  private native boolean IsAttributeUsed_37(byte[] id0, int len0);
  public boolean IsAttributeUsed(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsAttributeUsed_37(bytes0, bytes0.length);
  }

  private native void SetFileNamePrefixForDebugging_38(byte[] id0, int len0);
  public void SetFileNamePrefixForDebugging(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileNamePrefixForDebugging_38(bytes0, bytes0.length);
  }

  private native byte[] GetFileNamePrefixForDebugging_39();
  public String GetFileNamePrefixForDebugging()
  {
    return new String(GetFileNamePrefixForDebugging_39(), StandardCharsets.UTF_8);
  }

  private native void SetUniformGroupUpdateTime_40(int id0,long id1);
  public void SetUniformGroupUpdateTime(int id0,long id1)
  {
    SetUniformGroupUpdateTime_40(id0,id1);
  }

  private native long GetUniformGroupUpdateTime_41(int id0);
  public long GetUniformGroupUpdateTime(int id0)
  {
    return GetUniformGroupUpdateTime_41(id0);
  }

  private native int FindUniform_42(byte[] id0, int len0);
  public int FindUniform(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FindUniform_42(bytes0, bytes0.length);
  }

  private native int FindAttributeArray_43(byte[] id0, int len0);
  public int FindAttributeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FindAttributeArray_43(bytes0, bytes0.length);
  }

  public vtkShaderProgram() { super(); }

  public vtkShaderProgram(long id) { super(id); }
  public native long   VTKInit();

}
