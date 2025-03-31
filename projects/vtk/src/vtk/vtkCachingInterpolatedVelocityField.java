// java wrapper for vtkCachingInterpolatedVelocityField object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCachingInterpolatedVelocityField extends vtkFunctionSet
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

  private native void SetDataSet_4(int id0,vtkDataSet id1,boolean id2,vtkAbstractCellLocator id3);
  public void SetDataSet(int id0,vtkDataSet id1,boolean id2,vtkAbstractCellLocator id3)
  {
    SetDataSet_4(id0,id1,id2,id3);
  }

  private native byte[] GetVectorsSelection_5();
  public String GetVectorsSelection()
  {
    return new String(GetVectorsSelection_5(), StandardCharsets.UTF_8);
  }

  private native void SelectVectors_6(byte[] id0, int len0);
  public void SelectVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectVectors_6(bytes0, bytes0.length);
  }

  private native void SetLastCellInfo_7(long id0,int id1);
  public void SetLastCellInfo(long id0,int id1)
  {
    SetLastCellInfo_7(id0,id1);
  }

  private native void ClearLastCellInfo_8();
  public void ClearLastCellInfo()
  {
    ClearLastCellInfo_8();
  }

  private native int GetLastLocalCoordinates_9(double id0[]);
  public int GetLastLocalCoordinates(double id0[])
  {
    return GetLastLocalCoordinates_9(id0);
  }

  private native int GetCellCacheHit_10();
  public int GetCellCacheHit()
  {
    return GetCellCacheHit_10();
  }

  private native int GetDataSetCacheHit_11();
  public int GetDataSetCacheHit()
  {
    return GetDataSetCacheHit_11();
  }

  private native int GetCacheMiss_12();
  public int GetCacheMiss()
  {
    return GetCacheMiss_12();
  }

  public vtkCachingInterpolatedVelocityField() { super(); }

  public vtkCachingInterpolatedVelocityField(long id) { super(id); }
  public native long   VTKInit();

}
