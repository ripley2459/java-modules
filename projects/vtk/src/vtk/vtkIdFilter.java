// java wrapper for vtkIdFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkIdFilter extends vtkDataSetAlgorithm
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

  private native void SetPointIds_4(int id0);
  public void SetPointIds(int id0)
  {
    SetPointIds_4(id0);
  }

  private native int GetPointIds_5();
  public int GetPointIds()
  {
    return GetPointIds_5();
  }

  private native void PointIdsOn_6();
  public void PointIdsOn()
  {
    PointIdsOn_6();
  }

  private native void PointIdsOff_7();
  public void PointIdsOff()
  {
    PointIdsOff_7();
  }

  private native void SetCellIds_8(int id0);
  public void SetCellIds(int id0)
  {
    SetCellIds_8(id0);
  }

  private native int GetCellIds_9();
  public int GetCellIds()
  {
    return GetCellIds_9();
  }

  private native void CellIdsOn_10();
  public void CellIdsOn()
  {
    CellIdsOn_10();
  }

  private native void CellIdsOff_11();
  public void CellIdsOff()
  {
    CellIdsOff_11();
  }

  private native void SetFieldData_12(int id0);
  public void SetFieldData(int id0)
  {
    SetFieldData_12(id0);
  }

  private native int GetFieldData_13();
  public int GetFieldData()
  {
    return GetFieldData_13();
  }

  private native void FieldDataOn_14();
  public void FieldDataOn()
  {
    FieldDataOn_14();
  }

  private native void FieldDataOff_15();
  public void FieldDataOff()
  {
    FieldDataOff_15();
  }

  private native void SetPointIdsArrayName_16(byte[] id0, int len0);
  public void SetPointIdsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointIdsArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetPointIdsArrayName_17();
  public String GetPointIdsArrayName()
  {
    return new String(GetPointIdsArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetCellIdsArrayName_18(byte[] id0, int len0);
  public void SetCellIdsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellIdsArrayName_18(bytes0, bytes0.length);
  }

  private native byte[] GetCellIdsArrayName_19();
  public String GetCellIdsArrayName()
  {
    return new String(GetCellIdsArrayName_19(), StandardCharsets.UTF_8);
  }

  public vtkIdFilter() { super(); }

  public vtkIdFilter(long id) { super(id); }
  public native long   VTKInit();

}
