// java wrapper for vtkStructuredGrid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkStructuredGrid extends vtkPointSet
{

  private native long ExtendedNew_0();
  public vtkStructuredGrid ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void CopyStructure_6(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_6(id0);
  }

  private native long GetNumberOfPoints_7();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_7();
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

  private native long GetCell_10(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_10(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_11(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_11(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_12(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_12(id0,id1);
  }

  private native void GetCellBounds_13(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_13(id0,id1);
  }

  private native int GetCellType_14(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_14(id0);
  }

  private native long GetCellSize_15(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_15(id0);
  }

  private native long GetNumberOfCells_16();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_16();
  }

  private native void GetCellPoints_17(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_17(id0,id1);
  }

  private native void GetPointCells_18(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_18(id0,id1);
  }

  private native void Initialize_19();
  public void Initialize()
  {
    Initialize_19();
  }

  private native int GetMaxCellSize_20();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_20();
  }

  private native int GetMaxSpatialDimension_21();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_21();
  }

  private native void GetCellNeighbors_22(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_22(id0,id1,id2);
  }

  private native void SetDimensions_23(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_23(id0,id1,id2);
  }

  private native void SetDimensions_24(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_24(id0);
  }

  private native int[] GetDimensions_25();
  public int[] GetDimensions()
  {
    return GetDimensions_25();
  }

  private native void GetDimensions_26(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_26(id0);
  }

  private native int GetDataDimension_27();
  public int GetDataDimension()
  {
    return GetDataDimension_27();
  }

  private native void SetExtent_28(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_28(id0);
  }

  private native void SetExtent_29(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_29(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_30();
  public int[] GetExtent()
  {
    return GetExtent_30();
  }

  private native long GetActualMemorySize_31();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_31();
  }

  private native void ShallowCopy_32(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_32(id0);
  }

  private native void DeepCopy_33(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_33(id0);
  }

  private native int GetExtentType_34();
  public int GetExtentType()
  {
    return GetExtentType_34();
  }

  private native void BlankPoint_35(long id0);
  public void BlankPoint(long id0)
  {
    BlankPoint_35(id0);
  }

  private native void UnBlankPoint_36(long id0);
  public void UnBlankPoint(long id0)
  {
    UnBlankPoint_36(id0);
  }

  private native void BlankCell_37(long id0);
  public void BlankCell(long id0)
  {
    BlankCell_37(id0);
  }

  private native void UnBlankCell_38(long id0);
  public void UnBlankCell(long id0)
  {
    UnBlankCell_38(id0);
  }

  private native byte IsPointVisible_39(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_39(id0);
  }

  private native byte IsCellVisible_40(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_40(id0);
  }

  private native boolean HasAnyBlankPoints_41();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_41();
  }

  private native boolean HasAnyBlankCells_42();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_42();
  }

  private native void GetCellDims_43(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_43(id0);
  }

  private native long GetData_44(vtkInformation id0);
  public vtkStructuredGrid GetData(vtkInformation id0)
  {
    long temp = GetData_44(id0);

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_45(vtkInformationVector id0,int id1);
  public vtkStructuredGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_45(id0,id1);

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetPoint_46(int id0,int id1,int id2,double id3[],boolean id4);
  public void GetPoint(int id0,int id1,int id2,double id3[],boolean id4)
  {
    GetPoint_46(id0,id1,id2,id3,id4);
  }

  public vtkStructuredGrid() { super(); }

  public vtkStructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
