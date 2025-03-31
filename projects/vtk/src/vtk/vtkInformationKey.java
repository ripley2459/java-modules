// java wrapper for vtkInformationKey object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkInformationKey extends vtkObjectBase
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

  private native void Register_4(vtkObjectBase id0);
  public void Register(vtkObjectBase id0)
  {
    Register_4(id0);
  }

  private native void UnRegister_5(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_5(id0);
  }

  private native byte[] GetName_6();
  public String GetName()
  {
    return new String(GetName_6(), StandardCharsets.UTF_8);
  }

  private native byte[] GetLocation_7();
  public String GetLocation()
  {
    return new String(GetLocation_7(), StandardCharsets.UTF_8);
  }

  private native void ShallowCopy_8(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_8(id0,id1);
  }

  private native void DeepCopy_9(vtkInformation id0,vtkInformation id1);
  public void DeepCopy(vtkInformation id0,vtkInformation id1)
  {
    DeepCopy_9(id0,id1);
  }

  private native int Has_10(vtkInformation id0);
  public int Has(vtkInformation id0)
  {
    return Has_10(id0);
  }

  private native void Remove_11(vtkInformation id0);
  public void Remove(vtkInformation id0)
  {
    Remove_11(id0);
  }

  private native void Report_12(vtkInformation id0,vtkGarbageCollector id1);
  public void Report(vtkInformation id0,vtkGarbageCollector id1)
  {
    Report_12(id0,id1);
  }

  private native void Print_13(vtkInformation id0);
  public void Print(vtkInformation id0)
  {
    Print_13(id0);
  }

  private native boolean NeedToExecute_14(vtkInformation id0,vtkInformation id1);
  public boolean NeedToExecute(vtkInformation id0,vtkInformation id1)
  {
    return NeedToExecute_14(id0,id1);
  }

  private native void StoreMetaData_15(vtkInformation id0,vtkInformation id1,vtkInformation id2);
  public void StoreMetaData(vtkInformation id0,vtkInformation id1,vtkInformation id2)
  {
    StoreMetaData_15(id0,id1,id2);
  }

  private native void CopyDefaultInformation_16(vtkInformation id0,vtkInformation id1,vtkInformation id2);
  public void CopyDefaultInformation(vtkInformation id0,vtkInformation id1,vtkInformation id2)
  {
    CopyDefaultInformation_16(id0,id1,id2);
  }

  public vtkInformationKey() { super(); }

  public vtkInformationKey(long id) { super(id); }

}
