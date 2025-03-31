// java wrapper for vtkPointSet object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkPointSet extends vtkDataSet
{

  private native long ExtendedNew_0();
  public vtkPointSet ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkPointSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native void SetEditable_6(boolean id0);
  public void SetEditable(boolean id0)
  {
    SetEditable_6(id0);
  }

  private native boolean GetEditable_7();
  public boolean GetEditable()
  {
    return GetEditable_7();
  }

  private native void EditableOn_8();
  public void EditableOn()
  {
    EditableOn_8();
  }

  private native void EditableOff_9();
  public void EditableOff()
  {
    EditableOff_9();
  }

  private native void Initialize_10();
  public void Initialize()
  {
    Initialize_10();
  }

  private native void CopyStructure_11(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_11(id0);
  }

  private native long GetNumberOfPoints_12();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_12();
  }

  private native void GetPoint_13(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_13(id0,id1);
  }

  private native long FindPoint_14(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_14(id0);
  }

  private native long FindPoint_15(double id0,double id1,double id2);
  public long FindPoint(double id0,double id1,double id2)
  {
    return FindPoint_15(id0,id1,id2);
  }

  private native long GetNumberOfCells_16();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_16();
  }

  private native int GetMaxCellSize_17();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_17();
  }

  private native long GetCell_18(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_18(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCellPoints_19(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_19(id0,id1);
  }

  private native void GetPointCells_20(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_20(id0,id1);
  }

  private native void GetCell_21(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_21(id0,id1);
  }

  private native int GetCellType_22(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_22(id0);
  }

  private native long GetCellSize_23(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_23(id0);
  }

  private native double[] GetPoint_24(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_24(id0);
  }

  private native long NewCellIterator_25();
  public vtkCellIterator NewCellIterator()
  {
    long temp = NewCellIterator_25();

    if (temp == 0) return null;
    return (vtkCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildPointLocator_26();
  public void BuildPointLocator()
  {
    BuildPointLocator_26();
  }

  private native void BuildLocator_27();
  public void BuildLocator()
  {
    BuildLocator_27();
  }

  private native void BuildCellLocator_28();
  public void BuildCellLocator()
  {
    BuildCellLocator_28();
  }

  private native void SetPointLocator_29(vtkAbstractPointLocator id0);
  public void SetPointLocator(vtkAbstractPointLocator id0)
  {
    SetPointLocator_29(id0);
  }

  private native long GetPointLocator_30();
  public vtkAbstractPointLocator GetPointLocator()
  {
    long temp = GetPointLocator_30();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellLocator_31(vtkAbstractCellLocator id0);
  public void SetCellLocator(vtkAbstractCellLocator id0)
  {
    SetCellLocator_31(id0);
  }

  private native long GetCellLocator_32();
  public vtkAbstractCellLocator GetCellLocator()
  {
    long temp = GetCellLocator_32();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_33();
  public long GetMTime()
  {
    return GetMTime_33();
  }

  private native void ComputeBounds_34();
  public void ComputeBounds()
  {
    ComputeBounds_34();
  }

  private native void Squeeze_35();
  public void Squeeze()
  {
    Squeeze_35();
  }

  private native void SetPoints_36(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_36(id0);
  }

  private native long GetPoints_37();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_37();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActualMemorySize_38();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_38();
  }

  private native void ShallowCopy_39(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_39(id0);
  }

  private native void DeepCopy_40(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_40(id0);
  }

  private native boolean UsesGarbageCollector_41();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_41();
  }

  private native long GetData_42(vtkInformation id0);
  public vtkPointSet GetData(vtkInformation id0)
  {
    long temp = GetData_42(id0);

    if (temp == 0) return null;
    return (vtkPointSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_43(vtkInformationVector id0,int id1);
  public vtkPointSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_43(id0,id1);

    if (temp == 0) return null;
    return (vtkPointSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_44(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_44(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPointSet() { super(); }

  public vtkPointSet(long id) { super(id); }
  public native long   VTKInit();

}
