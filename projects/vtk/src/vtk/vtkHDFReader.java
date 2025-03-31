// java wrapper for vtkHDFReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHDFReader extends vtkDataObjectAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_6(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_6(bytes0, bytes0.length);
  }

  private native long GetOutputAsDataSet_7();
  public vtkDataSet GetOutputAsDataSet()
  {
    long temp = GetOutputAsDataSet_7();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputAsDataSet_8(int id0);
  public vtkDataSet GetOutputAsDataSet(int id0)
  {
    long temp = GetOutputAsDataSet_8(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_9();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_9();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_10();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_10();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldDataArraySelection_11();
  public vtkDataArraySelection GetFieldDataArraySelection()
  {
    long temp = GetFieldDataArraySelection_11();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_12();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_12();
  }

  private native int GetNumberOfCellArrays_13();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_13();
  }

  private native byte[] GetPointArrayName_14(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_14(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_15(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_15(id0), StandardCharsets.UTF_8);
  }

  private native boolean GetHasTransientData_16();
  public boolean GetHasTransientData()
  {
    return GetHasTransientData_16();
  }

  private native long GetNumberOfSteps_17();
  public long GetNumberOfSteps()
  {
    return GetNumberOfSteps_17();
  }

  private native long GetStep_18();
  public long GetStep()
  {
    return GetStep_18();
  }

  private native void SetStep_19(long id0);
  public void SetStep(long id0)
  {
    SetStep_19(id0);
  }

  private native double GetTimeValue_20();
  public double GetTimeValue()
  {
    return GetTimeValue_20();
  }

  private native boolean GetUseCache_21();
  public boolean GetUseCache()
  {
    return GetUseCache_21();
  }

  private native void SetUseCache_22(boolean id0);
  public void SetUseCache(boolean id0)
  {
    SetUseCache_22(id0);
  }

  private native void UseCacheOn_23();
  public void UseCacheOn()
  {
    UseCacheOn_23();
  }

  private native void UseCacheOff_24();
  public void UseCacheOff()
  {
    UseCacheOff_24();
  }

  private native boolean GetMergeParts_25();
  public boolean GetMergeParts()
  {
    return GetMergeParts_25();
  }

  private native void SetMergeParts_26(boolean id0);
  public void SetMergeParts(boolean id0)
  {
    SetMergeParts_26(id0);
  }

  private native void MergePartsOn_27();
  public void MergePartsOn()
  {
    MergePartsOn_27();
  }

  private native void MergePartsOff_28();
  public void MergePartsOff()
  {
    MergePartsOff_28();
  }

  private native void SetMaximumLevelsToReadByDefaultForAMR_29(int id0);
  public void SetMaximumLevelsToReadByDefaultForAMR(int id0)
  {
    SetMaximumLevelsToReadByDefaultForAMR_29(id0);
  }

  private native int GetMaximumLevelsToReadByDefaultForAMR_30();
  public int GetMaximumLevelsToReadByDefaultForAMR()
  {
    return GetMaximumLevelsToReadByDefaultForAMR_30();
  }

  public vtkHDFReader() { super(); }

  public vtkHDFReader(long id) { super(id); }
  public native long   VTKInit();

}
