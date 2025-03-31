// java wrapper for vtkExtractSelectedRows object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkExtractSelectedRows extends vtkTableAlgorithm
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

  private native void SetSelectionConnection_4(vtkAlgorithmOutput id0);
  public void SetSelectionConnection(vtkAlgorithmOutput id0)
  {
    SetSelectionConnection_4(id0);
  }

  private native void SetAnnotationLayersConnection_5(vtkAlgorithmOutput id0);
  public void SetAnnotationLayersConnection(vtkAlgorithmOutput id0)
  {
    SetAnnotationLayersConnection_5(id0);
  }

  private native int FillInputPortInformation_6(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_6(id0,id1);
  }

  private native void SetAddOriginalRowIdsArray_7(boolean id0);
  public void SetAddOriginalRowIdsArray(boolean id0)
  {
    SetAddOriginalRowIdsArray_7(id0);
  }

  private native boolean GetAddOriginalRowIdsArray_8();
  public boolean GetAddOriginalRowIdsArray()
  {
    return GetAddOriginalRowIdsArray_8();
  }

  private native void AddOriginalRowIdsArrayOn_9();
  public void AddOriginalRowIdsArrayOn()
  {
    AddOriginalRowIdsArrayOn_9();
  }

  private native void AddOriginalRowIdsArrayOff_10();
  public void AddOriginalRowIdsArrayOff()
  {
    AddOriginalRowIdsArrayOff_10();
  }

  public vtkExtractSelectedRows() { super(); }

  public vtkExtractSelectedRows(long id) { super(id); }
  public native long   VTKInit();

}
