// java wrapper for vtkTreeRingToPolyData object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkTreeRingToPolyData extends vtkPolyDataAlgorithm
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

  private native void SetSectorsArrayName_4(byte[] id0, int len0);
  public void SetSectorsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSectorsArrayName_4(bytes0, bytes0.length);
  }

  private native void SetShrinkPercentage_5(double id0);
  public void SetShrinkPercentage(double id0)
  {
    SetShrinkPercentage_5(id0);
  }

  private native double GetShrinkPercentage_6();
  public double GetShrinkPercentage()
  {
    return GetShrinkPercentage_6();
  }

  private native int FillInputPortInformation_7(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_7(id0,id1);
  }

  public vtkTreeRingToPolyData() { super(); }

  public vtkTreeRingToPolyData(long id) { super(id); }
  public native long   VTKInit();

}
