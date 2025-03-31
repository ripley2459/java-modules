// java wrapper for vtkUnsignedCharArray object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkUnsignedCharArray extends vtkDataArray
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

  private native long ExtendedNew_4();
  public vtkUnsignedCharArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native byte GetValue_6(long id0);
  public byte GetValue(long id0)
  {
    return GetValue_6(id0);
  }

  private native void SetValue_7(long id0,byte id1);
  public void SetValue(long id0,byte id1)
  {
    SetValue_7(id0,id1);
  }

  private native boolean SetNumberOfValues_8(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_8(id0);
  }

  private native void InsertValue_9(long id0,byte id1);
  public void InsertValue(long id0,byte id1)
  {
    InsertValue_9(id0,id1);
  }

  private native long InsertNextValue_10(byte id0);
  public long InsertNextValue(byte id0)
  {
    return InsertNextValue_10(id0);
  }

  private native byte[]  GetValueRange_11(int id0);
  public byte[]  GetValueRange(int id0)
  {
    return GetValueRange_11(id0);
  }

  private native byte[]  GetValueRange_12();
  public byte[]  GetValueRange()
  {
    return GetValueRange_12();
  }

  private native long FastDownCast_13(vtkAbstractArray id0);
  public vtkUnsignedCharArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_13(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte GetDataTypeValueMin_14();
  public byte GetDataTypeValueMin()
  {
    return GetDataTypeValueMin_14();
  }

  private native byte GetDataTypeValueMax_15();
  public byte GetDataTypeValueMax()
  {
    return GetDataTypeValueMax_15();
  }

  private native byte[] GetJavaArray_0();
  public byte[] GetJavaArray()
  {
    return GetJavaArray_0();
  }

  private native void SetJavaArray_0(byte[] arr, int length);
  public void SetJavaArray(byte[] arr)
  {
    SetJavaArray_0(arr,arr.length);
  }

  public vtkUnsignedCharArray() { super(); }

  public vtkUnsignedCharArray(long id) { super(id); }
  public native long   VTKInit();

}
