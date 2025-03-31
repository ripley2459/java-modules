// java wrapper for vtkFreeTypeLabelRenderStrategy object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkFreeTypeLabelRenderStrategy extends vtkLabelRenderStrategy
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

  private native boolean SupportsRotation_4();
  public boolean SupportsRotation()
  {
    return SupportsRotation_4();
  }

  private native boolean SupportsBoundedSize_5();
  public boolean SupportsBoundedSize()
  {
    return SupportsBoundedSize_5();
  }

  private native void ComputeLabelBounds_6(vtkTextProperty id0,byte[] id1, int len1,double id2[]);
  public void ComputeLabelBounds(vtkTextProperty id0,String id1,double id2[])
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    ComputeLabelBounds_6(id0,bytes1, bytes1.length,id2);
  }

  private native void RenderLabel_7(int id0[],vtkTextProperty id1,byte[] id2, int len2);
  public void RenderLabel(int id0[],vtkTextProperty id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    RenderLabel_7(id0,id1,bytes2, bytes2.length);
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  public vtkFreeTypeLabelRenderStrategy() { super(); }

  public vtkFreeTypeLabelRenderStrategy(long id) { super(id); }
  public native long   VTKInit();

}
