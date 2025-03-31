// java wrapper for vtkCellTypes object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCellTypes extends vtkObject
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

  private native int Allocate_4(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_4(id0,id1);
  }

  private native void InsertCell_5(long id0,byte id1,long id2);
  public void InsertCell(long id0,byte id1,long id2)
  {
    InsertCell_5(id0,id1,id2);
  }

  private native long InsertNextCell_6(byte id0,long id1);
  public long InsertNextCell(byte id0,long id1)
  {
    return InsertNextCell_6(id0,id1);
  }

  private native void SetCellTypes_7(long id0,vtkUnsignedCharArray id1,vtkIdTypeArray id2);
  public void SetCellTypes(long id0,vtkUnsignedCharArray id1,vtkIdTypeArray id2)
  {
    SetCellTypes_7(id0,id1,id2);
  }

  private native void SetCellTypes_8(long id0,vtkUnsignedCharArray id1);
  public void SetCellTypes(long id0,vtkUnsignedCharArray id1)
  {
    SetCellTypes_8(id0,id1);
  }

  private native void SetCellTypes_9(long id0,vtkUnsignedCharArray id1,vtkIntArray id2);
  public void SetCellTypes(long id0,vtkUnsignedCharArray id1,vtkIntArray id2)
  {
    SetCellTypes_9(id0,id1,id2);
  }

  private native long GetCellLocation_10(long id0);
  public long GetCellLocation(long id0)
  {
    return GetCellLocation_10(id0);
  }

  private native void DeleteCell_11(long id0);
  public void DeleteCell(long id0)
  {
    DeleteCell_11(id0);
  }

  private native long GetNumberOfTypes_12();
  public long GetNumberOfTypes()
  {
    return GetNumberOfTypes_12();
  }

  private native int IsType_13(byte id0);
  public int IsType(byte id0)
  {
    return IsType_13(id0);
  }

  private native long InsertNextType_14(byte id0);
  public long InsertNextType(byte id0)
  {
    return InsertNextType_14(id0);
  }

  private native byte GetCellType_15(long id0);
  public byte GetCellType(long id0)
  {
    return GetCellType_15(id0);
  }

  private native void Squeeze_16();
  public void Squeeze()
  {
    Squeeze_16();
  }

  private native void Reset_17();
  public void Reset()
  {
    Reset_17();
  }

  private native long GetActualMemorySize_18();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_18();
  }

  private native void DeepCopy_19(vtkCellTypes id0);
  public void DeepCopy(vtkCellTypes id0)
  {
    DeepCopy_19(id0);
  }

  private native byte[] GetClassNameFromTypeId_20(int id0);
  public String GetClassNameFromTypeId(int id0)
  {
    return new String(GetClassNameFromTypeId_20(id0), StandardCharsets.UTF_8);
  }

  private native int GetTypeIdFromClassName_21(byte[] id0, int len0);
  public int GetTypeIdFromClassName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetTypeIdFromClassName_21(bytes0, bytes0.length);
  }

  private native int IsLinear_22(byte id0);
  public int IsLinear(byte id0)
  {
    return IsLinear_22(id0);
  }

  private native int GetDimension_23(byte id0);
  public int GetDimension(byte id0)
  {
    return GetDimension_23(id0);
  }

  private native long GetCellTypesArray_24();
  public vtkUnsignedCharArray GetCellTypesArray()
  {
    long temp = GetCellTypesArray_24();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellLocationsArray_25();
  public vtkIdTypeArray GetCellLocationsArray()
  {
    long temp = GetCellLocationsArray_25();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellTypes() { super(); }

  public vtkCellTypes(long id) { super(id); }
  public native long   VTKInit();

}
