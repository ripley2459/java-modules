// java wrapper for vtkGLSLModPixelDebugger object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGLSLModPixelDebugger extends vtkGLSLModifierBase
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

  private native void SetSubstitutionJSONFileName_4(byte[] id0, int len0);
  public void SetSubstitutionJSONFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSubstitutionJSONFileName_4(bytes0, bytes0.length);
  }

  private native boolean ReplaceShaderValues_5(vtkOpenGLRenderer id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,vtkAbstractMapper id4,vtkActor id5);
  public boolean ReplaceShaderValues(vtkOpenGLRenderer id0,String id1,String id2,String id3,vtkAbstractMapper id4,vtkActor id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    return ReplaceShaderValues_5(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,id4,id5);
  }

  private native boolean SetShaderParameters_6(vtkOpenGLRenderer id0,vtkShaderProgram id1,vtkAbstractMapper id2,vtkActor id3,vtkOpenGLVertexArrayObject id4);
  public boolean SetShaderParameters(vtkOpenGLRenderer id0,vtkShaderProgram id1,vtkAbstractMapper id2,vtkActor id3,vtkOpenGLVertexArrayObject id4)
  {
    return SetShaderParameters_6(id0,id1,id2,id3,id4);
  }

  private native boolean IsUpToDate_7(vtkOpenGLRenderer id0,vtkAbstractMapper id1,vtkActor id2);
  public boolean IsUpToDate(vtkOpenGLRenderer id0,vtkAbstractMapper id1,vtkActor id2)
  {
    return IsUpToDate_7(id0,id1,id2);
  }

  public vtkGLSLModPixelDebugger() { super(); }

  public vtkGLSLModPixelDebugger(long id) { super(id); }
  public native long   VTKInit();

}
