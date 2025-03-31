// java wrapper for vtkOpenGLShaderCache object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOpenGLShaderCache extends vtkObject
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

  private native long ReadyShaderProgram_4(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,vtkTransformFeedback id3);
  public vtkShaderProgram ReadyShaderProgram(String id0,String id1,String id2,vtkTransformFeedback id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = ReadyShaderProgram_4(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,id3);

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ReadyShaderProgram_5(vtkShaderProgram id0,vtkTransformFeedback id1);
  public vtkShaderProgram ReadyShaderProgram(vtkShaderProgram id0,vtkTransformFeedback id1)
  {
    long temp = ReadyShaderProgram_5(id0,id1);

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseCurrentShader_6();
  public void ReleaseCurrentShader()
  {
    ReleaseCurrentShader_6();
  }

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  private native void ClearLastShaderBound_8();
  public void ClearLastShaderBound()
  {
    ClearLastShaderBound_8();
  }

  private native long GetLastShaderBound_9();
  public vtkShaderProgram GetLastShaderBound()
  {
    long temp = GetLastShaderBound_9();

    if (temp == 0) return null;
    return (vtkShaderProgram)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetElapsedTime_10(float id0);
  public void SetElapsedTime(float id0)
  {
    SetElapsedTime_10(id0);
  }

  public vtkOpenGLShaderCache() { super(); }

  public vtkOpenGLShaderCache(long id) { super(id); }
  public native long   VTKInit();

}
