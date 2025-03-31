// java wrapper for vtkOpenGLVertexBufferObjectCache object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOpenGLVertexBufferObjectCache extends vtkObject
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

  private native long GetVBO_4(vtkDataArray id0,int id1);
  public vtkOpenGLVertexBufferObject GetVBO(vtkDataArray id0,int id1)
  {
    long temp = GetVBO_4(id0,id1);

    if (temp == 0) return null;
    return (vtkOpenGLVertexBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveVBO_5(vtkOpenGLVertexBufferObject id0);
  public void RemoveVBO(vtkOpenGLVertexBufferObject id0)
  {
    RemoveVBO_5(id0);
  }

  public vtkOpenGLVertexBufferObjectCache() { super(); }

  public vtkOpenGLVertexBufferObjectCache(long id) { super(id); }
  public native long   VTKInit();

}
