// java wrapper for vtkDoubleArray object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkDoubleArray extends vtkDataArray
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
  public vtkDoubleArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native double GetValue_6(long id0);
  public double GetValue(long id0)
  {
    return GetValue_6(id0);
  }

  private native void SetValue_7(long id0,double id1);
  public void SetValue(long id0,double id1)
  {
    SetValue_7(id0,id1);
  }

  private native boolean SetNumberOfValues_8(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_8(id0);
  }

  private native void InsertValue_9(long id0,double id1);
  public void InsertValue(long id0,double id1)
  {
    InsertValue_9(id0,id1);
  }

  private native long InsertNextValue_10(double id0);
  public long InsertNextValue(double id0)
  {
    return InsertNextValue_10(id0);
  }

  private native double[] GetValueRange_11(int id0);
  public double[] GetValueRange(int id0)
  {
    return GetValueRange_11(id0);
  }

  private native double[] GetValueRange_12();
  public double[] GetValueRange()
  {
    return GetValueRange_12();
  }

  private native long FastDownCast_13(vtkAbstractArray id0);
  public vtkDoubleArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_13(id0);

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetDataTypeValueMin_14();
  public double GetDataTypeValueMin()
  {
    return GetDataTypeValueMin_14();
  }

  private native double GetDataTypeValueMax_15();
  public double GetDataTypeValueMax()
  {
    return GetDataTypeValueMax_15();
  }

  private native double[] GetJavaArray_0();
  public double[] GetJavaArray()
  {
    return GetJavaArray_0();
  }

  private native void SetJavaArray_0(double[] arr, int length);
  public void SetJavaArray(double[] arr)
  {
    SetJavaArray_0(arr,arr.length);
  }

  public vtkDoubleArray() { super(); }

  public vtkDoubleArray(long id) { super(id); }
  public native long   VTKInit();

}
