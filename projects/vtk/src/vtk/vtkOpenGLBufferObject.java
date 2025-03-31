// java wrapper for vtkOpenGLBufferObject object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOpenGLBufferObject extends vtkObject
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

  private native int GetType_4();
  public int GetType()
  {
    return GetType_4();
  }

  private native void SetType_5(int id0);
  public void SetType(int id0)
  {
    SetType_5(id0);
  }

  private native int GetHandle_6();
  public int GetHandle()
  {
    return GetHandle_6();
  }

  private native boolean IsReady_7();
  public boolean IsReady()
  {
    return IsReady_7();
  }

  private native boolean GenerateBuffer_8(int id0);
  public boolean GenerateBuffer(int id0)
  {
    return GenerateBuffer_8(id0);
  }

  private native boolean Bind_9();
  public boolean Bind()
  {
    return Bind_9();
  }

  private native boolean Release_10();
  public boolean Release()
  {
    return Release_10();
  }

  private native void ReleaseGraphicsResources_11();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_11();
  }

  private native byte[] GetError_12();
  public String GetError()
  {
    return new String(GetError_12(), StandardCharsets.UTF_8);
  }

  public vtkOpenGLBufferObject() { super(); }

  public vtkOpenGLBufferObject(long id) { super(id); }
  public native long   VTKInit();

}
