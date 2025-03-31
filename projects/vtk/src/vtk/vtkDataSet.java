// java wrapper for vtkDataSet object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkDataSet extends vtkDataObject
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

  private native void CopyStructure_4(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_4(id0);
  }

  private native void CopyAttributes_5(vtkDataSet id0);
  public void CopyAttributes(vtkDataSet id0)
  {
    CopyAttributes_5(id0);
  }

  private native long GetNumberOfPoints_6();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_6();
  }

  private native long GetNumberOfCells_7();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_7();
  }

  private native double[] GetPoint_8(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_8(id0);
  }

  private native void GetPoint_9(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_9(id0,id1);
  }

  private native long NewCellIterator_10();
  public vtkCellIterator NewCellIterator()
  {
    long temp = NewCellIterator_10();

    if (temp == 0) return null;
    return (vtkCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_11(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_11(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_12(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_12(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellOrderAndRationalWeights_13(long id0,vtkGenericCell id1);
  public void SetCellOrderAndRationalWeights(long id0,vtkGenericCell id1)
  {
    SetCellOrderAndRationalWeights_13(id0,id1);
  }

  private native void GetCell_14(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_14(id0,id1);
  }

  private native void GetCellBounds_15(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_15(id0,id1);
  }

  private native int GetCellType_16(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_16(id0);
  }

  private native long GetCellSize_17(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_17(id0);
  }

  private native void GetCellTypes_18(vtkCellTypes id0);
  public void GetCellTypes(vtkCellTypes id0)
  {
    GetCellTypes_18(id0);
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

  private native void GetCellNeighbors_21(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_21(id0,id1,id2);
  }

  private native long FindPoint_22(double id0,double id1,double id2);
  public long FindPoint(double id0,double id1,double id2)
  {
    return FindPoint_22(id0,id1,id2);
  }

  private native long FindPoint_23(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_23(id0);
  }

  private native long GetMTime_24();
  public long GetMTime()
  {
    return GetMTime_24();
  }

  private native long GetCellData_25();
  public vtkCellData GetCellData()
  {
    long temp = GetCellData_25();

    if (temp == 0) return null;
    return (vtkCellData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointData_26();
  public vtkPointData GetPointData()
  {
    long temp = GetPointData_26();

    if (temp == 0) return null;
    return (vtkPointData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Squeeze_27();
  public void Squeeze()
  {
    Squeeze_27();
  }

  private native void ComputeBounds_28();
  public void ComputeBounds()
  {
    ComputeBounds_28();
  }

  private native double[] GetBounds_29();
  public double[] GetBounds()
  {
    return GetBounds_29();
  }

  private native void GetBounds_30(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_30(id0);
  }

  private native double[] GetCenter_31();
  public double[] GetCenter()
  {
    return GetCenter_31();
  }

  private native void GetCenter_32(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_32(id0);
  }

  private native double GetLength_33();
  public double GetLength()
  {
    return GetLength_33();
  }

  private native double GetLength2_34();
  public double GetLength2()
  {
    return GetLength2_34();
  }

  private native void Initialize_35();
  public void Initialize()
  {
    Initialize_35();
  }

  private native void GetScalarRange_36(double id0[]);
  public void GetScalarRange(double id0[])
  {
    GetScalarRange_36(id0);
  }

  private native double[] GetScalarRange_37();
  public double[] GetScalarRange()
  {
    return GetScalarRange_37();
  }

  private native int GetMaxCellSize_38();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_38();
  }

  private native int GetMaxSpatialDimension_39();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_39();
  }

  private native long GetActualMemorySize_40();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_40();
  }

  private native int GetDataObjectType_41();
  public int GetDataObjectType()
  {
    return GetDataObjectType_41();
  }

  private native void ShallowCopy_42(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_42(id0);
  }

  private native void DeepCopy_43(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_43(id0);
  }

  private native int CheckAttributes_44();
  public int CheckAttributes()
  {
    return CheckAttributes_44();
  }

  private native void GenerateGhostArray_45(int id0[]);
  public void GenerateGhostArray(int id0[])
  {
    GenerateGhostArray_45(id0);
  }

  private native void GenerateGhostArray_46(int id0[],boolean id1);
  public void GenerateGhostArray(int id0[],boolean id1)
  {
    GenerateGhostArray_46(id0,id1);
  }

  private native long GetData_47(vtkInformation id0);
  public vtkDataSet GetData(vtkInformation id0)
  {
    long temp = GetData_47(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_48(vtkInformationVector id0,int id1);
  public vtkDataSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_48(id0,id1);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAttributesAsFieldData_49(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_49(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfElements_50(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_50(id0);
  }

  private native boolean HasAnyGhostCells_51();
  public boolean HasAnyGhostCells()
  {
    return HasAnyGhostCells_51();
  }

  private native boolean HasAnyGhostPoints_52();
  public boolean HasAnyGhostPoints()
  {
    return HasAnyGhostPoints_52();
  }

  private native boolean HasAnyBlankCells_53();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_53();
  }

  private native boolean HasAnyBlankPoints_54();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_54();
  }

  private native long GetPointGhostArray_55();
  public vtkUnsignedCharArray GetPointGhostArray()
  {
    long temp = GetPointGhostArray_55();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdatePointGhostArrayCache_56();
  public void UpdatePointGhostArrayCache()
  {
    UpdatePointGhostArrayCache_56();
  }

  private native long AllocatePointGhostArray_57();
  public vtkUnsignedCharArray AllocatePointGhostArray()
  {
    long temp = AllocatePointGhostArray_57();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellGhostArray_58();
  public vtkUnsignedCharArray GetCellGhostArray()
  {
    long temp = GetCellGhostArray_58();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateCellGhostArrayCache_59();
  public void UpdateCellGhostArrayCache()
  {
    UpdateCellGhostArrayCache_59();
  }

  private native long AllocateCellGhostArray_60();
  public vtkUnsignedCharArray AllocateCellGhostArray()
  {
    long temp = AllocateCellGhostArray_60();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostArray_61(int id0);
  public vtkUnsignedCharArray GetGhostArray(int id0)
  {
    long temp = GetGhostArray_61(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SupportsGhostArray_62(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_62(id0);
  }

  public vtkDataSet() { super(); }

  public vtkDataSet(long id) { super(id); }

}
