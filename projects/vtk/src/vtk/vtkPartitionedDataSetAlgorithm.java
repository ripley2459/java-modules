// java wrapper for vtkPartitionedDataSetAlgorithm object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkPartitionedDataSetAlgorithm extends vtkAlgorithm
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

  private native long GetOutput_4();
  public vtkPartitionedDataSet GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkPartitionedDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkPartitionedDataSet GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkPartitionedDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPartitionedDataSetAlgorithm() { super(); }

  public vtkPartitionedDataSetAlgorithm(long id) { super(id); }

}
