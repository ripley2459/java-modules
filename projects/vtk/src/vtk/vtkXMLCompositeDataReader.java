// java wrapper for vtkXMLCompositeDataReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkXMLCompositeDataReader extends vtkXMLReader
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

  private native void SetPieceDistribution_4(int id0);
  public void SetPieceDistribution(int id0)
  {
    SetPieceDistribution_4(id0);
  }

  private native int GetPieceDistributionMinValue_5();
  public int GetPieceDistributionMinValue()
  {
    return GetPieceDistributionMinValue_5();
  }

  private native int GetPieceDistributionMaxValue_6();
  public int GetPieceDistributionMaxValue()
  {
    return GetPieceDistributionMaxValue_6();
  }

  private native int GetPieceDistribution_7();
  public int GetPieceDistribution()
  {
    return GetPieceDistribution_7();
  }

  private native long GetOutput_8();
  public vtkCompositeDataSet GetOutput()
  {
    long temp = GetOutput_8();

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_9(int id0);
  public vtkCompositeDataSet GetOutput(int id0)
  {
    long temp = GetOutput_9(id0);

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_10(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_10(bytes0, bytes0.length);
  }

  public vtkXMLCompositeDataReader() { super(); }

  public vtkXMLCompositeDataReader(long id) { super(id); }

}
