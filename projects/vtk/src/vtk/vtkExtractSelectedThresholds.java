// java wrapper for vtkExtractSelectedThresholds object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkExtractSelectedThresholds extends vtkExtractSelectionBase
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

  private native int EvaluateValue_4(vtkDataArray id0,long id1,vtkDataArray id2);
  public int EvaluateValue(vtkDataArray id0,long id1,vtkDataArray id2)
  {
    return EvaluateValue_4(id0,id1,id2);
  }

  private native int EvaluateValue_5(vtkDataArray id0,int id1,long id2,vtkDataArray id3);
  public int EvaluateValue(vtkDataArray id0,int id1,long id2,vtkDataArray id3)
  {
    return EvaluateValue_5(id0,id1,id2,id3);
  }

  public vtkExtractSelectedThresholds() { super(); }

  public vtkExtractSelectedThresholds(long id) { super(id); }
  public native long   VTKInit();

}
