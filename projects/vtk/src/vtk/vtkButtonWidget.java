// java wrapper for vtkButtonWidget object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkButtonWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkButtonRepresentation id0);
  public void SetRepresentation(vtkButtonRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long GetSliderRepresentation_5();
  public vtkButtonRepresentation GetSliderRepresentation()
  {
    long temp = GetSliderRepresentation_5();

    if (temp == 0) return null;
    return (vtkButtonRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_6();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_6();
  }

  private native void SetEnabled_7(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_7(id0);
  }

  public vtkButtonWidget() { super(); }

  public vtkButtonWidget(long id) { super(id); }
  public native long   VTKInit();

}
